package com.angelos.shoppingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivityPlus extends AbstractActivity{



    @Override
    int getLayout() {
        return R.layout.login_page;
    }

    @Override
    void UiSetup() {
        Button loginBtn = findViewById(R.id.main_btn_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               EditText username = (EditText) findViewById(R.id.username_field);
              EditText password = (EditText) findViewById(R.id.password_field);

               int counter = 3;

                   if (username.getText().toString().equals("angelos") && password.getText().toString().equals("angelos")) {

                        Intent intent = new Intent(MainActivityPlus.this, SecondActivity.class);

                         startActivity(intent);

                   } else {
                        Toast.makeText(getApplicationContext(), "Wrong password or username", Toast.LENGTH_SHORT).show();
                        counter --;
                        if(counter == 0) {
                            stopOperations();

                        }
                    }

            }

    });


        ImageView backButton = findViewById(R.id.arrow_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityPlus.this.finish();
            }


        });



    }

    @Override
    void startOperations() {

    }

    @Override
    void stopOperations() {

    }
}
