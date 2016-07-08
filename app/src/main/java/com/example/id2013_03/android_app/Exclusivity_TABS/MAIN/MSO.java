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

public class MSO extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mso, container, false);
        System.gc();

        ImageView msoText = (ImageView)rootView.findViewById(R.id.mso_main_text);
        Glide.with(this)
                .load(R.drawable.exclusivity_mso_text)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(msoText);

        ImageView msoImage = (ImageView)rootView.findViewById(R.id.msoImageMain);
        Glide.with(this)
                .load(R.drawable.exclusivity_mso_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(msoImage);


        return rootView;
    }
}
