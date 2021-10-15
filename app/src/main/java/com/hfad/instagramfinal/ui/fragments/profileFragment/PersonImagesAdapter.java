package com.hfad.instagramfinal.ui.fragments.profileFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.databinding.FragmentPersonImagesBinding;
import com.hfad.instagramfinal.databinding.PictureItemBinding;
import com.hfad.instagramfinal.model.PostImage;
import com.hfad.instagramfinal.ui.fragments.NotificationFragment.NotificationAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PersonImagesAdapter extends RecyclerView.Adapter<PersonImagesAdapter.ViewHolder> {

    private List<PostImage> postList;



    public void setPostList(List<PostImage> postList) {
        this.postList = new ArrayList<>();
        this.postList.addAll(postList);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PictureItemBinding binding = PictureItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(postList.get(position));

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private  PictureItemBinding binding;


        public ViewHolder(@NonNull PictureItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }


        public void onBind(PostImage postImage) {
            binding.postImage.setImageResource(postImage.getImageUrl());
        }
    }
}
