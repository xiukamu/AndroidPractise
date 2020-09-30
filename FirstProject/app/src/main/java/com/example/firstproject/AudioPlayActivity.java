package com.example.firstproject;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AudioPlayActivity extends AppCompatActivity {


    @BindView(R.id.Playbutton)
    Button Playbutton;
    @BindView(R.id.PauseButton)
    Button PauseButton;
    @BindView(R.id.StopButton)
    Button StopButton;
    public  MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_play);
        ButterKnife.bind(this);
        mediaPlayer = MediaPlayer.create(this, R.raw.he);


    }

    @OnClick({R.id.Playbutton, R.id.PauseButton, R.id.StopButton})
    public void onClick(View view) {
        mediaPlayer.start();

        switch (view.getId()) {
            case R.id.Playbutton:
               // mediaPlayer.start();
                break;
            case R.id.PauseButton:
               //mediaPlayer.pause();
                break;
            case R.id.StopButton:
               // mediaPlayer.stop();
                break;
        }
    }
}