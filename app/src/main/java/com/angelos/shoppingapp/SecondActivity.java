package com.angelos.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AbstractActivity {


    @Override
    int getLayout() {
        return R.layout.activity_second;
    }




     @Override
    void UiSetup() {


        TextView puppy = findViewById(R.id.dog_puppy);
        puppy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, PuppyActivity.class);
                startActivity(intent1);


            }
        });
        TextView adultDog = findViewById(R.id.dog_adult);
        adultDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SecondActivity.this, AdultDogActivity.class);
                startActivity(intent2);


            }
        });

        TextView senorDog = findViewById(R.id.dog_senor);
        senorDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(SecondActivity.this, SenorDogActivity.class);
                startActivity(intent3);


            }
        });

        TextView sickDog = findViewById(R.id.dog_sick);
        sickDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, SickDogActivity.class);
                startActivity(intent1);


            }
        });

        Button backButton = findViewById(R.id.logout_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(SecondActivity.this, MainActivityPlus.class);
                startActivity(intent5);
            }


        });
         Button bt;

         bt = (Button) findViewById(R.id.share_button);

         bt.setOnClickListener(new View.OnClickListener () {

             @Override
             public void onClick(View v){
                 Intent myIntent = new Intent(Intent.ACTION_SEND);
                 myIntent.setType("text/plain");
                 String body = "share the app with other dog owners";
                 String sub = "dog food";
                 myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                 myIntent.putExtra(Intent.EXTRA_TEXT,body);
                 startActivity(Intent.createChooser(myIntent, "Share Using"));

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