package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Arts_Activity extends AppCompatActivity {
    Button history, poly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);

        history =findViewById(R.id.button3);
        poly =findViewById(R.id.button4);

        history.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Arts_Activity.this, History_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        poly.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Arts_Activity.this, Polytics_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}