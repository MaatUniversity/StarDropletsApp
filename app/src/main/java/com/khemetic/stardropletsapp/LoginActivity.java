package com.khemetic.stardropletsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    ImageView iv_google_login;
    ImageView iv_twitter_login;
    ImageView iv_linkedin_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setOnClick();
    }

    private void setOnClick() {
        onClickGoogleLoginBtn();
        onClickTwitterLoginBtn();
        onClickLinkedInLoginBtn();
    }

    private void onClickGoogleLoginBtn() {
        iv_google_login = findViewById(R.id.iv_google_login);
        iv_google_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onClickTwitterLoginBtn() {
        iv_twitter_login = findViewById(R.id.iv_twitter_login);
        iv_twitter_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onClickLinkedInLoginBtn() {
        iv_linkedin_login = findViewById(R.id.iv_linkedin_login);
        iv_linkedin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}