package com.example.myinfobook.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myinfobook.Fragments.FragmentChichen;
import com.example.myinfobook.Fragments.FragmentChrist;
import com.example.myinfobook.Fragments.FragmentColosseum;
import com.example.myinfobook.Fragments.FragmentFrance;
import com.example.myinfobook.Fragments.FragmentGWC;
import com.example.myinfobook.Fragments.FragmentInd;
import com.example.myinfobook.Fragments.FragmentMachu;
import com.example.myinfobook.Fragments.FragmentPetra;
import com.example.myinfobook.Fragments.FragmentTajMahal;
import com.example.myinfobook.Fragments.FragmentUk;
import com.example.myinfobook.Fragments.FragmentUsa;

public class ViewPagerAdapterWonders extends FragmentStateAdapter {
    public ViewPagerAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();

        switch(position)
        {
            case 0:
                FragmentTajMahal fragmentTajMahal = new FragmentTajMahal();
                fragment = fragmentTajMahal.newInstance();
                break;
            case 1:
                FragmentColosseum fragmentColosseum = new FragmentColosseum();
                fragment = fragmentColosseum.newInstance();
                break;
            case 2:
                FragmentPetra fragmentPetra = new FragmentPetra();
                fragment = fragmentPetra.newInstance();
                break;
            case 3:
                FragmentGWC fragmentGWC = new FragmentGWC();
                fragment = fragmentGWC.newInstance();
                break;
            case 4:
                FragmentChichen fragmentChichen = new FragmentChichen();
                fragment = fragmentChichen.newInstance();
                break;
            case 5:
                FragmentMachu fragmentMachu = new FragmentMachu();
                fragment = fragmentMachu.newInstance();
                break;
            case 6:
                FragmentChrist fragmentChrist = new FragmentChrist();
                fragment = fragmentChrist.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
