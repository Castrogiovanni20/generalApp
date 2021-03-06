package com.aprc.generalapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//se declara la clase
public class OpcionesNumericas extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    //metodo principal e indispensable de todas las clases
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_numericas);

        //declaracion de los botones
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btnTachar);
        btn7 = findViewById(R.id.btnBorrar);


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
        enviarValor(btn5, opcion, jugador);
        enviarValor(btn6, opcion, jugador);
        enviarValor(btn7, opcion, jugador);
    }

    //metodo: al apretar el boton dentro de las opciones de puntaje
    private void enviarValor(final Button button, final String opcion, final String jugador){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TablaAnotaciones.class);

                //para enviar la clave como int
                //intent.putExtra("valor_jug".concat(jugador).concat("_opc").concat(opcion), Integer.parseInt(button.getText().toString()));

                //para enviar la clave como String
                //intent.putExtra("valor_jug".concat(jugador).concat("_opc").concat(opcion), button.getText().toString());
                //String pruebaClave = "valor_jug".concat(jugador).concat("_opc").concat(opcion);
                //Log.d("pruebaCl", pruebaClave);
                intent.putExtra("valor_jug".concat(jugador).concat("_opc").concat(opcion),button.getText().toString());
                startActivity(intent);
            }
        });
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------

    //este metodo es el que muestra el valor correpondiente de cada boton en cada opcion de juego posible
    public void setearValoresBotones(String opcion){
        switch (opcion) {
            case "1":
                btn1.setText("1");
                btn2.setText("2");
                btn3.setText("3");
                btn4.setText("4");
                btn5.setText("5");
                btn6.setText("999");
                btn7.setText("-5");
                break;
            case "2":
                btn1.setText("2");
                btn2.setText("4");
                btn3.setText("6");
                btn4.setText("8");
                btn5.setText("10");
                btn6.setText("999");
                btn7.setText("-5");
                break;
            case "3":
                btn1.setText("3");
                btn2.setText("6");
                btn3.setText("9");
                btn4.setText("12");
                btn5.setText("15");
                btn6.setText("999");
                btn7.setText("-5");
                break;
            case "4":
                btn1.setText("4");
                btn2.setText("8");
                btn3.setText("12");
                btn4.setText("16");
                btn5.setText("20");
                btn6.setText("999");
                btn7.setText("-5");
                break;
            case "5":
                btn1.setText("5");
                btn2.setText("10");
                btn3.setText("15");
                btn4.setText("20");
                btn5.setText("25");
                btn6.setText("999");
                btn7.setText("-5");
                break;
            case "6":
                btn1.setText("6");
                btn2.setText("12");
                btn3.setText("18");
                btn4.setText("24");
                btn5.setText("30");
                btn6.setText("999");
                btn7.setText("-5");
                break;
        }
    }

}
