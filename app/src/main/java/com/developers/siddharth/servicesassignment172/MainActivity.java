package com.developers.siddharth.servicesassignment172;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);

        // button on click function
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // defining intent service
                Intent i = new Intent(MainActivity.this,BoundService.class);
                startService(i);
               // getting returned value from the getCurrentTime() function
                String currentTime = BoundService.getCurrentTime();
                TextView myTextView = (TextView)findViewById(R.id.textView);
                // setting the value in the textview
                myTextView.setText(currentTime);

            }
        });
    }
}
