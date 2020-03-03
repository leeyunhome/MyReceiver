package com.egloos.receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SmsActivity extends AppCompatActivity {
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        textView2 = findViewById(R.id.sender);
        textView3 = findViewById(R.id.contents);

        Intent intent = getIntent();
        processIntent(intent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        processIntent(intent);
    }

    public void processIntent(Intent intent){
        if (intent != null){
            String sender = intent.getStringExtra("sender");
            String contents = intent.getStringExtra("contents");

            textView2.setText(sender);
            textView3.setText(contents);
        }
    }
}
