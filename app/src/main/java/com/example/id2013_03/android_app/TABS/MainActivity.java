package com.example.id2013_03.android_app.TABS;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.USER_LOGIN.Login;


import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                             Main class for this section

                                        This extends the custom activity MAIN_Base
                                        which is used to calculate user inactivity
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class MainActivity extends MAIN_Base {

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Variables used throughout this page of code
     ---------------------------------------------------------------------------------------------------------------------------
*/
    ViewPager viewPager;
    VerticalViewPager vertSpec;
    ViewPager vertEx;
    TabLayout tabLayout;

    TextView specTx;
    TextView overTx;
    TextView exclusiveTx;
    TextView heritageTx;
    TextView brochureTx;

    Typeface custom_font;

    ImageView logoBtn;

    /*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Creating the layout for the page
                                The layout hold all the graphical contents

                              Layout for this page --- R.layout.activity_main

                        Here the ID's of the objects that the users will interact with
                      get called. This is so that we can set attributes to the objects so
                     "something" will actually happen when the users interact with the page.
     ---------------------------------------------------------------------------------------------------------------------------
*/
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        System.gc();


/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Finding the text that is displayed for the tabs
                    Once the text if found, the type face of this font is then changed to custom_font

                    custom_font is a variable. This variable has the file path for the font that is used.
                    If you wish to change the font simply change the path, which is the first line below
     ---------------------------------------------------------------------------------------------------------------------------
*/

        String fontPath = "fonts/Roboto-Regular.ttf";
        custom_font = Typeface.createFromAsset(getAssets(), fontPath);

        specTx = (TextView) findViewById(R.id.spec_text);
        specTx.setTypeface(custom_font);

        overTx = (TextView) findViewById(R.id.over_text);
        overTx.setTypeface(custom_font);

        exclusiveTx = (TextView) findViewById(R.id.exclusivity_text);
        exclusiveTx.setTypeface(custom_font);

        heritageTx = (TextView) findViewById(R.id.heritage_text);
        heritageTx.setTypeface(custom_font);

        brochureTx = (TextView) findViewById(R.id.brochure_text);
        brochureTx.setTypeface(custom_font);



/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Setting an on click function for the logo
                                     displayed in the top right of the app

                                   Short click and long click added to the logo

                                               ** SHORT CLICK **
                              Short click simply takes the users back to the first tab
                                            acting as a "home button"

                                               ** LONG CLICK **
                          Long click closes the current app that the users are looking at
                          and loads a login page.. This page is a hidden feature and only
                                    the car dealers will know about this page.

                                             For now Login is set to :
                                             Username : Test
                                             Password : password
     ---------------------------------------------------------------------------------------------------------------------------
*/

        logoBtn = (ImageView)findViewById(R.id.logo_button);
        logoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                viewPager.setCurrentItem(0);
            }
        });
        logoBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                finish();
                System.gc();
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);

                return true;
            }
        });

/*
     ---------------------------------------------------------------------------------------------------------------------------
                            Finding the View Pager... This is the view inside each tab layout

                            View Pager set to a custom adapter this is for the views on each page
                                                 of the tab layout

                            Setting the off screen limit - This stops the pages from swapping once
                            the page has been changed to a different tab... DO NOT REMOVE THIS
     ---------------------------------------------------------------------------------------------------------------------------
*/

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        viewPager.setOffscreenPageLimit(5);

/*
     ---------------------------------------------------------------------------------------------------------------------------
                            Finding the tabLayout and then setting this up with the viewpager
     ---------------------------------------------------------------------------------------------------------------------------
*/
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

/*
     ---------------------------------------------------------------------------------------------------------------------------
                            Operations that happen when the tab is selected, reselected and
                                                    unselected.

                            These all have the same code for a reason! This code makes it so
                            that if the users leaves one of the pages that also implement a
                            scroll down function, the scroll down page will reset to the top
                            of the page rather then being stuck where it was last left off.
     ---------------------------------------------------------------------------------------------------------------------------
*/

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


/*
     ---------------------------------------------------------------------------------------------------------------------------
                            This is the Custom adapter that the View pager is set up with...

                            This allows for full customisation on what is show for each "Tab"
                                            that the users can see
     ---------------------------------------------------------------------------------------------------------------------------
*/

    private class CustomAdapter extends FragmentStatePagerAdapter {

/*
     ---------------------------------------------------------------------------------------------------------------------------
                            Creating a private string... This resembles all of the "text"
                                    that says the name for each of the pages

                                       These are left blank intentionally

                               If the names do get changed please go to the file:
                                            activity_main.xml
                                As this is where the names for each tab is stored...
                               They are stored here as this is the only way to change
                               the font style of the text... It is impossible to change
                                         the font style using this setup
     ---------------------------------------------------------------------------------------------------------------------------
*/
        private String fragments[] = {"", "", "", "", ""};
/*
     ---------------------------------------------------------------------------------------------------------------------------
                                Calling the necessary functions for the adapter to work
     ---------------------------------------------------------------------------------------------------------------------------
*/
        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }
/*
     ---------------------------------------------------------------------------------------------------------------------------
                                     These are the "classes" for each tab setup...
                                For the amount of tabs you want you need to place them here

                                0 - Is the class of the first tab to be displayed

                            4 - ** for now (can be changed) ** is the very last tab to be displayed

                            Each number holds a new class... For every new class a layout is attached.
                           This is then what you can see once you select each of the tabs from the menu

                            default - returning null, this is needed as otherwise the app will crash
                                      and the tabs will not work as intended
     ---------------------------------------------------------------------------------------------------------------------------
*/
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    System.gc();
                    return new Specification();
                case 1:
                    System.gc();
                    return new Overview();
                case 2:
                    System.gc();
                    return new Exclusivity();
                case 3:
                    System.gc();
                    return new Heritage();
                case 4:
                    System.gc();
                    return new Brochure();
                default:
                    System.gc();
                    return null;
            }
        }

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Getting the amount of tabs wanted
                        This is called from the private string created at the beginning of this adapter
     ---------------------------------------------------------------------------------------------------------------------------
*/
        @Override
        public int getCount() {
            return fragments.length;
        }
/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Setting the page title depending on the position
     ---------------------------------------------------------------------------------------------------------------------------
*/
        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }


    }
}
