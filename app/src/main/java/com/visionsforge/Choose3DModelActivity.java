package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choose3DModelActivity extends Activity implements View.OnClickListener{

    private Button mBtnStlFinder;
    private Button mBtnBack;
    private Button mBtn3dModels;
    private Button mBtnCommunity;
    private Button mBtnHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose3_dmodel);
        findViews();
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 14:34:57 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnStlFinder = (Button)findViewById( R.id.btn_stlfinder );
        mBtnBack = (Button)findViewById( R.id.btn_back );
        mBtn3dModels = (Button)findViewById( R.id.btn_personal_lib );
        mBtnCommunity = (Button)findViewById( R.id.btn_sdcard );
        mBtnHome = (Button)findViewById( R.id.btn_home );

        mBtnStlFinder.setOnClickListener( this );
        mBtnBack.setOnClickListener( this );
        mBtn3dModels.setOnClickListener( this );
        mBtnCommunity.setOnClickListener( this );
        mBtnHome.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-11-19 14:34:57 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == mBtnStlFinder ) {
            // Handle clicks for mBtnUpdates
            launchWeb();
        } else if ( v == mBtnBack ) {
            // Handle clicks for mBtnBack
            finish();
        } else if ( v == mBtn3dModels ) {
            // Handle clicks for mBtn3dModels
            Intent a = new Intent(this,PersonalLibraryActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        } else if ( v == mBtnCommunity ) {
            // Handle clicks for mBtnCommunity
            Intent a = new Intent(this,SDCardActivity.class);
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
    private void launchWeb(){
        startActivity(new Intent(this,SpecifyDesirQuaActivity.class));
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(Constants.WEB_URL_STL_FINDER));
        startActivity(i);
    }
}
