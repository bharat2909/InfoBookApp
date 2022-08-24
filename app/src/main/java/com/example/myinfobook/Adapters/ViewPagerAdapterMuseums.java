package com.example.myinfobook.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myinfobook.Fragments.FragmentCricket;
import com.example.myinfobook.Fragments.FragmentFootball;
import com.example.myinfobook.Fragments.FragmentHeritage;
import com.example.myinfobook.Fragments.FragmentHockey;
import com.example.myinfobook.Fragments.FragmentLouvre;
import com.example.myinfobook.Fragments.FragmentNMC;
import com.example.myinfobook.Fragments.FragmentTennis;

public class ViewPagerAdapterMuseums extends FragmentStateAdapter {
    public ViewPagerAdapterMuseums(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();

        switch(position)
        {
            case 0:
                FragmentHeritage fragmentHeritage = new FragmentHeritage();
                fragment = fragmentHeritage.newInstance();
                break;
            case 1:
                FragmentLouvre fragmentLouvre = new FragmentLouvre();
                fragment = fragmentLouvre.newInstance();
                break;
            case 2:
                FragmentNMC fragmentNMC = new FragmentNMC();
                fragment = fragmentNMC.newInstance();
                break;

//
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
