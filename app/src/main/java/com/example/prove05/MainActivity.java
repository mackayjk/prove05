package com.example.prove05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE_2 = "com.example.myfirstapp.MESSAGE_2";
    public static final String EXTRA_MESSAGE_3 = "com.example.myfirstapp.MESSAGE_3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void displayScripture(View view) {
        Intent intent = new Intent(this, DisplayScriptureActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText5);
        EditText editText2 = (EditText) findViewById(R.id.editText6);
        EditText editText3 = (EditText) findViewById(R.id.editText7);

        String book = editText.getText().toString();
        String chapter = editText2.getText().toString();
        String verse = editText3.getText().toString();

        Log.d("Main Activity", "About to create intent with " + book + " " + chapter + ":" + verse);

        intent.putExtra(EXTRA_MESSAGE, book);
        intent.putExtra(EXTRA_MESSAGE_2, chapter);
        intent.putExtra(EXTRA_MESSAGE_3, verse);

        startActivity(intent);
    }

}
