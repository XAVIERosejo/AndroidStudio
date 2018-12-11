package com.eduardo.imc;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CALCULAR (View view){
        TextView txtpeso = (EditText)findViewById(R.id.txtpeso);
        TextView txtestatura = (EditText)findViewById(R.id.txtestatura);

        double peso = Double.parseDouble(txtpeso.getText().toString());
        double estatura= Double.parseDouble(txtestatura.getText().toString());

        double resultado = peso/(estatura*estatura);

        TextView txtresultado = (TextView) findViewById(R.id.txtresultado);

        if(resultado<18){
            txtresultado.setText("Peso Bajo. Necesario Valorar signos de desnutrición."+resultado);
        } else if(resultado<24.9){
            txtresultado.setText("Normal.");
        } else if(resultado<26.9){
            txtresultado.setText("Sobrepeso.");
        } else if(resultado<29.9){
            txtresultado.setText("Sobrepeso, Grado I.");
        } else if(resultado<29.9){
            txtresultado.setText("Sobrepeso, Grado II.");
        } else if(resultado<40){
            txtresultado.setText("Sobrepeso, Grado III.");
        }
    }
}
