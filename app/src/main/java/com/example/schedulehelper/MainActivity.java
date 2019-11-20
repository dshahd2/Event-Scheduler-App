package com.example.schedulehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addEvent = findViewById(R.id.addEvent);
        addEvent.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, EventAddActivity.class));

            }

        });



    }

}
