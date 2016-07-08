package com.example.id2013_03.android_app.TABS;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.MAIN.Spec_MoreInfo;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.MAIN.SpecificationMain;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Main class for this section
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class Specification extends Fragment {
    VerticalViewPager viewPager;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.specification, container, false);
        setRetainInstance(true);

        System.gc();


        viewPager = (VerticalViewPager) rootView.findViewById(R.id.vert_view_spec);
        viewPager.setAdapter(new CustomAdapter(getActivity().getSupportFragmentManager(), getActivity().getApplicationContext()));



        return rootView;

    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"", ""};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new SpecificationMain();
                case 1:
                    return new Spec_MoreInfo();
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

