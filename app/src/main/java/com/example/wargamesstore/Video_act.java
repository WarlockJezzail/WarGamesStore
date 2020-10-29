package com.example.wargamesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class Video_act extends AppCompatActivity {

    private VideoView Video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_act);

        Video=(VideoView)findViewById(R.id.Vv);
        String ruta= "android.resource://" + getPackageName() + "/" + R.raw.vvideo;
        Uri uri= Uri.parse(ruta);
        Video.setVideoURI(uri);

        MediaController media = new MediaController(this);
        Video.setMediaController(media);

    }
}