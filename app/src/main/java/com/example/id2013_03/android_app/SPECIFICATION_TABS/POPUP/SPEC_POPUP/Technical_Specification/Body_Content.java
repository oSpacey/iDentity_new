package com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Technical_Specification;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.id2013_03.android_app.R;


public class Body_Content extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.body_content, container, false);

        ImageView bodymainImage = (ImageView)rootView.findViewById(R.id.bodyImage);
        Glide.with(this).load(R.drawable.body).into(bodymainImage);


        return rootView;
    }
}
