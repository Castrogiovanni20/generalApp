package com.aprc.generalapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OpcionesJugadas extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_jugadas);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        String opcion = getIntent().getExtras().getString("opcion");

        setearValoresBotones(opcion);

    }

    public void setearValoresBotones(String opcion){
        switch (opcion) {
            case "escalera":
                btn1.setText("20");
                btn2.setText("25");
                break;
        }
    }


}
