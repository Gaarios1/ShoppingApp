package com.angelos.shoppingapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class AbstractActivity extends AppCompatActivity {

    abstract int getLayout();

    abstract void UiSetup();

    abstract  void startOperations();

    abstract void stopOperations();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        UiSetup();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        startOperations();
    }

    @Override
    protected void onPause() {

        stopOperations();
        super.onPause();

    }
}
