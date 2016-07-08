package com.example.id2013_03.android_app.TABS;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.id2013_03.android_app.Exclusivity_TABS.MAIN.CustomViewPager;
import com.example.id2013_03.android_app.Exclusivity_TABS.MAIN.ExclusivityMain;
import com.example.id2013_03.android_app.Exclusivity_TABS.MAIN.FactoryHandovers;
import com.example.id2013_03.android_app.Exclusivity_TABS.MAIN.GrandReveal;
import com.example.id2013_03.android_app.Exclusivity_TABS.MAIN.MSO;
import com.example.id2013_03.android_app.Exclusivity_TABS.MAIN.MclarenF1;
import com.example.id2013_03.android_app.R;


public class Exclusivity extends Fragment {
    CustomViewPager viewPager;




    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.exclusivity, container, false);
        setRetainInstance(true);

        System.gc();


        viewPager = (CustomViewPager)rootView.findViewById(R.id.vert_view);
        viewPager.setAdapter(new CustomAdapter(getActivity().getSupportFragmentManager(), getActivity().getApplicationContext()));


        return rootView;

    }

//
    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"", "", "", "", ""};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ExclusivityMain();
                case 1:
                    return new MSO();
                case 2:
                    return new MclarenF1();
                case 3:
                    return new FactoryHandovers();
                case 4:
                    return new GrandReveal();
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
