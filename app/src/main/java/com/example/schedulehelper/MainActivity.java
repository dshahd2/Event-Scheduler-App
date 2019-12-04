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

        Button thanks = findViewById(R.id.thanksBen);
        thanks.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                thanks();

            }

        });

        Button name = findViewById(R.id.nameGeoff);
        name.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                name();

            }

        });

        Button noCoders = findViewById(R.id.noCoders);
        noCoders.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                noCoders();

            }

        });

        Button welcome = findViewById(R.id.welcome);
        welcome.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                welcome();

            }

        });

        Button four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                four();

            }

        });

        Button six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                six();

            }

        });

        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                seven();

            }

        });

        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View v) {

                eight();

            }

        });


    }

    private void thanks() {

        System.out.println("Button 1 Hit");

    }

    private void noCoders() {

        System.out.println("Button 2 Hit");

    }

    private void welcome() {

        System.out.println("Button 3 Hit");

    }

    private void four() {

        System.out.println("Button 4 Hit");

    }

    private void name() {

        System.out.println("Button 5 Hit");

    }

    private void six() {

        System.out.println("Button 6 Hit");

    }

    private void seven() {

        System.out.println("Button 7 Hit");

    }

    private void eight() {

        System.out.println("Button 8 Hit");

    }

}
