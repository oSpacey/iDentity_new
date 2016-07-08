package com.example.id2013_03.android_app.TABS;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.id2013_03.android_app.R;

/**
 * Created by ID2013-03 on 09/05/2016.
 */
public class Heritage extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.heritage, container, false);

        System.gc();

        return rootView;
    }

}
