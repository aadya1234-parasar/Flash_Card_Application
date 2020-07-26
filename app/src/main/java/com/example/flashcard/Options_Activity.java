package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Options_Activity extends AppCompatActivity {

    TextView physics, chemistry, maths, english, biology, arts, commerce, computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        physics =findViewById(R.id.btn_1);
        chemistry =findViewById(R.id.btn_2);
        maths =findViewById(R.id.btn_3);
        english =findViewById(R.id.btn_4);
        biology =findViewById(R.id.btn_5);
        arts =findViewById(R.id.btn_6);
        commerce =findViewById(R.id.btn_7);
        computer =findViewById(R.id.btn_8);

        physics.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, Physics_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        chemistry.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, Chemistry_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        maths.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, Maths_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        english.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, MainActivity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        biology.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, MainActivity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        arts.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, MainActivity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        commerce.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, MainActivity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        computer.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Options_Activity.this, MainActivity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}