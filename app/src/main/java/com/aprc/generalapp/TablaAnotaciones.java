package com.aprc.generalapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//crear la clase tablaAnotaciones - AppCompatActivity la superclase
public class TablaAnotaciones extends AppCompatActivity {

    //declaracion de variables de todos los juegos posibles
    private TextView txtView_jug1_opc1, txtView_jug1_opc2, txtView_jug1_opc3, txtView_jug1_opc4, txtView_jug1_opc5, txtView_jug1_opc6;
    private TextView txtView_jug1_escalera, txtView_jug1_full, txtView_jug1_poker, txtView_jug1_generala, txtView_jug1_doble_generala;
    private TextView txtView_jug2_opc1, txtView_jug2_opc2, txtView_jug2_opc3, txtView_jug2_opc4, txtView_jug2_opc5, txtView_jug2_opc6;
    private TextView txtView_jug2_escalera, txtView_jug2_full, txtView_jug2_poker, txtView_jug2_generala, txtView_jug2_doble_generala;
    private TextView txtView_jug1_total, txtView_jug2_total;
    private Button btnSumar;

    //declaracion de un array para cada jugador
    private static int[] intArrayJug1 = new int[12];
    private static int[] intArrayJug2 = new int[12];

    //este metodo es el primero que se debe activar - tiene que estar siempre
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_anotaciones);

        if (getIntent().getExtras() != null) {

            //asignacion de valores en los arrays de cada jugador
            // Jugador 1

            asignarValor("valor_jug1_opc1", intArrayJug1, 0);
            asignarValor("valor_jug1_opc2", intArrayJug1, 1);
            asignarValor("valor_jug1_opc3", intArrayJug1, 2);
            asignarValor("valor_jug1_opc4", intArrayJug1, 3);
            asignarValor("valor_jug1_opc5", intArrayJug1, 4);
            asignarValor("valor_jug1_opc6", intArrayJug1, 5);
            //----------------------desde aca son las opcionesJugadas - Jugador1---------------------------
            asignarValor("valor_jug1_escalera", intArrayJug1, 6);
            asignarValor("valor_jug1_full", intArrayJug1, 7);
            asignarValor("valor_jug1_poker", intArrayJug1, 8);
            asignarValor("valor_jug1_generala", intArrayJug1, 9);
            asignarValor("valor_jug1_doble_generala", intArrayJug1, 10);
            asignarValor("valor_jug1_total", intArrayJug1, 11);
            // Jugador 2 - OpcionesNumericas------------------------------------------------------
            asignarValor("valor_jug2_opc1", intArrayJug2, 0);
            asignarValor("valor_jug2_opc2", intArrayJug2, 1);
            asignarValor("valor_jug2_opc3", intArrayJug2, 2);
            asignarValor("valor_jug2_opc4", intArrayJug2, 3);
            asignarValor("valor_jug2_opc5", intArrayJug2, 4);
            asignarValor("valor_jug2_opc6", intArrayJug2, 5);
            //----------------------desde aca son las opcionesJugadas - Jugador2---------------------------
            asignarValor("valor_jug2_escalera", intArrayJug2, 6);
            asignarValor("valor_jug2_full", intArrayJug2, 7);
            asignarValor("valor_jug2_poker", intArrayJug2, 8);
            asignarValor("valor_jug2_generala", intArrayJug2, 9);
            asignarValor("valor_jug2_doble_generala", intArrayJug2, 10);
            asignarValor("valor_jug2_total", intArrayJug2, 11);
        }
