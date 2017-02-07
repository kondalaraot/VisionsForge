package com.visionsforge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SDCardActivity extends Activity implements View.OnClickListener{

    private ImageView mImageView;
    private Button mBtnPrev;
    private Button mBtnChoseModel;
    private Button mBtnNext;
    private int[] images_3d;

    int next=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdcard);
        findViews();
        images_3d = new int[] {
                R.drawable.aeroplane,
                R.drawable.car_body,
                R.drawable.dinosaursmal,
                R.drawable.helmetsmall,
                R.drawable.humansmall
        };
        mImageView.setImageResource(images_3d[next]);

    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-19 11:23:16 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        mImageView = (ImageView)findViewById( R.id.imageView );
        mBtnPrev = (Button)findViewById( R.id.btn_prev );
        mBtnChoseModel = (Button)findViewById( R.id.btn_chose_model );
        mBtnNext = (Button)findViewById( R.id.btn_next );

        mBtnPrev.setOnClickListener( this );
        mBtnNext.setOnClickListener( this );
        mBtnChoseModel.setOnClickListener( this );

    }


    @Override
    public void onClick(View v) {
        if (v == mBtnChoseModel) {
            // Handle clicks for mBtnBack
             Intent a = new Intent(this,SpecifyDesirQuaActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);

        } else if (v == mBtnNext) {
            // Handle clicks for mBtnHome
            /*Intent a = new Intent(this,MainActivity.class);
            a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(a);
            finish();*/
            if(next == 4){

            }else{
                next++;
                mImageView.setImageResource(images_3d[next]);

            }

        }else if (v == mBtnPrev){
            if(next == 0){

            }else{
                next--;
                mImageView.setImageResource(images_3d[next]);

            }
        }
    }
}
