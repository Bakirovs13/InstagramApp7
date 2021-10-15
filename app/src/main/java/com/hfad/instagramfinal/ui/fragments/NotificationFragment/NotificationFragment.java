package com.hfad.instagramfinal.ui.fragments.NotificationFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.data.HomeClient;
import com.hfad.instagramfinal.data.NotificationData;
import com.hfad.instagramfinal.databinding.FragmentHomeBinding;
import com.hfad.instagramfinal.databinding.FragmentNotificationBinding;
import com.hfad.instagramfinal.model.Post;
import com.hfad.instagramfinal.ui.fragments.HomeFragment.HomeAdapter;

import java.util.ArrayList;


public class NotificationFragment extends Fragment {

    private FragmentNotificationBinding binding;
    private RecyclerView notifyRecycle;
    private NotificationAdapter notificationAdapter = new NotificationAdapter();
    private NotificationData notificationData;;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentNotificationBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
    }

    private void initRecycler() {
        notificationData = new NotificationData();
        notificationAdapter.setList(notificationData.getList());
        binding.NotifyRecyclerView.setAdapter(notificationAdapter);
    }
}