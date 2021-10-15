package com.hfad.instagramfinal.ui.fragments.profileFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.model.Post;
import com.hfad.instagramfinal.model.PostImage;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PhofileAdapter extends RecyclerView.Adapter<PhofileAdapter.ViewHolder>{

    private List<PostImage> postList;

    public PhofileAdapter() {

    }

    public void setList(List<PostImage> postList) {
        this.postList = new ArrayList<>();
        this.postList.addAll(postList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.picture_item, parent, false);
        return  new PhofileAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final PostImage post = postList.get(position);
        Picasso.get().load(post.getImageUrl()).placeholder(R.mipmap.ic_launcher).into(holder.postImage);


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView postImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            postImage = itemView.findViewById(R.id.post_image);
        }
    }
}
