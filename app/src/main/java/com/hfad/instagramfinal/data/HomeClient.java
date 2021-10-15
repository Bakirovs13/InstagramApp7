package com.hfad.instagramfinal.data;

import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.model.Post;

import java.util.ArrayList;

public class HomeClient {

    private ArrayList<Post> list = new ArrayList<>();


    public ArrayList<Post> getList() {
     list.add(new Post("Hello ! follow me: @shodim.bishkek", R.drawable.ic_bishkek,"hello","bishkek"));
     list.add(new Post("Hello ! follow me: @shodim.bishkek", R.drawable.ic_bishkek,"hello","shodim.bishkek"));
     list.add(new Post("Hello ! follow me: @shodim.bishkek", R.drawable.ic_bishkek,"hello","shodim.bishkek"));
     list.add(new Post("Hello ! follow me: @shodim.bishkek", R.drawable.ic_bishkek,"hello","shodim.bishkek"));

        return list;
    }


}
