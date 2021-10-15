package com.hfad.instagramfinal.ui.activities;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.hfad.instagramfinal.ui.fragments.profileFragment.ProfileFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> list = new ArrayList<>();

    public void setList(ArrayList<Fragment> list) {

        this.list.addAll(list);
    }

    public ViewPagerAdapter(@NonNull ProfileFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
