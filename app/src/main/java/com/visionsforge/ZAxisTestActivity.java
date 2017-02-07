package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZAxisTestActivity extends Activity implements View.OnClickListener{

    private Button mBtnBack;
    private Button mBtnHome;
    private Button mBtnRunTest;
    private Button mBtnProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaxis_test);
        findViews();
    }



    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-02-04 16:53:59 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnBack = (Button)findViewById( R.id.btn_back );
        mBtnHome = (Button)findViewById( R.id.btn_home );
        mBtnRunTest = (Button)findViewById( R.id.btn_run_test );
        mBtnProceed = (Button)findViewById( R.id.btn_proceed );

        mBtnBack.setOnClickListener( this );
        mBtnHome.setOnClickListener( this );
        mBtnRunTest.setOnClickListener( this );
        mBtnProceed.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == mBtnBack ) {
            // Handle clicks for mBtnBack
            finish();
        } else if ( v == mBtnHome ) {
            // Handle clicks for mBtnHome
            Intent a = new Intent(this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            finish();
        } else if ( v == mBtnRunTest ) {
            // Handle clicks for mBtnRunTest
        } else if ( v == mBtnProceed ) {
            // Handle clicks for mBtnProceed
            Intent a = new Intent(this,CountDownTimerActivity.class);
            startActivity(a);

        }
    }

}
