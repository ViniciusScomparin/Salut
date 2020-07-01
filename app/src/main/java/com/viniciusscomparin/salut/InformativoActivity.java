package com.viniciusscomparin.salut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InformativoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informativo);
    }
    public void telaStatusGood(View view){
        Intent intent = new Intent(this, StatusGoodActivity.class);
        startActivity(intent);
    }

    public void telaStatusBad(View view){
        Intent intent = new Intent(this, StatusBadActivity.class);
        startActivity(intent);
    }
}
