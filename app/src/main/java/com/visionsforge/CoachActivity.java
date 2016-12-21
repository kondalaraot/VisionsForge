package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CoachActivity extends Activity implements View.OnClickListener {

    private TextView mTvTitle;
    private Button mBtnGettingStarted;
    private Button mBtnBack;
    private Button mBtnWorkFlow;
    private Button mBtnHardWare;
    private Button mBtnSoftware;
    private Button mBtnCommunity;
    private Button mBtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        findViews();;
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 11:20:21 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnGettingStarted = (Button) findViewById(R.id.btn_getting_started);
        mBtnBack = (Button) findViewById(R.id.btn_back);
        mBtnWorkFlow = (Button) findViewById(R.id.btn_work_flow);
        mBtnHardWare = (Button) findViewById(R.id.btn_hard_ware);
        mBtnSoftware = (Button) findViewById(R.id.btn_software);
        mBtnCommunity = (Button) findViewById(R.id.btn_community);
        mBtnHome = (Button) findViewById(R.id.btn_home);

        mBtnGettingStarted.setOnClickListener(this);
        mBtnBack.setOnClickListener(this);
        mBtnWorkFlow.setOnClickListener(this);
        mBtnHardWare.setOnClickListener(this);
        mBtnSoftware.setOnClickListener(this);
        mBtnCommunity.setOnClickListener(this);
        mBtnHome.setOnClickListener(this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-11-19 11:20:21 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if (v == mBtnGettingStarted) {
            // Handle clicks for mBtnGettingStarted
        } else if (v == mBtnBack) {
            // Handle clicks for mBtnBack
            finish();
        } else if (v == mBtnWorkFlow) {
            // Handle clicks for mBtnWorkFlow
        } else if (v == mBtnHardWare) {
            // Handle clicks for mBtnHardWare
        } else if (v == mBtnSoftware) {
            // Handle clicks for mBtnSoftware
        } else if (v == mBtnCommunity) {
            // Handle clicks for mBtnCommunity
        } else if (v == mBtnHome) {
            // Handle clicks for mBtnHome
            Intent a = new Intent(this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            finish();
        }
    }

}
