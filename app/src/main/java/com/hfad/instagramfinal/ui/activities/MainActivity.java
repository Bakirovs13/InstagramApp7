package com.hfad.instagramfinal.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.databinding.ActivityMainBinding;
import com.hfad.instagramfinal.model.Post;
import com.hfad.instagramfinal.ui.fragments.HomeFragment.HomeFragment;
import com.hfad.instagramfinal.ui.fragments.NotificationFragment.NotificationFragment;
import com.hfad.instagramfinal.ui.fragments.profileFragment.ProfileFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Fragment>list;
    private ArrayList<Post> posts;
//    private NavController navController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        NavController navController = Navigation.findNavController(this,R.id.fragment_container);
        NavigationUI.setupWithNavController(binding.bottomNav, navController);

//        initBottomNav();
       // initViewPager();

    }



    private void initBottomNav() {

//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
       /* binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_nav:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, new HomeFragment()).commit();
                        break;

                    case R.id.like_nav:

                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, new NotificationFragment()).commit();
                        break;
                    case R.id.account_nav:

                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, new ProfileFragment()).commit();
                        break;
                }
                return true;
            }
        });*/
    }






//    private void initViewPager() {
//        adapter = new ViewPagerAdapter(this);  //init adapter
//        adapter.setList(getList());                           //send list
//        binding.mainViewPager.setAdapter(adapter);
//
//    }




//    private ArrayList<Fragment> getList(){    //method to fill list
//        list = new ArrayList<>();
//        list.add(new HomeFragment());
//        list.add(new NotificationFragment());
//        list.add(new ProfileFragment());
//
//
//        return list;
//    }

}