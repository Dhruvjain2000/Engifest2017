package org.sddtu.engifest2017;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.video1);

//        String uriPath = "android.resource://com.android.AndroidVideoPlayer/"+R.raw.engi_festlogo;
//        Uri uri = Uri.parse(uriPath);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
//        videoView.start();
//
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        videoView.setKeepScreenOn(true);
//        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.engi_festlogo));
//        videoView.start();
//        videoView.requestFocus();

        String uripath = "android.resource://" + getPackageName() + "/" + R.raw.engi_festlogo;
        Uri uri = Uri.parse(uripath);

        videoView.setVideoURI(uri);

        videoView.start();
        videoView.requestFocus();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
                startActivity(new Intent(MainActivity.this,EventList.class));
            }
        });


    }
}
