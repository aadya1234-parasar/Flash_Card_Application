package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Current_Activity extends AppCompatActivity {
    Button known, unknown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current);

        known =findViewById(R.id.button14);
        unknown =findViewById(R.id.button13);

        known.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Current_Activity.this, Magnetism_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        unknown.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Current_Activity.this, Physics_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}