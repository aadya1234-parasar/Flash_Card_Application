package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_signup_Activity extends AppCompatActivity {
    Button learn_today;
    TextView go_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        learn_today =findViewById(R.id.button9);

        learn_today.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {


                        Intent kkkk = new Intent(Login_signup_Activity.this, Options_Activity.class);
                        startActivity(kkkk);
                        finish();

                    }


                }
        );




    }
}