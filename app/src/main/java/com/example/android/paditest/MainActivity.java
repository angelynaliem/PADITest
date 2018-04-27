package com.example.android.paditest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToWeb(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.padi-internship.com"));
        startActivity(i);
    }

}
