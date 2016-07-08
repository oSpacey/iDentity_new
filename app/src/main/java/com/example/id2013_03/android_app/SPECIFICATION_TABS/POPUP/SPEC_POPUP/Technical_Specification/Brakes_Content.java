package com.example.id2013_03.android_app.SPECIFICATION_TABS.POPUP.SPEC_POPUP.Technical_Specification;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.id2013_03.android_app.R;


public class Brakes_Content extends Fragment {
    ImageView play_Button;
    VideoView VV;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.chassis_brakes, container, false);

        play_Button = (ImageView)rootView.findViewById(R.id.play_button);

        VV = (VideoView)rootView.findViewById(R.id.videoView);
        String UriPath = "android.resource://com.example.id2013_03.android_app/" + R.raw.chassis;
        Uri uri = Uri.parse(UriPath);

        VV.setVideoURI(uri);
        VV.requestFocus();
        VV.seekTo(1000000);

        play_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VV.start();
                VV.seekTo(10);
                play_Button.setVisibility(View.GONE);

                VV.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        VV.seekTo(1000000);
                        play_Button.setVisibility(View.VISIBLE);
                    }
                });
            }
        });

        return rootView;
    }
}
