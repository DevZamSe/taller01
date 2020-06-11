package com.devzamse.taller001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText esteTexto;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.boton);
        esteTexto = findViewById(R.id.texto);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                string = esteTexto.getText().toString();

                Log.e("texto", string);

                if(string.equals("temple")){
                    Intent temple = new Intent(MainActivity.this, actividsegunda.class);
                    startActivity(temple);
                } else {
                    Toast.makeText(MainActivity.this, "Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
