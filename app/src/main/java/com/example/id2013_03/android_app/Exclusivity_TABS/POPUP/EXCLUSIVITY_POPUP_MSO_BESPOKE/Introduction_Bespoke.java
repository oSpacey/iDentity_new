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

/**
 * Created by ID2013-03 on 31/05/2016.
 */
public class Introduction_Bespoke extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View introBespokeView = inflater.inflate(R.layout.bespoke_popup_introduction, container, false);

        ImageView introBespokeImage = (ImageView)introBespokeView.findViewById(R.id.exclusivity_bespoke_intro_image);
        Glide.with(this)
                .load(R.drawable.mso_bespoke_intro_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(introBespokeImage);

        return introBespokeView;
    }

}
