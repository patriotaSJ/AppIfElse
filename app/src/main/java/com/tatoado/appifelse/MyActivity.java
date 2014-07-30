package com.tatoado.appifelse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends ActionBarActivity {


    EditText et;
    Button btnAccion;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        et = (EditText) findViewById(R.id.etEdad);
        btnAccion = (Button) findViewById(R.id.btnAccion);
        tv = (TextView) findViewById(R.id.tvEdad);

        btnAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "accion", Toast.LENGTH_SHORT).show();
                int auxEntero = 0;
                String aux = et.getText().toString();

                //if(!aux.matches("")){  //aux != null
                try {
                    auxEntero = Integer.parseInt(aux);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "pone un número!!", Toast.LENGTH_SHORT).show();
                };

                if(auxEntero >= 18)
                    tv.setText("es mayor de edad");
                    else
                        tv.setText("es menor de edad");



            }
        });
    }

}
