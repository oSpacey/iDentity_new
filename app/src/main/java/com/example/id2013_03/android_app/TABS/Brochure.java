package com.example.id2013_03.android_app.TABS;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.id2013_03.android_app.R;


public class Brochure extends Fragment {

    Spinner Titles;
    Spinner Cars;

    EditText Firstname;
    EditText Surname;
    EditText Email;
    EditText confEmail;

    ImageView sendBtn;

    int screenCap = 0;

    private RelativeLayout brochureLayout;





    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.brochrue, container, false);

        System.gc();


        Titles = (Spinner)rootView.findViewById(R.id.titleSpinner);
        Cars = (Spinner)rootView.findViewById(R.id.carsSpinner);

        Firstname = (EditText)rootView.findViewById(R.id.FirstName);
        Surname = (EditText)rootView.findViewById(R.id.Surname);
        Email = (EditText)rootView.findViewById(R.id.emailAddress);
        confEmail = (EditText)rootView.findViewById(R.id.confirmEmail);

        sendBtn = (ImageView)rootView.findViewById(R.id.sendEmail);

        brochureLayout = (RelativeLayout)rootView.findViewById(R.id.brochureLayout);
        onTapOutside(brochureLayout);

        ImageView brochureText = (ImageView)rootView.findViewById(R.id.brochure_main_text);
        Glide.with(this)
                .load(R.drawable.brochure_main_text)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(brochureText);

        ImageView brochureImage = (ImageView)rootView.findViewById(R.id.mainImageBrochure);
        Glide.with(this)
                .load(R.drawable.brochure_main_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(brochureImage);



        Titles.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Titles.setSelection(0);
            }
        });
        Cars.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Cars.setSelection(0);
            }
        });

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firstname.getText().clear();
                Surname.getText().clear();
                Email.getText().clear();
                confEmail.getText().clear();

                Titles.setSelection(0);
                Cars.setSelection(0);
            }
        });


        return rootView;
    }

    private void onTapOutside(View view) {
        if(!(view instanceof EditText) || !(view instanceof Button)){
            view.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                        hideSoftKeyboard(getActivity());

                    return false;
                }
            });
        }
    }


    private static void hideSoftKeyboard(Activity activity){
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

    }
}



