package com.example.myinfobook.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myinfobook.Fragments.FragmentFrance;
import com.example.myinfobook.Fragments.FragmentInd;
import com.example.myinfobook.Fragments.FragmentUk;
import com.example.myinfobook.Fragments.FragmentUsa;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();

        switch(position)
        {
            case 0:
                FragmentInd fragmentInd = new FragmentInd();
                fragment = fragmentInd.newInstance();
                break;
            case 1:
                FragmentUsa fragmentUsa = new FragmentUsa();
                fragment = fragmentUsa.newInstance();
                break;
            case 2:
                FragmentUk fragmentUk = new FragmentUk();
                fragment = fragmentUk.newInstance();
                break;
            case 3:
                FragmentFrance fragmentFrance = new FragmentFrance();
                fragment = fragmentFrance.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
