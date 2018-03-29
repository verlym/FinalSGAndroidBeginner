package com.idev.verly.finalsgandroidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InputTeamActivity extends AppCompatActivity {

    EditText etTimA,etTimB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_team);

        etTimA = findViewById(R.id.etTimA);
        etTimB = findViewById(R.id.etTimB);

    }

    public void submit(View view) {
        Intent intent = new Intent(InputTeamActivity.this,MainActivity.class);
        intent.putExtra("timA",etTimA.getText().toString());
        intent.putExtra("timB",etTimB.getText().toString());
        startActivity(intent);
        finish();
    }
}
