package edu.dtcc.emailman.twoactivitiesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnSendClick(View view) {
        Intent intent = new Intent(this, SecondaryActivity.class);

        // Get the message to be sent
        EditText etMessage = (EditText) findViewById(R.id.etMessage);
        String message = etMessage.getText().toString();

        // Put the message into the intent, then start the activity
        intent.putExtra(MESSAGE_KEY, message);
        startActivity(intent);

        Toast.makeText(this, "Message sent", Toast.LENGTH_SHORT).show();
    }
}
