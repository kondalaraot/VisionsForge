package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button mTvCoach;
    private Button mBtnSearch;
    private Button mBtnBuild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        mTvCoach = (Button)findViewById( R.id.btn_coach );
        mBtnSearch = (Button)findViewById( R.id.btn_search );
        mBtnBuild = (Button)findViewById( R.id.btn_build );

        mTvCoach.setOnClickListener( this );
        mBtnSearch.setOnClickListener( this );
        mBtnBuild.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        if ( v == mTvCoach ) {
            // Handle clicks for mTvCoach
            startActivity(new Intent(this,CoachActivity.class));
        } else if ( v == mBtnSearch ) {
            // Handle clicks for mBtnSearch
            startActivity(new Intent(this,SearchActivity.class));

        } else if ( v == mBtnBuild ) {
            // Handle clicks for mBtnBuild
            startActivity(new Intent(this,BuildActivity.class));

        }
    }
}