//--------------------------hasta aca----------------------------------------------
        //Boton sumar
        btnSumar = findViewById(R.id.btnSumar);

        //vincular las variables de los juegos con los elementos de los layout (de tablaDeAnotacciones)
        // Variables jugador 1
        txtView_jug1_opc1 = findViewById(R.id.txtView_jug1_opc1);
        txtView_jug1_opc2 = findViewById(R.id.txtView_jug1_opc2);
        txtView_jug1_opc3 = findViewById(R.id.txtView_jug1_opc3);
        txtView_jug1_opc4 = findViewById(R.id.txtView_jug1_opc4);
        txtView_jug1_opc5 = findViewById(R.id.txtView_jug1_opc5);
        txtView_jug1_opc6 = findViewById(R.id.txtView_jug1_opc6);
        txtView_jug1_escalera = findViewById(R.id.txtView_jug1_escalera);
        txtView_jug1_full = findViewById(R.id.txtView_jug1_full);
        txtView_jug1_poker = findViewById(R.id.txtView_jug1_poker);
        txtView_jug1_generala = findViewById(R.id.txtView_jug1_generala);
        txtView_jug1_doble_generala = findViewById(R.id.txtView_jug1_doble_generala);
        txtView_jug1_total = findViewById(R.id.txtView_jug1_total);

        // Variables jugador 2
        txtView_jug2_opc1 = findViewById(R.id.txtView_jug2_opc1);
        txtView_jug2_opc2 = findViewById(R.id.txtView_jug2_opc2);
        txtView_jug2_opc3 = findViewById(R.id.txtView_jug2_opc3);
        txtView_jug2_opc4 = findViewById(R.id.txtView_jug2_opc4);
        txtView_jug2_opc5 = findViewById(R.id.txtView_jug2_opc5);
        txtView_jug2_opc6 = findViewById(R.id.txtView_jug2_opc6);
        txtView_jug2_escalera = findViewById(R.id.txtView_jug2_escalera);
        txtView_jug2_full = findViewById(R.id.txtView_jug2_full);
        txtView_jug2_poker = findViewById(R.id.txtView_jug2_poker);
        txtView_jug2_generala = findViewById(R.id.txtView_jug2_generala);
        txtView_jug2_doble_generala = findViewById(R.id.txtView_jug2_doble_generala);
        txtView_jug2_total = findViewById(R.id.txtView_jug2_total);

        //Marca el evento luego de click en el boton sumar - luego de realizar la suma y establecer ganador/es
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int total1 = sumarValores(intArrayJug1);
                intArrayJug1[11]= total1;

                int total2 = sumarValores(intArrayJug2);
                intArrayJug2[11]= total2;


                //Intent intent = new Intent(getApplicationContext(), PodioGanador.class);
                //startActivity(intent);
            }
        });

        //-------------------------------------------metodo original----------------------------------------------------------
        //Marca el evento luego de click en el boton sumar - luego de realizar la suma y establecer ganador/es
//        btnSumar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), PodioGanador.class);
//                startActivity(intent);
//            }
//        });

        //cuando se presiona el elemento de la tabla correspondiente se realiza un evento y vincula con la
        // clase correpondiente sea OpcionesNumericas u OpcionesJugadas
        // Jugador 1
        seleccionarPuntajeNumericas(txtView_jug1_opc1, "1", "1");
        seleccionarPuntajeNumericas(txtView_jug1_opc2, "2", "1");
        seleccionarPuntajeNumericas(txtView_jug1_opc3, "3", "1");
        seleccionarPuntajeNumericas(txtView_jug1_opc4, "4", "1");
        seleccionarPuntajeNumericas(txtView_jug1_opc5, "5", "1");
        seleccionarPuntajeNumericas(txtView_jug1_opc6, "6", "1");
        seleccionarPuntajeJugadas(txtView_jug1_escalera, "escalera", "1");
        seleccionarPuntajeJugadas(txtView_jug1_full, "full", "1");
        seleccionarPuntajeJugadas(txtView_jug1_poker, "poker", "1");
        seleccionarPuntajeJugadas(txtView_jug1_generala, "generala", "1");
        seleccionarPuntajeJugadas(txtView_jug1_doble_generala, "doble_generala", "1");

        // Jugador 2
        seleccionarPuntajeNumericas(txtView_jug2_opc1, "1", "2");
        seleccionarPuntajeNumericas(txtView_jug2_opc2, "2", "2");
        seleccionarPuntajeNumericas(txtView_jug2_opc3, "3", "2");
        seleccionarPuntajeNumericas(txtView_jug2_opc4, "4", "2");
        seleccionarPuntajeNumericas(txtView_jug2_opc5, "5", "2");
        seleccionarPuntajeNumericas(txtView_jug2_opc6, "6", "2");
        seleccionarPuntajeJugadas(txtView_jug2_escalera, "escalera", "2");
        seleccionarPuntajeJugadas(txtView_jug2_full, "full", "2");
        seleccionarPuntajeJugadas(txtView_jug2_poker, "poker", "2");
        seleccionarPuntajeJugadas(txtView_jug2_generala, "generala", "2");
        seleccionarPuntajeJugadas(txtView_jug2_doble_generala, "doble_generala", "2");


        //Mapea el valor del array en el elemento del layout
        // ------------------------Jugador 1-------------------------------------------------------------------
        mapearValor(intArrayJug1, 0, txtView_jug1_opc1);
        mapearValor(intArrayJug1, 1, txtView_jug1_opc2);
        mapearValor(intArrayJug1, 2, txtView_jug1_opc3);
        mapearValor(intArrayJug1, 3, txtView_jug1_opc4);
        mapearValor(intArrayJug1, 4, txtView_jug1_opc5);
        mapearValor(intArrayJug1, 5, txtView_jug1_opc6);
        //--------------------------- opcionesJugadas - jugador1-------------------------------------------------
        mapearValor(intArrayJug1, 6, txtView_jug1_escalera);
        mapearValor(intArrayJug1, 7, txtView_jug1_full);
        mapearValor(intArrayJug1, 8, txtView_jug1_poker);
        mapearValor(intArrayJug1, 9, txtView_jug1_generala);
        mapearValor(intArrayJug1, 10, txtView_jug1_doble_generala);
        mapearValor(intArrayJug1, 11, txtView_jug1_total);
        //-------------------------Jugador 2-----------------------------------------------------------------------
        mapearValor(intArrayJug2, 0, txtView_jug2_opc1);
        mapearValor(intArrayJug2, 1, txtView_jug2_opc2);
        mapearValor(intArrayJug2, 2, txtView_jug2_opc3);
        mapearValor(intArrayJug2, 3, txtView_jug2_opc4);
        mapearValor(intArrayJug2, 4, txtView_jug2_opc5);
        mapearValor(intArrayJug2, 5, txtView_jug2_opc6);
        //---------------------------- opcionesJugadas - jugador2-------------------------------------------------
        mapearValor(intArrayJug2, 6, txtView_jug2_escalera);
        mapearValor(intArrayJug2, 7, txtView_jug2_full);
        mapearValor(intArrayJug2, 8, txtView_jug2_poker);
        mapearValor(intArrayJug2, 9, txtView_jug2_generala);
        mapearValor(intArrayJug2, 10, txtView_jug2_doble_generala);
        mapearValor(intArrayJug2, 11, txtView_jug2_total);
    }

    //------------------------METODOS--------------------------------------------------------------
