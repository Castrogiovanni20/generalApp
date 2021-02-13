package com.aprc.generalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnComenzar;

    //metoodo principal del activity - para iniciar la primera pantalla
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComenzar = (Button) findViewById(R.id.btnComenzar);

        //este evento luego envia a la proxima pantalla
        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TablaAnotaciones.class);
                //es un metodo para iniciar otro layout
                startActivity(intent);
            }
        });
    }
}
