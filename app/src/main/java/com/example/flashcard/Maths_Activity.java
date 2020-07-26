package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maths_Activity extends AppCompatActivity {
    Button math, trigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        math =findViewById(R.id.button3);
        trigo =findViewById(R.id.button4);

        math.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Maths_Activity.this, What_math_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        trigo.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Maths_Activity.this, Trigo_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}