package androidproject.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class videoactivity extends YouTubeBaseActivity {
    YouTubePlayerView youtubePlayerView;
    Button buttonyoutube;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoactivity);
        buttonyoutube = (Button) findViewById(R.id.buttonyoutube);
        youtubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("ePpPVE-GGJw");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }

        };
        buttonyoutube.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                youtubePlayerView.initialize("AIzaSyBzEusB7yrYIFDLvTu5RFgEH4GvS_nG52U",onInitializedListener);
            }
        });
    }
}
