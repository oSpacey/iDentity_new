package com.example.id2013_03.android_app.Exclusivity_TABS.POPUP.EXCLUSIVITY_POPUP_MSO_DEFINED;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.id2013_03.android_app.R;


public class SportsSeries extends Fragment {

    ImageView frontOfCar;
    ImageView doorOfCar;
    ImageView windowOfCar;
    ImageView roofOfCar;
    ImageView backOfCar;

    ScrollView sportsTextScroll;

    Toast toast;

    int frontCountBtn = 0;
    int doorCountBtn = 0;
    int backCountBtn = 0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sportsView = inflater.inflate(R.layout.defined_popup_sports_series, container, false);

        frontOfCar = (ImageView)sportsView.findViewById(R.id.front_of_car);
        doorOfCar = (ImageView)sportsView.findViewById(R.id.door_of_car);
        windowOfCar = (ImageView)sportsView.findViewById(R.id.window_of_car);
        roofOfCar = (ImageView)sportsView.findViewById(R.id.roof_of_car);
        backOfCar = (ImageView)sportsView.findViewById(R.id.back_of_car);

        sportsTextScroll = (ScrollView)sportsView.findViewById(R.id.mso_sports_text);

        frontOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(frontCountBtn == 0) {
                    sportsTextScroll.scrollTo(0, 810);
                    frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                    doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                    roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                    backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    frontCountBtn++;
                }else{
                    sportsTextScroll.scrollTo(0, 0);
                    frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                    roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                    backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    frontCountBtn--;
                }
            }
        });

        doorOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doorCountBtn == 0) {
                sportsTextScroll.scrollTo(0, 2380);
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    doorCountBtn++;
            }else{
                    sportsTextScroll.scrollTo(0, 0);
                    frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                    roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                    backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    doorCountBtn--;
            }
            }
        });

        windowOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast= Toast.makeText(getActivity().getApplicationContext(),getString(R.string.notYetImplemented), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }

        });

        roofOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast= Toast.makeText(getActivity().getApplicationContext(),getString(R.string.notYetImplemented), Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
            }
        });

        backOfCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(backCountBtn == 0){
                sportsTextScroll.scrollTo(0, 1620);
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval_pressed);
                    backCountBtn++;
            }else{
                sportsTextScroll.scrollTo(0, 0);
                frontOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                doorOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                windowOfCar.setBackgroundResource(R.drawable.main_ovals);
                roofOfCar.setBackgroundResource(R.drawable.main_ovals);
                backOfCar.setBackgroundResource(R.drawable.exclusivity_oval);
                    backCountBtn--;
            }

            }
        });


        return sportsView;
    }





}
