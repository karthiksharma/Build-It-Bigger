package com.karthik.self.jokeandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        //Get joke from calling Intent.
        String joke = getIntent().getStringExtra("joke");
        Toast.makeText(JokeActivity.this, joke, Toast.LENGTH_SHORT).show();
    }
}
