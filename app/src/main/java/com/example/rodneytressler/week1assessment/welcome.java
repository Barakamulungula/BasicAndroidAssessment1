package com.example.rodneytressler.week1assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    private TextView text_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        text_welcome = findViewById(R.id.welcome_text);

        String welcome = getIntent().getStringExtra("NAME")+", loves Android";


        text_welcome.setText(welcome);
    }
}
