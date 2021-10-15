package com.hfad.instagramfinal.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.data.ImageData;
import com.hfad.instagramfinal.data.ImageData2;
import com.hfad.instagramfinal.databinding.FragmentNotificationBinding;
import com.hfad.instagramfinal.databinding.FragmentPersonImagesBinding;
import com.hfad.instagramfinal.databinding.FragmentProfileBinding;
import com.hfad.instagramfinal.ui.fragments.profileFragment.PersonImagesAdapter;
import com.hfad.instagramfinal.ui.fragments.profileFragment.PhofileAdapter;


public class PersonImagesFragment extends Fragment {


    FragmentPersonImagesBinding binding;
    TableLayout tableLayout;
    private RecyclerView recyclerView;
    private PersonImagesAdapter adapter = new PersonImagesAdapter();
    private ImageData imageData;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =  FragmentPersonImagesBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();


    }

    private void initRecycler() {

        imageData = new ImageData();
        adapter.setPostList(imageData.getList());
        binding.recuclerViewPictures.setAdapter(adapter);

    }
}