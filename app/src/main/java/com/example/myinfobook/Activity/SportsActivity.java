package com.example.myinfobook.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.myinfobook.Adapters.ViewPagerAdapter;
import com.example.myinfobook.Adapters.ViewPagerAdapterSports;
import com.example.myinfobook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class SportsActivity extends AppCompatActivity {

    TabLayout tabLayoutSports;
    ViewPager2 viewPagerSports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        tabLayoutSports = findViewById(R.id.tabLayoutSports);
        viewPagerSports = findViewById(R.id.viewPagerSports);

        ViewPagerAdapterSports adapter = new ViewPagerAdapterSports(getSupportFragmentManager(),getLifecycle());
        viewPagerSports.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator =new TabLayoutMediator(tabLayoutSports, viewPagerSports, true, true,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                        switch(position)
                        {
                            case 0:
                                tab.setText("Cricket");
                                break;
                            case 1:
                                tab.setText("FootBall");
                                break;
                            case 2:
                                tab.setText("Hockey");
                                break;
                            case 3:
                                tab.setText("Tennis");
                                break;
                        }
                    }
                });

        tabLayoutMediator.attach();
    }
}