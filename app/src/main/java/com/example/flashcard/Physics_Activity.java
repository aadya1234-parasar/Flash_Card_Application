package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Physics_Activity extends AppCompatActivity {
    Button physics, current, magnetism, alternating, gravitation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        physics =findViewById(R.id.button3);
        current =findViewById(R.id.button4);
        magnetism =findViewById(R.id.button5);
        alternating =findViewById(R.id.button6);
        gravitation =findViewById(R.id.button7);

        physics.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Physics_Activity.this, What_physics_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        current.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Physics_Activity.this, Current_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        magnetism.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Physics_Activity.this, Magnetism_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        alternating.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Physics_Activity.this, Alternating_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        gravitation.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Physics_Activity.this, Gravitation_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}