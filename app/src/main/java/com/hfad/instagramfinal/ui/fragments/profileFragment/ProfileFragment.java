package com.hfad.instagramfinal.ui.fragments.profileFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayoutMediator;
import com.hfad.instagramfinal.R;
import com.hfad.instagramfinal.data.HomeClient;
import com.hfad.instagramfinal.data.ImageData;
import com.hfad.instagramfinal.data.ImageData2;
import com.hfad.instagramfinal.databinding.FragmentHomeBinding;
import com.hfad.instagramfinal.databinding.FragmentProfileBinding;
import com.hfad.instagramfinal.model.PostImage;
import com.hfad.instagramfinal.ui.SavedImagesFragment;
import com.hfad.instagramfinal.ui.activities.ViewPagerAdapter;
import com.hfad.instagramfinal.ui.fragments.HomeFragment.HomeAdapter;
import com.hfad.instagramfinal.ui.fragments.PersonImagesFragment;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class ProfileFragment extends Fragment {


    private ArrayList<Fragment> list;
    private ViewPagerAdapter adapter;
    private FragmentProfileBinding binding;
//    private PhofileAdapter Profilewadapter = new PhofileAdapter();
    private int[] tabIcons = {
            R.drawable.ic_baseline_view_module,
            R.drawable.ic_baseline_assignment
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViewPager();
    }

    private void initViewPager() {
        adapter = new ViewPagerAdapter(this);  //init adapter
        adapter.setList(getList());                           //send list
        binding.mainViewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.mainTabs, binding.mainViewPager, (tab, position) -> {

            tab.setIcon(tabIcons[position]);


        }).attach();

    }

    private ArrayList<Fragment> getList() {    //method to fill list
        list = new ArrayList<>();
        list.add(new PersonImagesFragment());
        list.add(new SavedImagesFragment());


        return list;
    }

}