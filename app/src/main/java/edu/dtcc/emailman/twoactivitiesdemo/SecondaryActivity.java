package edu.dtcc.emailman.twoactivitiesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static edu.dtcc.emailman.twoactivitiesdemo.MainActivity.MESSAGE_KEY;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        // Get the intent that started this activity
        Intent i = getIntent();

        // Receive the string send in the intent
        String messageSent = i.getStringExtra(MESSAGE_KEY);

        // Put the string sent in the Message Received text view
        TextView tvMessageReceived = (TextView) findViewById(R.id.tvMessageReceived);
        tvMessageReceived.setText(messageSent);
    }

    public void onBtnReturnClick(View view) {
        Toast.makeText(this, "Returning to Main Activity", Toast.LENGTH_SHORT).show();

        // Return to the Main Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
