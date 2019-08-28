package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button askBtn = null;
    ImageView currentBallImg = null;
    Random randomNumberGenerator = null;
    final int availableBallImgs[] = {R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumberGenerator = new Random();

        currentBallImg = (ImageView)findViewById(R.id.ballView);
        askBtn = (Button)findViewById(R.id.askButton);

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int imgNumber = randomNumberGenerator.nextInt(5);

                currentBallImg.setImageResource(availableBallImgs[imgNumber]);
            }
        });
    }
}
