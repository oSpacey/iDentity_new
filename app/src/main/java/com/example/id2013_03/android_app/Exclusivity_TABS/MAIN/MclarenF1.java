package com.example.id2013_03.android_app.Exclusivity_TABS.MAIN;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_BESPOKE.Mso_Bespoke_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_DEFINED.Mso_Defined_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_HERITAGE.Mso_Heritage_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_LIMITED.Mso_Limited_Popup;
import com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_PROGRAMMES.Mso_Programmes_Popup;
import com.example.id2013_03.android_app.R;

public class MclarenF1 extends Fragment {
    ImageView msoDefined;
    ImageView msoBespoke;
    ImageView msoHeritage;
    ImageView msoProgrammes;
    ImageView msoLimited;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mclaren_f1, container, false);


        msoDefined = (ImageView)rootView.findViewById(R.id.mso_defined_btn);
        msoBespoke = (ImageView)rootView.findViewById(R.id.mso_bespoke_btn);
        msoHeritage = (ImageView)rootView.findViewById(R.id.mso_heritage_btn);
        msoProgrammes = (ImageView)rootView.findViewById(R.id.mso_programmes_btn);
        msoLimited = (ImageView)rootView.findViewById(R.id.mso_limited_btn);

        ImageView definedImage = (ImageView)rootView.findViewById(R.id.mso_Defined_Image);
        Glide.with(this)
                .load(R.drawable.exclusivity_mso_defined_card)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(definedImage);

        ImageView bespokeImage = (ImageView)rootView.findViewById(R.id.mso_bespoke_Image);
        Glide.with(this).load(R.drawable.exclusivity_mso_bespoke_card).into(bespokeImage);

        ImageView heritageImage = (ImageView)rootView.findViewById(R.id.mso_heritage_image);
        Glide.with(this).load(R.drawable.exclusivity_mso_heritage_card).into(heritageImage);

        ImageView programmesImage = (ImageView)rootView.findViewById(R.id.mso_programmes_image);
        Glide.with(this).load(R.drawable.exclusivity_mso_programmes_card).into(programmesImage);

        ImageView limitedImage = (ImageView)rootView.findViewById(R.id.mso_limited_image);
        Glide.with(this).load(R.drawable.exclusivity_mso_limited_card).into(limitedImage);

        msoDefined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Mso_Defined_Popup.class);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                getActivity().getIntent().removeExtra("key");
                startActivity(i);
            }
        });

        msoBespoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Mso_Bespoke_Popup.class);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                getActivity().getIntent().removeExtra("key");
                startActivity(i);
            }
        });

        msoHeritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Mso_Heritage_Popup.class);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                getActivity().getIntent().removeExtra("key");
                startActivity(i);
            }
        });

        msoProgrammes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Mso_Programmes_Popup.class);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                getActivity().getIntent().removeExtra("key");
                startActivity(i);
            }
        });

        msoLimited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.gc();
                Intent i = new Intent(getActivity(), Mso_Limited_Popup.class);
                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                getActivity().getIntent().removeExtra("key");
                startActivity(i);
            }
        });


        return rootView;
    }
}