package com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_PROGRAMMES;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.TABS.POPUP_Base;

import static android.view.Gravity.BOTTOM;

public class Mso_Programmes_Popup extends POPUP_Base implements SensorEventListener {

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView closeProgrammes;

    SensorManager msensorManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programmes_popup_main);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .975));

        getWindow().setGravity(BOTTOM);

        closeProgrammes = (ImageView)findViewById(R.id.closeProgrammes);
        closeProgrammes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.gc();
                getSupportFragmentManager().popBackStack();
                closeContextMenu();
                closeOptionsMenu();
                finishActivity(this.hashCode());
            }
        });

        viewPager = (ViewPager) findViewById(R.id.exclusivity_programmes_pop_View);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        viewPager.setOffscreenPageLimit(5);

        tabLayout = (TabLayout) findViewById(R.id.exclusivity_programmes_pop_Tabs);
        tabLayout.setupWithViewPager(viewPager);

        msensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        Sensor light = msensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        msensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL);

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

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"Introduction", "World Class 1-To-1 Tuition", "Formula 1 Simulator Training", "Bespoke Fitness Programme", "Dedicated Track Preparation"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    System.gc();
                    return new Introduction_Programmes();
                case 1:
                    System.gc();
                    return new World_Class();
                case 2:
                    System.gc();
                    return new Simulator_Training();
                case 3:
                    System.gc();
                    return new Fitness_Programme();
                case 4:
                    System.gc();
                    return new Dedicated_Track_Preperation();
                default:
                    System.gc();
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

    @Override
    protected void onDestroy(){
        msensorManager.unregisterListener(this);
        super.onDestroy();

    }
}
