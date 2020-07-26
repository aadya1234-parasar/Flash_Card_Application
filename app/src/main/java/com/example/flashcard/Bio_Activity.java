package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bio_Activity extends AppCompatActivity {

    Button bio, dna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        bio =findViewById(R.id.button3);
        dna =findViewById(R.id.button4);

        bio.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Bio_Activity.this, What_bio_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        dna.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Bio_Activity.this, DNA_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}