package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SearchActivity extends Activity implements View.OnClickListener {
    private TextView mTvTitle;
    private Button mBtnUpdates;
    private Button mBtnBack;
    private Button mBtn3dModels;
    private Button mBtnCommunity;
    private Button mBtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        findViews();
    }


    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 11:18:46 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnUpdates = (Button)findViewById( R.id.btn_updates );
        mBtnBack = (Button)findViewById( R.id.btn_back );
        mBtn3dModels = (Button)findViewById( R.id.btn_3d_models );
        mBtnCommunity = (Button)findViewById( R.id.btn_community );
        mBtnHome = (Button)findViewById( R.id.btn_home );

        mBtnUpdates.setOnClickListener( this );
        mBtnBack.setOnClickListener( this );
        mBtn3dModels.setOnClickListener( this );
        mBtnCommunity.setOnClickListener( this );
        mBtnHome.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-11-19 11:18:46 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == mBtnUpdates ) {
            // Handle clicks for mBtnUpdates
        } else if ( v == mBtnBack ) {
            // Handle clicks for mBtnBack
            finish();
        } else if ( v == mBtn3dModels ) {
            // Handle clicks for mBtn3dModels
//            startActivity(new Intent(this,SpecifyDesirQuaActivity.class));
            /*Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(Constants.WEB_URL_STL_FINDER));
            startActivity(i);*/
            launchWeb();
        } else if ( v == mBtnCommunity ) {
            // Handle clicks for mBtnCommunity
        } else if ( v == mBtnHome ) {
            // Handle clicks for mBtnHome
            Intent a = new Intent(this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            finish();
        }
    }
    private void launchWeb(){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(Constants.WEB_URL_STL_FINDER));
        startActivity(i);
    }
}
