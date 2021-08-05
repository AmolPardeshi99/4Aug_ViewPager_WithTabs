package com.example.a4aug_viewpager_withtabs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setViewPager();
    }

    private void setViewPager() {
        PagerAdaptor pagerAdaptor = new PagerAdaptor(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(pagerAdaptor);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                    tab.setText("Names"); break;
                    case 1:
                        tab.setText("Places"); break;
                    case 2:
                        tab.setText("Tourist Places"); break;
                }
            }
        }).attach();

    }

    private void initViews() {
        viewPager2 = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
    }
}