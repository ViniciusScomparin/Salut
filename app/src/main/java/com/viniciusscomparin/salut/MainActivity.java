package com.viniciusscomparin.salut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private Button buttonComecar;
    private CheckBox checkCiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buttonComecar = findViewById(R.id.buttonComecar);
        checkCiente = findViewById(R.id.checkCiente);
    }

    @Override
    protected void onStart() {
        super.onStart();
        checkCiente.setChecked(false);
    }
    /*public void checkComecar (){
            checkCiente.isChecked();
        }*/
    public void telaStatus(View view){
        //checkComecar ();

        if(checkCiente.isChecked() == true){
            Intent intent = new Intent(this, InformativoActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Necessário aceitar os termos", Toast.LENGTH_LONG).show();
        }
    }
}
