package com.example.myinfobook.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myinfobook.Fragments.FragmentChichen;
import com.example.myinfobook.Fragments.FragmentChrist;
import com.example.myinfobook.Fragments.FragmentColosseum;
import com.example.myinfobook.Fragments.FragmentCricket;
import com.example.myinfobook.Fragments.FragmentFootball;
import com.example.myinfobook.Fragments.FragmentGWC;
import com.example.myinfobook.Fragments.FragmentHockey;
import com.example.myinfobook.Fragments.FragmentMachu;
import com.example.myinfobook.Fragments.FragmentPetra;
import com.example.myinfobook.Fragments.FragmentTajMahal;
import com.example.myinfobook.Fragments.FragmentTennis;

public class ViewPagerAdapterSports extends FragmentStateAdapter {
    public ViewPagerAdapterSports(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();

        switch(position)
        {
            case 0:
                FragmentCricket fragmentCricket = new FragmentCricket();
                fragment = fragmentCricket.newInstance();
                break;
            case 1:
                FragmentFootball fragmentFootball = new FragmentFootball();
                fragment = fragmentFootball.newInstance();
                break;
            case 2:
                FragmentHockey fragmentHockey = new FragmentHockey();
                fragment = fragmentHockey.newInstance();
                break;
            case 3:
                FragmentTennis fragmentTennis = new FragmentTennis();
                fragment = fragmentTennis.newInstance();
                break;
//
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
