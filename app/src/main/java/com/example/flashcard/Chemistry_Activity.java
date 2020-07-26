package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chemistry_Activity extends AppCompatActivity {
    Button chem, atom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);

        chem =findViewById(R.id.button3);
        atom =findViewById(R.id.button4);

        chem.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Chemistry_Activity.this, What_chem_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );

        atom.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Chemistry_Activity.this, Atom_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );
    }
}