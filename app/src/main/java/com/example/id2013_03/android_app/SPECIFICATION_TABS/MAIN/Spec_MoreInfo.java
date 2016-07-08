package com.example.id2013_03.android_app.SPECIFICATION_TABS.MAIN;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.bumptech.glide.Glide;
import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Performance_Data.Braking;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Performance_Data.Efficiency;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Technical_Specification.Body;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Technical_Specification.Brakes;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Performance_Data.Acceleration;
import com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Technical_Specification.Powertrain;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Main class for this section
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class Spec_MoreInfo extends Fragment {

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                Variables used throughout this page of code
     ---------------------------------------------------------------------------------------------------------------------------
*/
    VerticalViewPager verticalViewPager;
    ViewPager viewPager;

    NestedScrollView childSV;

    ImageView moreButton;
    ImageView spec_backImg;
    ImageView toTop;

    RadioButton technical_rad;
    RadioButton performance_rad;
    RadioButton efficiency_rad;
    RadioButton equipment_rad;
    RadioButton rrp_rad;
    RadioButton options_rad;

    Button technical_btn;
    Button performance_btn;
    Button efficiency_btn;
    Button equipment_btn;
    Button rrp_btn;
    Button options_btn;

    ImageView powertrain_fab;
    ImageView brakes_fab;
    ImageView body_fab;
    ImageView acceleration_fab;
    ImageView braking_fab;
    ImageView efficiency_fab;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.specification_more_info, container, false);

        /*
     ---------------------------------------------------------------------------------------------------------------------------
                                Connecting ALL variables to the correct ID's

                                Make sure the same pallette is used...
                                For example if a variable is Button connect this to (Button)
     ---------------------------------------------------------------------------------------------------------------------------
*/
        verticalViewPager = (VerticalViewPager)getActivity().findViewById(R.id.vert_view_spec);

        viewPager = (ViewPager)getActivity().findViewById(R.id.viewPager);



        childSV = (NestedScrollView) rootView.findViewById(R.id.child_scroll);

        moreButton = (ImageView) rootView.findViewById(R.id.moreBtn);
        spec_backImg = (ImageView) rootView.findViewById(R.id.spec_backImg);
        toTop = (ImageView) rootView.findViewById(R.id.backToTop);

        technical_rad = (RadioButton) rootView.findViewById(R.id.Tech_radio);
        performance_rad = (RadioButton) rootView.findViewById(R.id.Performance_radio);
        efficiency_rad = (RadioButton) rootView.findViewById(R.id.Efficiency_radio);
        equipment_rad = (RadioButton) rootView.findViewById(R.id.Equipment_radio);
        rrp_rad = (RadioButton) rootView.findViewById(R.id.RRP_radio);
        options_rad = (RadioButton) rootView.findViewById(R.id.Options_radio);

        technical_btn = (Button) rootView.findViewById(R.id.Tech_btn);
        performance_btn = (Button) rootView.findViewById(R.id.Performance_btn);
        efficiency_btn = (Button) rootView.findViewById(R.id.Efficiency_btn);
        equipment_btn = (Button) rootView.findViewById(R.id.Equipment_btn);
        rrp_btn = (Button) rootView.findViewById(R.id.RRP_btn);
        options_btn = (Button) rootView.findViewById(R.id.Options_btn);

        powertrain_fab = (ImageView) rootView.findViewById(R.id.powertrain_fab);
        brakes_fab = (ImageView) rootView.findViewById(R.id.brakes_fab);
        body_fab = (ImageView) rootView.findViewById(R.id.body_fab);
        acceleration_fab = (ImageView) rootView.findViewById(R.id.acceleration_fab);
        braking_fab = (ImageView) rootView.findViewById(R.id.braking_fab);
        efficiency_fab = (ImageView) rootView.findViewById(R.id.efficiency_fab);


        ImageView specUnderMenu = (ImageView)rootView.findViewById(R.id.under_side_menu);
        Glide.with(this)
                .load(R.drawable.tech_under_side_menu)

                .into(specUnderMenu);



        /*
     ---------------------------------------------------------------------------------------------------------------------------
                                On click listener for the powertrain_fab button
                                Button takes you to a new activity ** Powertrain **

                                This activity is a popupwindow that is placed over
                                the main view.
     ---------------------------------------------------------------------------------------------------------------------------
*/
        powertrain_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Powertrain.class);
                startActivity(i);
            }
        });


