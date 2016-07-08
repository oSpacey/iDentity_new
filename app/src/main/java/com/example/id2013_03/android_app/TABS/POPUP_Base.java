package com.example.id2013_03.android_app.TABS;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                               Main class for this section

                                    This class is used to detect when users are no longer
                                    interacting with the app and will go to the default page
                                                    after 3 minutes
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class POPUP_Base extends AppCompatActivity {

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    This is a public statement... This is to workout the
                                    when the users are no longer touching the screen..

                                    The timer is set to 180000 milliseconds or 3 minutes
     ---------------------------------------------------------------------------------------------------------------------------
*/
    public static final long DISCONNECT_TIMEOUT = 180000; // 5 min = 5 * 60 * 1000 ms

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    This is just a message that can be displayed to the
                                    users for when the interactivity is complete

                                    This can be left blank, but needs to be kept here.
     ---------------------------------------------------------------------------------------------------------------------------
*/
    private Handler disconnectHandler = new Handler(){
        public void handleMessage(Message msg) {


        }
    };

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    This is where something must happen for when the
                                        disconnect time reaches its limit...

                                    It has been set to swap back to the home page.
     ---------------------------------------------------------------------------------------------------------------------------
*/


    private Runnable disconnectCallback = new Runnable() {
        @Override
        public void run() {
            // Perform any required operation on disconnect
            finish();
        }
    };

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Reset timer is for when the screen is touched
                                    or for when the timer has reached its end limit
     ---------------------------------------------------------------------------------------------------------------------------
*/

    public void resetDisconnectTimer(){
        disconnectHandler.removeCallbacks(disconnectCallback);
        disconnectHandler.postDelayed(disconnectCallback, DISCONNECT_TIMEOUT);
    }

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    This is set for when the users touch the screen
                                    The timer is disconnected, however it is then
                                            started once there is no touch
     ---------------------------------------------------------------------------------------------------------------------------
*/
    public void stopDisconnectTimer(){
        disconnectHandler.removeCallbacks(disconnectCallback);
    }

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    This simply resets the timer back to 0
     ---------------------------------------------------------------------------------------------------------------------------
*/
    @Override
    public void onUserInteraction(){
        resetDisconnectTimer();
    }

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    On resume is needed otherwise if it goes off once
                                        and tries to come back the app will crash
     ---------------------------------------------------------------------------------------------------------------------------
*/
    @Override
    public void onResume() {
        super.onResume();
        resetDisconnectTimer();
    }

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                    Simply stops the timer and disconnects it
     ---------------------------------------------------------------------------------------------------------------------------
*/
    @Override
    public void onStop() {
        super.onStop();
        stopDisconnectTimer();
    }
}