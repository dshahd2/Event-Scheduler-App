    package com.example.schedulehelper;

    import androidx.appcompat.app.AppCompatActivity;

    import android.media.AudioManager;
    import android.media.SoundPool;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

        private SoundPool soundPool;
        private int goodLuck;
        private int iLikeThis;
        private int nameGeoff;
        private int noCoders;
        private int thanksBen;
        private int thatsBen;
        private int thisAgain;
        private int welcomeBack;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
            goodLuck = soundPool.load(this, R.raw.goodluck, 1);
            iLikeThis = soundPool.load(this, R.raw.ilikethis, 1);
            nameGeoff = soundPool.load(this, R.raw.namegeoff, 1);
            noCoders = soundPool.load(this, R.raw.nocoders, 1);
            thanksBen = soundPool.load(this, R.raw.thanksben, 1);
            thatsBen = soundPool.load(this, R.raw.thatsben, 1);
            thisAgain = soundPool.load(this, R.raw.thisagain, 1);
            welcomeBack = soundPool.load(this, R.raw.welcomeback, 1);

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

            Button goodLuck = findViewById(R.id.goodLuck);
            goodLuck.setOnClickListener(new View.OnClickListener() {

                public void onClick(final View v) {

                    goodLuck();

                }

            });

            Button likeThisClass = findViewById(R.id.likeThis);
            likeThisClass.setOnClickListener(new View.OnClickListener() {

                public void onClick(final View v) {

                    likeThisClass();

                }

            });

            Button allBen = findViewById(R.id.thatBen);
            allBen.setOnClickListener(new View.OnClickListener() {

                public void onClick(final View v) {

                    allBen();

                }

            });

            Button again = findViewById(R.id.thisAgain);
            again.setOnClickListener(new View.OnClickListener() {

                public void onClick(final View v) {

                    again();

                }

            });


        }

        private void thanks() {

            soundPool.play(thanksBen, 1, 1, 1, 0, 1);
            System.out.println("Thanks Ben hit");

        }

        private void noCoders() {

            soundPool.play(noCoders, 1, 1, 1, 0, 1);

        }

        private void welcome() {

            soundPool.play(welcomeBack, 1, 1, 1, 0, 1);

        }

        private void goodLuck() {

            soundPool.play(goodLuck, 1, 1, 1, 0, 1);

        }

        private void name() {

            soundPool.play(nameGeoff, 1, 1, 1, 0, 1);

        }

        private void likeThisClass() {

            soundPool.play(iLikeThis, 1, 1, 1, 0, 1);

        }

        private void allBen() {

            soundPool.play(thatsBen, 1, 1, 1, 0, 1);

        }

        private void again() {

            soundPool.play(thisAgain, 1, 1, 1, 0, 1);

        }

    }