//metodo original
//    private void mapearValor(int[] intArrayJug, int i, TextView txtView_jug_opc) {
//        if (intArrayJug[i] != 0) {
//            txtView_jug_opc.setText(String.valueOf(intArrayJug[i]));
//        }
//    }

    private void mapearValor(int[] intArrayJug, int i, TextView txtView_jug_opc) {
        if (intArrayJug[i] != 0) {
            if (intArrayJug[i] == -1) {
                txtView_jug_opc.setText("X");
            } else {
                txtView_jug_opc.setText(String.valueOf(intArrayJug[i]));
            }
        }
    }

    private void seleccionarPuntajeNumericas(TextView txtView_jug_opc, final String opcion, final String jugador) {
        txtView_jug_opc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                //envia valores a la otra clase
                intent.putExtra("opcion", opcion);
                intent.putExtra("jugador", jugador);
                startActivity(intent);
            }
        });
    }

    private void seleccionarPuntajeJugadas(TextView txtView_jug_opc, final String opcion, final String jugador) {
        txtView_jug_opc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                //envia valores a la otra clase
                intent.putExtra("opcion", opcion);
                intent.putExtra("jugador", jugador);
                startActivity(intent);
            }
        });
    }


    //metodo que recibe la clave como String y la convierte a int para asignar los valores del Array
    private void asignarValor(String clave, int[] intArrayJug, int i) {
        String valor_jug_opc = getIntent().getExtras().getString(clave);

        if (valor_jug_opc != (null)) {
            if (!(valor_jug_opc.equals("Tachar")) && !(valor_jug_opc.equals("Borrar"))) {
                Integer valor_jug_opc_int = Integer.parseInt(valor_jug_opc);
                intArrayJug[i] = valor_jug_opc_int;
            } else {
                if (valor_jug_opc.equals("Tachar")) {
                    intArrayJug[i] = -1;
                } else {
                    intArrayJug[i] = 0;
                }
            }
        }
    }

    //metodo sumarValores
    private int sumarValores (int [ ] intArrayJug){
        int acumulador=0;

        for (int i = 0; i < intArrayJug.length-1; i++) {
            int valor = intArrayJug[i];
            if (valor!=-1){
                acumulador = acumulador + valor;
            }
        }
        return acumulador;
    }


//    //metodo sumarValores ------------------------------ metodo original-----------------------------------------------
//    private int sumarValores (int [ ] intArrayJug){
//        int acumulador=0;
//
//        for (int i = 0; i < intArrayJug.length-1; i++) {
//            int valor = intArrayJug[i];
//            if (valor==-1){
//                acumulador = acumulador;
//            }else{
//                acumulador = acumulador + valor;
//            }
//        }
//        return acumulador;
//    }

}