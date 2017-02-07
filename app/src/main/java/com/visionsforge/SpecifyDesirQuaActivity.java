package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SpecifyDesirQuaActivity extends Activity implements View.OnClickListener {

    private TextView mTvTitle;
    private Button mBtnDaft;
    private Button mBtnBack;
    private Button mBtnMedium;
    private Button mBtnGood;
    private Button mBtnVgood;
    private Button mBtnAltra;
    private Button mBtnHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specify_desir_qua);
        findViews();
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 14:16:02 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mBtnDaft = (Button)findViewById( R.id.btn_daft );
        mBtnBack = (Button)findViewById( R.id.btn_back );
        mBtnMedium = (Button)findViewById( R.id.btn_medium );
        mBtnGood = (Button)findViewById( R.id.btn_good );
        mBtnVgood = (Button)findViewById( R.id.btn_vgood );
        mBtnAltra = (Button)findViewById( R.id.btn_altra );
        mBtnHome = (Button)findViewById( R.id.btn_home );

        mBtnDaft.setOnClickListener( this );
        mBtnBack.setOnClickListener( this );
        mBtnMedium.setOnClickListener( this );
        mBtnGood.setOnClickListener( this );
        mBtnVgood.setOnClickListener( this );
        mBtnAltra.setOnClickListener( this );
        mBtnHome.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-11-19 14:16:02 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == mBtnDaft ) {
            // Handle clicks for mBtnDaft
          /*  Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(Constants.WEB_URL_STL_FINDER));
            startActivity(i);*/
        } else if ( v == mBtnBack ) {
            // Handle clicks for mBtnBack
            finish();
        } else if ( v == mBtnMedium ) {
            // Handle clicks for mBtnMedium
//            launchWeb();
            Intent a = new Intent(this,ModelEstCostActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        } else if ( v == mBtnGood ) {
            // Handle clicks for mBtnGood
//            launchWeb();
            Intent a = new Intent(this,ModelEstCostActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
        } else if ( v == mBtnVgood ) {
            // Handle clicks for mBtnVgood
//            launchWeb();

        } else if ( v == mBtnAltra ) {
            // Handle clicks for mBtnAltra
//            launchWeb();

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
