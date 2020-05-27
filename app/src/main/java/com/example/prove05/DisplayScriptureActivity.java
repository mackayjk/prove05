package com.example.prove05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayScriptureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = String.format("%s %s:%s", intent.getStringExtra(MainActivity.EXTRA_MESSAGE), intent.getStringExtra(MainActivity.EXTRA_MESSAGE_2), intent.getStringExtra(MainActivity.EXTRA_MESSAGE_3));

        Log.d("Main Activity", "Received intent with " + message);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView3);
        textView.setText(message);
    }
}
