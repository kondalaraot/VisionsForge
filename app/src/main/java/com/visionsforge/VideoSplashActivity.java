package com.visionsforge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;

public class VideoSplashActivity extends Activity {

    MyVideoView vidHolder;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_splash);
        try
        {
//            vidHolder = new VideoView(this);
            vidHolder = (MyVideoView) findViewById(R.id.myvideo);
//            setContentView(vidHolder);
            Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_vf);
            vidHolder.setVideoURI(video);
//            vidHolder.setZOrderOnTop(true);
            vidHolder.requestFocus();

            vidHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }});
            vidHolder.start();

        } catch(Exception ex) {
            jump();
            ex.printStackTrace();
        }
    }

    private void jump()
    {
        if(isFinishing())
            return;
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (null == vidHolder) return;
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().getDecorView().invalidate();
            float height = getWidthInPx(this);
            float width = getHeightInPx(this);
            vidHolder.getLayoutParams().height = (int) width;
            vidHolder.getLayoutParams().width = (int) height;
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            final WindowManager.LayoutParams attrs = getWindow().getAttributes();
            attrs.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().setAttributes(attrs);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            float width = getWidthInPx(this);
            float height = dip2px(this, 200.f);
            vidHolder.getLayoutParams().height = (int) height;
            vidHolder.getLayoutParams().width = (int) width;
        }
    }

    public static final float getHeightInPx(Context context) {
        final float height = context.getResources().getDisplayMetrics().heightPixels;
        return height;
    }

    public static final float getWidthInPx(Context context) {
        final float width = context.getResources().getDisplayMetrics().widthPixels;
        return width;
    }

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
