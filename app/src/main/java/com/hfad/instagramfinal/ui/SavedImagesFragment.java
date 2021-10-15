package com.hfad.instagramfinal.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.data.ImageData;
import com.hfad.instagramfinal.data.ImageData2;
import com.hfad.instagramfinal.databinding.FragmentPersonImagesBinding;
import com.hfad.instagramfinal.databinding.FragmentSavedImagesBinding;
import com.hfad.instagramfinal.ui.fragments.profileFragment.PhofileAdapter;


public class SavedImagesFragment extends Fragment {

     FragmentSavedImagesBinding binding;
    private PhofileAdapter adapter = new PhofileAdapter();
    private ImageData2  imageData2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentSavedImagesBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        imageData2 = new ImageData2();
        adapter.setList(imageData2.getList());
        binding.recuclerViewPictures.setAdapter(adapter);
    }
}