package com.hfad.instagramfinal.ui.fragments.HomeFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hendraanggrian.appcompat.widget.SocialTextView;
import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<Post> list;



    public void setList(ArrayList<Post> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false);
        return new HomeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Post post = list.get(position);
        Picasso.get().load(post.getImageurl()).into(holder.postImage);
        holder.description.setText(post.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageProfile;
        public ImageView postImage;
        public ImageView like;
        public ImageView comment;
        public ImageView save;
        public ImageView more;

        public TextView username;
        public TextView noOfLikes;
        public TextView author;
        public TextView noOfComments;
        SocialTextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageProfile = itemView.findViewById(R.id.image_profile);
            postImage = itemView.findViewById(R.id.post_image);
            like = itemView.findViewById(R.id.like);
            comment = itemView.findViewById(R.id.comment);
            save = itemView.findViewById(R.id.save);
            more = itemView.findViewById(R.id.more);

            username = itemView.findViewById(R.id.username);
            noOfLikes = itemView.findViewById(R.id.no_of_likes);
            author = itemView.findViewById(R.id.author);
            noOfComments = itemView.findViewById(R.id.no_of_comments);
            description = itemView.findViewById(R.id.description);

        }
    }

}
