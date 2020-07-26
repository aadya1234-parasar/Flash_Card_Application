package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English_Activity extends AppCompatActivity {
    Button anto, syno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        anto =findViewById(R.id.button3);
        syno =findViewById(R.id.button4);

        anto.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(English_Activity.this, Antonyms_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        syno.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(English_Activity.this, Synonyms_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}