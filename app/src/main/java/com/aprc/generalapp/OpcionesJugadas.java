package com.aprc.generalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//se declara la clase
public class OpcionesJugadas extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4;

    //metodo principal e indispensable de todas las clases
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_jugadas);

        //declaracion de los botones
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        //declaracion de las variables
        String opcion = getIntent().getExtras().getString("opcion");
        String jugador = getIntent().getExtras().getString("jugador");

        //llamada al metodo:
        setearValoresBotones(opcion);

        //llamada al metodo:
        enviarValor(btn1, opcion, jugador);
        enviarValor(btn2, opcion, jugador);
        enviarValor(btn3, opcion, jugador);
        enviarValor(btn4, opcion, jugador);
    }


    //----------desde aca A-------------------------------------------------------------

    //metodo: al apretar el boton dentro de las opciones de puntaje

// funcionaba sin cambiar las claves en string!
//    private void enviarValor(final Button button, final String opcion, final String jugador){
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), TablaAnotaciones.class);
//                intent.putExtra("valor_jug".concat(jugador).concat("_").concat(opcion), Integer.parseInt(button.getText().toString()));
//
//                //intent.putExtra("valor_jug".concat(jugador).concat("_opc").concat(opcion), Integer.parseInt(button.getText().toString()));
//                startActivity(intent);
//            }
//        });
//    }

//agregado y modificado con claves string
    private void enviarValor(final Button button, final String opcion, final String jugador){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TablaAnotaciones.class);
               // intent.putExtra("valor_jug".concat(jugador).concat("_").concat(opcion), Integer.parseInt(button.getText().toString()));

                intent.putExtra("valor_jug".concat(jugador).concat("_").concat(opcion), button.getText().toString());

                startActivity(intent);
            }
        });
    }


    //--------------hasta aca A----------------------------------------------------


    //este metodo es el que muestra el valor correpondiente de cada boton en cada opcion de juego posible
    public void setearValoresBotones(String opcion){
        switch (opcion) {
            case "escalera":
                btn1.setText("20");
                btn2.setText("25");
                btn3.setText("Tachar");
                btn4.setText("Borrar");
                break;
            case "full":
                btn1.setText("30");
                btn2.setText("35");
                btn3.setText("Tachar");
                btn4.setText("Borrar");
                break;
            case "poker":
                btn1.setText("40");
                btn2.setText("45");
                btn3.setText("Tachar");
                btn4.setText("Borrar");
                break;
            case "generala":
                btn1.setText("50");
                btn2.setText("55");
                btn3.setText("Tachar");
                btn4.setText("Borrar");
                break;
            case "doble_generala":
                btn1.setText("100");
                btn2.setText("105");
                btn3.setText("Tachar");
                btn4.setText("Borrar");
                break;
        }
    }
}
