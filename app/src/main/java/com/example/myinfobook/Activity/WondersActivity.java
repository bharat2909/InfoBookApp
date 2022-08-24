package com.example.myinfobook.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.myinfobook.Adapters.ViewPagerAdapter;
import com.example.myinfobook.Adapters.ViewPagerAdapterWonders;
import com.example.myinfobook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {

    TabLayout tabLayoutWonders;
    ViewPager2 viewPagerWonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tabLayoutWonders = findViewById(R.id.tabLayoutWonders);
        viewPagerWonders = findViewById(R.id.viewPagerWonders);

        ViewPagerAdapterWonders adapter = new ViewPagerAdapterWonders(getSupportFragmentManager(),getLifecycle());
        viewPagerWonders.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator =new TabLayoutMediator(tabLayoutWonders
                , viewPagerWonders, true, true,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                        switch(position)
                        {
                            case 0:
                                tab.setText("Taj Mahal");
                                break;
                            case 1:
                                tab.setText("Colosseum");
                                break;
                            case 2:
                                tab.setText("Petra");
                                break;
                            case 3:
                                tab.setText("Great Wall of China");
                                break;
                            case 4:
                                tab.setText("Chichen Itza");
                                break;
                            case 5:
                                tab.setText("Machu Picchu");
                                break;
                            case 6:
                                tab.setText("Christ the Redeemer");
                                break;
                        }
                    }
                });

        tabLayoutMediator.attach();
    }
}