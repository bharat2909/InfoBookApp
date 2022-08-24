package com.example.myinfobook.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.myinfobook.Adapters.ViewPagerAdapterMuseums;
import com.example.myinfobook.Adapters.ViewPagerAdapterSports;
import com.example.myinfobook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MuseumsActivity extends AppCompatActivity {

    TabLayout tabLayoutMuseum;
    ViewPager2 viewPagerMuseum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        tabLayoutMuseum = findViewById(R.id.tabLayoutMuseum);
        viewPagerMuseum = findViewById(R.id.viewPagerMuseum);

        ViewPagerAdapterMuseums adapter = new ViewPagerAdapterMuseums(getSupportFragmentManager(),getLifecycle());
        viewPagerMuseum.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator =new TabLayoutMediator(tabLayoutMuseum, viewPagerMuseum, true, true,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                        switch(position)
                        {
                            case 0:
                                tab.setText("The State Heritage");
                                break;
                            case 1:
                                tab.setText("Le musée du Louvre");
                                break;
                            case 2:
                                tab.setText("National Museum of China");
                                break;

                        }
                    }
                });

        tabLayoutMediator.attach();
    }
}