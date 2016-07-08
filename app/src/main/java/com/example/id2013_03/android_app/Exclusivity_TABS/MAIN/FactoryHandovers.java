package com.example.id2013_03.android_app.Exclusivity_TABS.MAIN;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.id2013_03.android_app.R;

/**
 * Created by ID2013-03 on 26/05/2016.
 */
public class FactoryHandovers extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.factory_handover, container, false);
        System.gc();

        ImageView factoryText = (ImageView)rootView.findViewById(R.id.factory_main_text);
        Glide.with(this)
                .load(R.drawable.factory_handover_text)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(factoryText);

        ImageView factoryImage = (ImageView)rootView.findViewById(R.id.factory_main_image);
        Glide.with(this)
                .load(R.drawable.factory_handowver_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(factoryImage);


        return rootView;
    }
}