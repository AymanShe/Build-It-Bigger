package com.aymanshehri.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke = getIntent().getStringExtra("INTENT_JOKE");
        TextView textViewJoke = findViewById(R.id.tv_joke);
        textViewJoke.setText(joke);
    }
}
