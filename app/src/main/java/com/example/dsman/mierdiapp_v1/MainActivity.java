package com.example.dsman.mierdiapp_v1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button btnmierdi;
    ArrayList pedos;
   //pedos = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmierdi = (Button) findViewById(R.id.mierdi);

        mp = MediaPlayer.create(this, R.raw.pedo);

        btnmierdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mp.start();

            }
        });

    }

}
