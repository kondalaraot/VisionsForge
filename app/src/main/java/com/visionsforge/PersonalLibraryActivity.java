package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalLibraryActivity extends Activity implements View.OnClickListener{

    private Button mBtnBack;

    private Button mBtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_library);
        findViews();
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 11:23:16 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnBack = (Button)findViewById( R.id.btn_back );
        mBtnHome = (Button)findViewById( R.id.btn_home );

        mBtnBack.setOnClickListener( this );
        mBtnHome.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if (v == mBtnBack) {
            // Handle clicks for mBtnBack
            finish();
        } else if (v == mBtnHome) {
            // Handle clicks for mBtnHome
            Intent a = new Intent(this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            finish();
        }
    }


}
