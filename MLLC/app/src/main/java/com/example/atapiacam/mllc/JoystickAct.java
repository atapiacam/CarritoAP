package com.example.atapiacam.mllc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class JoystickAct extends AppCompatActivity implements JoystickView.JoystickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JoystickView joystick = new JoystickView(this);
        setContentView(joystick);
    }

    @Override
    public void onJoystickMoved(float xPercent, float yPercent, int id) {
        double ang = Math.atan2(-yPercent,xPercent);
        double dir = (180/3.1416)*ang;





        Log.d("Main method","Dirección: "+dir );
    }
}
