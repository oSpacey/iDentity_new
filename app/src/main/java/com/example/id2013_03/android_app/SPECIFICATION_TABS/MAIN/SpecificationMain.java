package com.example.id2013_03.android_app.SPECIFICATION_TABS.MAIN;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.TABS.Specification;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;


public class SpecificationMain extends Fragment {
    ImageView moreBtn;

    VerticalViewPager vert_view_spec;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.specification_main, container, false);

        vert_view_spec = (VerticalViewPager) getActivity().findViewById(R.id.vert_view_spec);
        moreBtn = (ImageView)rootView.findViewById(R.id.moreBtn);

        ImageView specMain = (ImageView)rootView.findViewById(R.id.spec_backImg);
        Glide.with(this).load(R.drawable.spec_main).into(specMain);

        ImageView MoreBtn = (ImageView)rootView.findViewById(R.id.moreBtn);
        Glide.with(this).load(R.drawable.spec_down_arrow).into(MoreBtn);

        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vert_view_spec.setCurrentItem(1, true);
            }
        });

        return rootView;
    }
}


