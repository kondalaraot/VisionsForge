package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BuildActivity extends Activity implements View.OnClickListener{

    private TextView mTvTitle;
    private Button mBtnBeginner;
    private Button mBtnBack;
    private Button mBtnIntermediate;
    private Button mBtnExpert;
    private Button mBtnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);
        findViews();
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 11:23:16 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnBeginner = (Button)findViewById( R.id.btn_beginner );
        mBtnBack = (Button)findViewById( R.id.btn_back );
        mBtnIntermediate = (Button)findViewById( R.id.btn_intermediate );
        mBtnExpert = (Button)findViewById( R.id.btn_expert );
        mBtnHome = (Button)findViewById( R.id.btn_home );

        mBtnBeginner.setOnClickListener( this );
        mBtnBack.setOnClickListener( this );
        mBtnIntermediate.setOnClickListener( this );
        mBtnExpert.setOnClickListener( this );
        mBtnHome.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-11-19 11:23:16 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == mBtnBeginner ) {
            // Handle clicks for mBtnBeginner
            Intent a = new Intent(this,Choose3DModelActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        } else if ( v == mBtnBack ) {
            // Handle clicks for mBtnBack
            finish();
        } else if ( v == mBtnIntermediate ) {
            // Handle clicks for mBtnIntermediate
            Intent a = new Intent(this,Choose3DModelActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        } else if ( v == mBtnExpert ) {
            // Handle clicks for mBtnExpert
            Intent a = new Intent(this,Choose3DModelActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        } else if ( v == mBtnHome ) {
            // Handle clicks for mBtnHome
            Intent a = new Intent(this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            finish();
        }
    }


}