/*
     ---------------------------------------------------------------------------------------------------------------------------
                                On click listener for the brakes button
                                Button takes you to a new activity ** Brakes **

                                This activity is a popupwindow that is placed over
                                the main view.
     ---------------------------------------------------------------------------------------------------------------------------
*/

        brakes_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Open pop up window
                System.gc();
                Intent i = new Intent(getActivity(), Brakes.class);
                startActivity(i);


            }
        });
/*
     ---------------------------------------------------------------------------------------------------------------------------
                                     Buttons that are not yet implemented...

                                This buttons simply display a message to the users
     ---------------------------------------------------------------------------------------------------------------------------
*/

        body_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Pop up window
                System.gc();
                Intent i = new Intent(getActivity(), Body.class);
                startActivity(i);
            }
        });

        acceleration_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open pop up window
                System.gc();
                Intent i = new Intent(getActivity(), Acceleration.class);
                startActivity(i);
            }
        });

        braking_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open pop up window
                System.gc();
                Intent i = new Intent(getActivity(), Braking.class);
                startActivity(i);
            }
        });
        efficiency_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Efficiency.class);
                startActivity(i);
            }
        });

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                                Setup for nested scrollView

                                    When the users are scrolling through the radio buttons
                                  change depending on what section they are scrolling through
     ---------------------------------------------------------------------------------------------------------------------------
*/
        childSV.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                int scrollY = childSV.getScrollY();

                if (scrollY >= 0 && (scrollY < 1050)) {
                    technical_rad.setChecked(true);
                    performance_rad.setChecked(false);
                    efficiency_rad.setChecked(false);
                    equipment_rad.setChecked(false);
                    rrp_rad.setChecked(false);
                    options_rad.setChecked(false);

                }

                if (scrollY >= 1050 && (scrollY < 1600)) {
                    technical_rad.setChecked(false);
                    performance_rad.setChecked(true);
                    efficiency_rad.setChecked(false);
                    equipment_rad.setChecked(false);
                    rrp_rad.setChecked(false);
                    options_rad.setChecked(false);
                }

                if (scrollY >= 1600 && (scrollY < 2000)) {
                    technical_rad.setChecked(false);
                    performance_rad.setChecked(false);
                    efficiency_rad.setChecked(true);
                    equipment_rad.setChecked(false);
                    rrp_rad.setChecked(false);
                    options_rad.setChecked(false);
                }

                if (scrollY >= 2000 && (scrollY < 2960)) {
                    technical_rad.setChecked(false);
                    performance_rad.setChecked(false);
                    efficiency_rad.setChecked(false);
                    equipment_rad.setChecked(true);
                    rrp_rad.setChecked(false);
                    options_rad.setChecked(false);
                }

                if (scrollY >= 2960 && (scrollY < 3200)) {
                    technical_rad.setChecked(false);
                    performance_rad.setChecked(false);
                    efficiency_rad.setChecked(false);
                    equipment_rad.setChecked(false);
                    rrp_rad.setChecked(true);
                    options_rad.setChecked(false);
                }

                if (scrollY >= 3200) {
                    technical_rad.setChecked(false);
                    performance_rad.setChecked(false);
                    efficiency_rad.setChecked(false);
                    equipment_rad.setChecked(false);
                    rrp_rad.setChecked(false);
                    options_rad.setChecked(true);
                }
            }
        });

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                                        Side Menu

                                        Buttons scroll the users to a specific location
     ---------------------------------------------------------------------------------------------------------------------------
*/

        technical_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                childSV.smoothScrollTo(0, 0);
            }
        });

        performance_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                childSV.smoothScrollTo(0, 1228);
            }
        });

        efficiency_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                childSV.smoothScrollTo(0, 1818);
            }
        });

        equipment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                childSV.smoothScrollTo(0, 2190);
            }
        });

        rrp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                childSV.smoothScrollTo(0, 3152);
            }
        });

        options_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                childSV.smoothScrollTo(0, 3490);
            }
        });

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                               Back to top button
                                   (Displayed at the bottom of the nested view)

                                          Scrolls the users back to the top...
                                   Resets the nested scroll View to its original state
     ---------------------------------------------------------------------------------------------------------------------------
*/

        toTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verticalViewPager.setCurrentItem(0);
                childSV.scrollTo(0, 0);
            }
        });



/*
     ---------------------------------------------------------------------------------------------------------------------------
                                               Returning the root view
                                          This allows everything to be shown
     ---------------------------------------------------------------------------------------------------------------------------
*/
        return rootView;
    }
}


