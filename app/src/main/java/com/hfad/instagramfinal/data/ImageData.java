package com.hfad.instagramfinal.data;

import com.hfad.instagramfinal.R;

import com.hfad.instagramfinal.model.PostImage;

import java.util.ArrayList;

public class ImageData {
    private ArrayList<PostImage> list = new ArrayList<>();


    public ArrayList<PostImage> getList() {

        list.add(new PostImage(R.drawable.ic_bishkek));
        list.add(new PostImage(R.drawable.ic_bishkek));
        list.add(new PostImage(R.drawable.ic_person_photo));
        list.add(new PostImage(R.drawable.ic_bishkek));
        list.add(new PostImage(R.drawable.ic_person_photo));
        list.add(new PostImage(R.drawable.ic_bishkek));
        list.add(new PostImage(R.drawable.ic_bishkek));

        return list;
    }

}
