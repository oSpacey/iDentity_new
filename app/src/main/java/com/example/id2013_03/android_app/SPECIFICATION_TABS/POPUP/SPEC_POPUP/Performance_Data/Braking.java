package com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Performance_Data;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.id2013_03.android_app.R;

import com.example.id2013_03.android_app.TABS.POPUP_Base;

import static android.view.Gravity.BOTTOM;

public class Braking extends POPUP_Base {

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView closeSpecMain;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spec_main_tabs);



        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .975));

        getWindow().setGravity(BOTTOM);

        closeSpecMain = (ImageView)findViewById(R.id.closeSpec_MAIN);
        closeSpecMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                finish();
            }
        });




        viewPager = (ViewPager) findViewById(R.id.exclusivity_pop_View);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        viewPager.setOffscreenPageLimit(5);
        viewPager.setCurrentItem(1);

        tabLayout = (TabLayout) findViewById(R.id.exclusivity_pop_Tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                System.gc();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                System.gc();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                System.gc();
            }

        });



    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"Acceleration", "Braking", "Efficiency"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Acceleration_Content();
                case 1:
                    return new Braking_Content();
                case 2:
                    return new Efficiency_Content();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }


    }
}

