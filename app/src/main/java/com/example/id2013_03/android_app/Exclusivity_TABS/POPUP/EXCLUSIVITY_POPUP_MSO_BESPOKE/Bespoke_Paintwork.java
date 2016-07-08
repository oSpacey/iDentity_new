package com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_BESPOKE;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.id2013_03.android_app.R;


public class Bespoke_Paintwork extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View paintworkView = inflater.inflate(R.layout.bespoke_popup_paintwork, container, false);

        ImageView paintWorkImage = (ImageView)paintworkView.findViewById(R.id.exclusivity_popup_bespoke_image);
        Glide.with(this)
                .load(R.drawable.mso_bespoke_paintwork_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(paintWorkImage);

        return paintworkView;
    }

}