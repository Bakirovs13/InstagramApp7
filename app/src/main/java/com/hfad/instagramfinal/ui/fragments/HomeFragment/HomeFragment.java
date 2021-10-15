package com.hfad.instagramfinal.ui.fragments.HomeFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.data.HomeClient;
import com.hfad.instagramfinal.databinding.FragmentHomeBinding;
import com.hfad.instagramfinal.ui.activities.CameraActivity;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private RecyclerView recyclerViewPosts;
    private HomeAdapter homeAdapter = new HomeAdapter();
    private HomeClient client;
    private ImageView myPictures;
    private ImageView savedPictures;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
        setListeners();


    }

    private void setListeners() {
        binding.cameraIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireActivity(), CameraActivity.class));
            }
        });
    }


    private void initRecycler() {
        client = new HomeClient();
        homeAdapter.setList(client.getList());
        binding.recyclerViewPosts.setAdapter(homeAdapter);

    }


}