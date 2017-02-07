package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class CountDownTimerActivity extends Activity {

    private static final String MILLISECONDS_FORMAT = "%03d";

    CountDownTimer mCountDownTimer;

     TextView titleTimer;
     Button mBtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down_timer);
        mBtnHome = (Button) findViewById(R.id.btn_home);
        titleTimer = (TextView) findViewById(R.id.tv_label);
        final TextView tvTimer = (TextView) findViewById(R.id.tv_timer);

        long durationHrs = 2 * 60 *60*1000; //2 Hours
        long durationMins = 50 * 60 * 1000; //2 Mins
//        long durationSecs = 30 * 1000; //30 Secs
//        TimeUnit.MINUTES.toMillis(yourMinutes)

        mCountDownTimer =new CountDownTimer(durationHrs+durationMins, 1000) {

            public void onTick(long millisUntilFinished) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) ;

                long just_hours = seconds / 3600;
                long just_minutes = (seconds/60) % 60;
                long just_seconds = seconds % 60;
//                long just_milli_sec = seconds % 1000;

                String time = String.format("%02d:%02d:%02d", millisUntilFinished / 3600,
                        (millisUntilFinished % 3600) / 60, (millisUntilFinished % 60));
 String timeHours = String.format("%02d", just_hours);

                tvTimer.setText(" " +timeHours + ":"+just_minutes+":"+just_seconds);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
//                isTimerRunning = false;
//                tvTimer.setText("Done!!!");
                tvTimer.setText("Obect ready!");
                titleTimer.setVisibility(View.INVISIBLE);
                mBtnHome.setVisibility(View.VISIBLE);
            }

        }.start();
        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(CountDownTimerActivity.this,MainActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(a);
                finish();
            }
        });
    }


}
