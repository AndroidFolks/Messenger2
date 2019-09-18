package com.hfad.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        TextView textView = (TextView)findViewById(R.id.txtViewMessage);
        String receivedMessage = intent.getStringExtra(EXTRA_TEXT);

        textView.setText(receivedMessage);

    }
}
