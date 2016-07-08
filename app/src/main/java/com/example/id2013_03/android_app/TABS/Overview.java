package com.example.id2013_03.android_app.TABS;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.id2013_03.android_app.R;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Main class for this section
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class Overview extends Fragment {

    Toast toast;

    ImageView topic1;
    ImageView topic2;
    ImageView topic3;


/*
     ---------------------------------------------------------------------------------------------------------------------------
                                        This page if inflated with a blank view...

                                    This is intended as it has not yet been implemented
     ---------------------------------------------------------------------------------------------------------------------------
*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Creating the view layout for this class... It calls the cml file tabbed_heritage
        // This is then stored into the variable view to make it easier to call upon again later
        View view = inflater.inflate(R.layout.overview, container, false);

        System.gc();

        ImageView overviewText = (ImageView)view.findViewById(R.id.overview_main_top);
        Glide.with(this)
                .load(R.drawable.overview_main_text)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(overviewText);

        ImageView overviewImage = (ImageView)view.findViewById(R.id.overview_image);
        Glide.with(this)
                .load(R.drawable.overview)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(overviewImage);

        topic1 = (ImageView)view.findViewById(R.id.overview_topicOne_btn);
        topic2 = (ImageView)view.findViewById(R.id.overview_topicTwo_btn);
        topic3 = (ImageView)view.findViewById(R.id.overview_topicThree_btn);

        topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast= Toast.makeText(getActivity().getApplicationContext(),getString(R.string.notYetImplemented), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast= Toast.makeText(getActivity().getApplicationContext(),getString(R.string.notYetImplemented), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });

        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast= Toast.makeText(getActivity().getApplicationContext(),getString(R.string.notYetImplemented), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });






/*
     ---------------------------------------------------------------------------------------------------------------------------
                                               Returning the root view
                                          This allows everything to be shown
     ---------------------------------------------------------------------------------------------------------------------------
*/
        return view;
    }

}
