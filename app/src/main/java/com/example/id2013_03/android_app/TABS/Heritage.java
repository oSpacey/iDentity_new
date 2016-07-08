package com.example.id2013_03.android_app.TABS;

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
 * Created by ID2013-03 on 09/05/2016.
 */
public class Heritage extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.heritage, container, false);

        System.gc();

        ImageView heritageText = (ImageView)rootView.findViewById(R.id.heritage_main_text);
        Glide.with(this)
                .load(R.drawable.heritage_main_text)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(heritageText);

        ImageView heritageImage = (ImageView)rootView.findViewById(R.id.heritage_Image);
        Glide.with(this)
                .load(R.drawable.heritage_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(heritageImage);




        return rootView;
    }

}
