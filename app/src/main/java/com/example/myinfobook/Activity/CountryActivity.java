package com.example.myinfobook.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.myinfobook.R;
import com.example.myinfobook.Adapters.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountryActivity extends AppCompatActivity {

    TabLayout tabLayoutCountry;
    ViewPager2 viewPagerCountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        tabLayoutCountry = findViewById(R.id.tabLayoutCountry);
        viewPagerCountry = findViewById(R.id.viewPagerCountry);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPagerCountry.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator =new TabLayoutMediator(tabLayoutCountry, viewPagerCountry, true, true,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                        switch(position)
                        {
                            case 0:
                                tab.setText("India");
                                break;
                            case 1:
                                tab.setText("USA");
                                break;
                            case 2:
                                tab.setText("UK");
                                break;
                            case 3:
                                tab.setText("France");
                                break;
                        }
                    }
                });

        tabLayoutMediator.attach();

    }
}