package com.hfad.instagramfinal.ui.fragments.NotificationFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.model.Notification;
import com.hfad.instagramfinal.model.Post;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder>{

    private ArrayList<Notification> notificationArrayList;


    public void setList(ArrayList<Notification> list) {
        this.notificationArrayList = new ArrayList<>();
        this.notificationArrayList.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item, parent, false);
        return new NotificationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Notification notification = notificationArrayList.get(position);
        Picasso.get().load(notification.getImageurl()).into(holder.imageProfile);
        holder.username.setText(notification.getUserName());


    }

    @Override
    public int getItemCount() {
        return notificationArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageProfile;
        public ImageView postImage;
        public TextView username;
        public TextView comment;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageProfile = itemView.findViewById(R.id.image_profile);
            postImage = itemView.findViewById(R.id.post_image);
            username = itemView.findViewById(R.id.username);
            comment = itemView.findViewById(R.id.comment);



        }
    }
}
