package com.viniciusscomparin.salut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class StatusBadActivity extends AppCompatActivity {

    private CheckBox checkFaltaAr, checkTosseSeca, checkDorCorpo, checkFadiga, checkRisco;// checkVacina;
    private RadioButton radioFebre37, radioFebre39, radioFebre41, radioDoisDias, radioTresACinco, radioMaisDeSeis, radioSemFebre, radioHoje;
    /*private RadioButton radioFebre39;
    private RadioButton radioFebre41;
    private RadioButton radioDoisDias;
    private RadioButton radioTresACinco;
    private RadioButton radioMaisDeSeis;
    private RadioButton radioSemFebre;

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bad);

        // CheckBox Sintomas
        checkFaltaAr = findViewById(R.id.checkFaltaAr);
        checkTosseSeca = findViewById(R.id.checkTosseSeca);
        checkDorCorpo = findViewById(R.id.checkDorCorpo);
        checkFadiga = findViewById(R.id.checkFadiga);

        // RadioButton Febre
        radioSemFebre = findViewById(R.id.radioSemFebre);
        radioFebre37 = findViewById(R.id.radioFebre37);
        radioFebre39 = findViewById(R.id.radioFebre39);
        radioFebre41 = findViewById(R.id.radioFebre41);

        // RadioButton Tempo
        radioDoisDias = findViewById(R.id.radioDoisDias);
        radioTresACinco = findViewById(R.id.radioTresACinco);
        radioMaisDeSeis = findViewById(R.id.radioMaisDeSeis);
        radioHoje = findViewById(R.id.radioHoje);

        // CheckBox Risco
        checkRisco = findViewById(R.id.checkRisco);

        // CheckBox Vacina
        //checkVacina = findViewById(R.id.checkVacina);

    }

    private int valor;

    public void criticidade(View view) {
        valor = 0;
        if (checkFaltaAr.isChecked() == true) {
            valor = valor + 5;
            //valor += 5;
        }
        //######################################################################################################################
        if (checkTosseSeca.isChecked() == true) {
            valor = valor + 1;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        }
        //######################################################################################################################
        if (checkDorCorpo.isChecked() == true) {
            valor = valor + 1;
        }
        //######################################################################################################################
        if (checkFadiga.isChecked() == true) {
            valor = valor + 1;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        }
        //######################################################################################################################

        // Verificação RadioButton Febre
        if (radioSemFebre.isChecked()) {
            valor = valor + 0;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        } else if (radioFebre37.isChecked()) {
            //Procurar auxilio / ficar em casa
            valor = valor + 2;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        } else if (radioFebre39.isChecked()) {
            valor = valor + 3;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        } else if (radioFebre41.isChecked()) {
            valor = valor + 4;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        }
        // Verificação RadioButton Tempo
        if (radioHoje.isChecked()) {
            valor += 0;
         } else if (radioDoisDias.isChecked()) {
            valor = valor + 2;
            //Toast.makeText(this, "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        } else if (radioTresACinco.isChecked()) {
            valor = valor + 4;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        } else if (radioMaisDeSeis.isChecked()) {
            valor = valor + 6;
            //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_SHORT).show();
        }

        if (checkRisco.isChecked() == true) {
            valor = valor + 5;
        }

        if (valor <= 7) {
            Intent intentHome = new Intent(this, StayHomeActivity.class);
            startActivity(intentHome);
        } else if (valor > 7 && valor <= 9) {
            Intent intentAtention = new Intent(this, AtentionActivity.class);
            startActivity(intentAtention);
            //Toast.makeText(getApplicationContext(), "Criticidade: " + criticidade, Toast.LENGTH_LONG).show();
        } else {
            Intent intentDoctor = new Intent(this, GoDoctorActivity.class);
            startActivity(intentDoctor);
        }
        //Toast.makeText(getApplicationContext(), "Criticidade: " + valor, Toast.LENGTH_LONG).show();

    }


        /*if (checkVacina.isChecked() == true && (checkFaltaAr.isChecked() == true || checkTosseSeca.isChecked() == true ||
                checkDorCorpo.isChecked() == true || checkFadiga.isChecked() == true)) {
            valor = valor * 1.5;
        } else if(checkVacina.isChecked() == true && checkFaltaAr.isChecked() == false && checkTosseSeca.isChecked() == false &&
                checkDorCorpo.isChecked() == false && checkFadiga.isChecked() == false){
            valor = valor + 0;
        }else if (checkVacina.isChecked() == false){
            valor = valor + 0;
        }

         */
}
