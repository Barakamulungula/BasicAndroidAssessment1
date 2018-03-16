package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button buttonSubmit;
    private Button newPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.edit_text);
        buttonSubmit = findViewById(R.id.button_submit);
        newPage = findViewById(R.id.new_page);
        onSubmitButtonClick();
        onNewPageClick();

    }

    private void onNewPageClick() {
        newPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,welcome.class);
                intent.putExtra("NAME",editText.getText().toString());
                editText.setText("");
                startActivity(intent);
            }
        });
    }

    private void onSubmitButtonClick() {
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = editText.getText().toString();
                textView.setText(textInput);
                editText.setText("");
                Toast.makeText(MainActivity.this, "Android is Fun!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
