package com.hfad.instagramfinal.ui.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.databinding.ActivityCameraBinding;

import java.io.File;

public class CameraActivity extends AppCompatActivity {

    private ActivityCameraBinding binding;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCameraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.setPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }


        });}}
