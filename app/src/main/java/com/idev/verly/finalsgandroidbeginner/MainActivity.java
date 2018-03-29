package com.idev.verly.finalsgandroidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int skorA,skorB = 0;
    TextView textViewSkorA,textViewSkorB,txtskorA,txtskorB;


    String timA,timB = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNamaTim();

    }

    public void setNamaTim() {
        txtskorA = findViewById(R.id.tvTimA);
        txtskorB = findViewById(R.id.tvTimB);
        Intent intent = getIntent();
        timA = intent.getStringExtra("timA");
        timB = intent.getStringExtra("timB");

        txtskorA.setText(timA);
        txtskorB.setText(timB);


    }

    public void displaySkorA(int skorA){
        textViewSkorA = findViewById(R.id.tvScoreA);
        textViewSkorA.setText(String.valueOf(skorA));
    }

    public void displaySkorB(int skorB){
        textViewSkorB = findViewById(R.id.tvScoreB);
        textViewSkorB.setText(String.valueOf(skorB));
    }

    public void tambah3TimA(View view) {
        skorA = skorA + 3;
        displaySkorA(skorA);
    }

    public void tambah2TimA(View view) {
        skorA = skorA + 2;
        displaySkorA(skorA);
    }

    public void tambah1TimA(View view) {
        skorA = skorA + 1;
        displaySkorA(skorA);
    }

    public void tambah3TimB(View view) {
        skorB = skorB + 3;
        displaySkorB(skorB);
    }

    public void tambah2TimB(View view) {
        skorB = skorB + 2;
        displaySkorB(skorB);
    }

    public void tambah1TimB(View view) {
        skorB = skorB + 1;
        displaySkorB(skorB);
    }

    public void reset(View view) {
        skorB = 0;
        skorA = 0;
        displaySkorB(skorB);
        displaySkorB(skorA);
    }
}
