package com.hfad.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void sendMessage(View view){

        EditText editText = (EditText) findViewById(R.id.editTxtMessage);
        String message = editText.getText().toString();

        /*Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_TEXT , message);*/


        String subject = getString(R.string.subject);

        Intent intent = new Intent(Intent.ACTION_SEND);// Action to send the message
        intent.setType("text/plain"); //MIME data type
        intent.putExtra(Intent.EXTRA_TEXT , message);

        // subject for the message (Only shown in places where it's used)
        intent.putExtra(Intent.EXTRA_SUBJECT , subject);

        String title = getString(R.string.chooser_title);

        //A chooser will prevent users selecting default application to send the message
        Intent chooser = Intent.createChooser(intent, title);

        startActivity(chooser);

    }

}
