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

        if (getIntent().getExtras() != null){

            //asignacion de valores en los arrays de cada jugador
            // Jugador 1
            if ((getIntent().getExtras().getInt(("valor_jug1_opc1")) != 0)) {
                Integer valor_jug1_opc1 = getIntent().getExtras().getInt("valor_jug1_opc1");
                intArrayJug1[0] = valor_jug1_opc1;
            }

            if (getIntent().getExtras().getInt("valor_jug1_opc2") != 0) {
                Integer valor_jug1_opc2 = getIntent().getExtras().getInt("valor_jug1_opc2");
                intArrayJug1[1] = valor_jug1_opc2;
            }

            if (getIntent().getExtras().getInt("valor_jug1_opc3") != 0) {
                Integer valor_jug1_opc3 = getIntent().getExtras().getInt("valor_jug1_opc3");
                intArrayJug1[2] = valor_jug1_opc3;
            }

            if (getIntent().getExtras().getInt("valor_jug1_opc4") != 0) {
                Integer valor_jug1_opc4 = getIntent().getExtras().getInt("valor_jug1_opc4");
                intArrayJug1[3] = valor_jug1_opc4;
            }

            if (getIntent().getExtras().getInt("valor_jug1_opc5") != 0) {
                Integer valor_jug1_opc5 = getIntent().getExtras().getInt("valor_jug1_opc5");
                intArrayJug1[4] = valor_jug1_opc5;
            }

            if (getIntent().getExtras().getInt("valor_jug1_opc6") != 0) {
                Integer valor_jug1_opc6 = getIntent().getExtras().getInt("valor_jug1_opc6");
                intArrayJug1[5] = valor_jug1_opc6;
            }

            //----------------------desde aca son las opcionesJugadas - Jugador1---------------------------

            if (getIntent().getExtras().getInt("valor_jug1_escalera") != 0) {
                Integer valor_jug1_escalera = getIntent().getExtras().getInt("valor_jug1_escalera");
                intArrayJug1[6] = valor_jug1_escalera;
            }

            if (getIntent().getExtras().getInt("valor_jug1_full") != 0) {
                Integer valor_jug1_full = getIntent().getExtras().getInt("valor_jug1_full");
                intArrayJug1[7] = valor_jug1_full;
            }

            if (getIntent().getExtras().getInt("valor_jug1_poker") != 0) {
                Integer valor_jug1_poker = getIntent().getExtras().getInt("valor_jug1_poker");
                intArrayJug1[8] = valor_jug1_poker;
            }

            if (getIntent().getExtras().getInt("valor_jug1_generala") != 0) {
                Integer valor_jug1_generala = getIntent().getExtras().getInt("valor_jug1_generala");
                intArrayJug1[9] = valor_jug1_generala;
            }

            if (getIntent().getExtras().getInt("valor_jug1_doble_generala") != 0) {
                Integer valor_jug1_doble_generala = getIntent().getExtras().getInt("valor_jug1_doble_generala");
                intArrayJug1[10] = valor_jug1_doble_generala;
            }

            if (getIntent().getExtras().getInt("valor_jug1_total") != 0) {
                Integer valor_jug1_total = getIntent().getExtras().getInt("valor_jug1_total");
                intArrayJug1[11] = valor_jug1_total;
            }

            // Jugador 2 - OpcionesNumericas------------------------------------------------------
            if (getIntent().getExtras().getInt("valor_jug2_opc1") != 0) {
                Integer valor_jug2_opc1 = getIntent().getExtras().getInt("valor_jug2_opc1");
                intArrayJug2[0] = valor_jug2_opc1;
            }

            if (getIntent().getExtras().getInt("valor_jug2_opc2") != 0) {
                Integer valor_jug2_opc2 = getIntent().getExtras().getInt("valor_jug2_opc2");
                intArrayJug2[1] = valor_jug2_opc2;
            }

            if (getIntent().getExtras().getInt("valor_jug2_opc3") != 0) {
                Integer valor_jug2_opc3 = getIntent().getExtras().getInt("valor_jug2_opc3");
                intArrayJug2[2] = valor_jug2_opc3;
            }

            if (getIntent().getExtras().getInt("valor_jug2_opc4") != 0) {
                Integer valor_jug2_opc4 = getIntent().getExtras().getInt("valor_jug2_opc4");
                intArrayJug2[3] = valor_jug2_opc4;
            }

            if (getIntent().getExtras().getInt("valor_jug2_opc5") != 0) {
                Integer valor_jug2_opc5 = getIntent().getExtras().getInt("valor_jug2_opc5");
                intArrayJug2[4] = valor_jug2_opc5;
            }

            if (getIntent().getExtras().getInt("valor_jug2_opc6") != 0) {
                Integer valor_jug2_opc6 = getIntent().getExtras().getInt("valor_jug2_opc6");
                intArrayJug2[5] = valor_jug2_opc6;
            }
            //----------------------desde aca son las opcionesJugadas - Jugador2---------------------------

            if (getIntent().getExtras().getInt("valor_jug2_escalera") != 0) {
                Integer valor_jug2_escalera = getIntent().getExtras().getInt("valor_jug2_escalera");
                intArrayJug2[6] = valor_jug2_escalera;
            }

            if (getIntent().getExtras().getInt("valor_jug2_full") != 0) {
                Integer valor_jug2_full = getIntent().getExtras().getInt("valor_jug2_full");
                intArrayJug2[7] = valor_jug2_full;
            }

            if (getIntent().getExtras().getInt("valor_jug2_poker") != 0) {
                Integer valor_jug2_poker = getIntent().getExtras().getInt("valor_jug2_poker");
                intArrayJug2[8] = valor_jug2_poker;
            }

            if (getIntent().getExtras().getInt("valor_jug2_generala") != 0) {
                Integer valor_jug2_generala = getIntent().getExtras().getInt("valor_jug2_generala");
                intArrayJug2[9] = valor_jug2_generala;
            }

            if (getIntent().getExtras().getInt("valor_jug2_doble_generala") != 0) {
                Integer valor_jug2_doble_generala = getIntent().getExtras().getInt("valor_jug2_doble_generala");
                intArrayJug2[10] = valor_jug2_doble_generala;
            }

            if (getIntent().getExtras().getInt("valor_jug2_total") != 0) {
                Integer valor_jug2_total = getIntent().getExtras().getInt("valor_jug2_total");
                intArrayJug2[11] = valor_jug2_total;
            }
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
                Intent intent = new Intent(getApplicationContext(), PodioGanador.class);
                startActivity(intent);
            }
        });


        //cuando se presiona el elemento de la tabla correspondiente se realiza un evento y vincula con la
        // clase correpondiente sea OpcionesNumericas u OpcionesJugadas
        // Jugador 1
        txtView_jug1_opc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                //envia valores a la otra clase
                intent.putExtra("opcion", "1");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_opc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "2");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_opc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "3");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_opc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "4");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_opc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "5");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_opc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "6");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_escalera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "escalera");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "full");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_poker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "poker");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "generala");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_doble_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "doble_generala");
                intent.putExtra("jugador", "1");
                startActivity(intent);
            }
        });

        // Jugador 2
        txtView_jug2_opc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "1");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_opc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "2");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_opc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "3");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_opc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "4");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_opc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "5");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_opc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "6");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_escalera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "escalera");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "full");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_poker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "poker");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "generala");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_doble_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "doble_generala");
                intent.putExtra("jugador", "2");
                startActivity(intent);
            }
        });

        //Mapea el valor del array en el elemento del layout
        // Jug 1
        if (intArrayJug1[0] != 0){
            txtView_jug1_opc1.setText(String.valueOf(intArrayJug1[0]));
        }

        if (intArrayJug1[1] != 0){
            txtView_jug1_opc2.setText(String.valueOf(intArrayJug1[1]));
        }

        if (intArrayJug1[2] != 0){
            txtView_jug1_opc3.setText(String.valueOf(intArrayJug1[2]));
        }

        if (intArrayJug1[3] != 0){
            txtView_jug1_opc4.setText(String.valueOf(intArrayJug1[3]));
        }

        if (intArrayJug1[4] != 0){
            txtView_jug1_opc5.setText(String.valueOf(intArrayJug1[4]));
        }

        if (intArrayJug1[5] != 0){
            txtView_jug1_opc6.setText(String.valueOf(intArrayJug1[5]));
        }

        //------------------A desde aca opcionesJugadas - jugador1-------------------------------------------------

        if (intArrayJug1[6] != 0){
            txtView_jug1_escalera.setText(String.valueOf(intArrayJug1[6]));
        }

        if (intArrayJug1[7] != 0){
            txtView_jug1_full.setText(String.valueOf(intArrayJug1[7]));
        }

        if (intArrayJug1[8] != 0){
            txtView_jug1_poker.setText(String.valueOf(intArrayJug1[8]));
        }

        if (intArrayJug1[9] != 0){
            txtView_jug1_generala.setText(String.valueOf(intArrayJug1[9]));
        }

        if (intArrayJug1[10] != 0){
            txtView_jug1_doble_generala.setText(String.valueOf(intArrayJug1[10]));
        }

        if (intArrayJug1[11] != 0){
            txtView_jug1_total.setText(String.valueOf(intArrayJug1[11]));
        }

        //---------------A hasta aca------------------------------------------------------


        // Jug 2
        if (intArrayJug2[0] != 0){
            txtView_jug2_opc1.setText(String.valueOf(intArrayJug2[0]));
        }

        if (intArrayJug2[1] != 0){
            txtView_jug2_opc2.setText(String.valueOf(intArrayJug2[1]));
        }

        if (intArrayJug2[2] != 0){
            txtView_jug2_opc3.setText(String.valueOf(intArrayJug2[2]));
        }

        if (intArrayJug2[3] != 0){
            txtView_jug2_opc4.setText(String.valueOf(intArrayJug2[3]));
        }

        if (intArrayJug2[4] != 0){
            txtView_jug2_opc5.setText(String.valueOf(intArrayJug2[4]));
        }

        if (intArrayJug2[5] != 0){
            txtView_jug2_opc6.setText(String.valueOf(intArrayJug2[5]));
        }

        //------------------A desde aca opcionesJugadas - jugador2-------------------------------------------------

        if (intArrayJug2[6] != 0){
            txtView_jug2_escalera.setText(String.valueOf(intArrayJug2[6]));
        }

        if (intArrayJug2[7] != 0){
            txtView_jug2_full.setText(String.valueOf(intArrayJug2[7]));
        }

        if (intArrayJug2[8] != 0){
            txtView_jug2_poker.setText(String.valueOf(intArrayJug2[8]));
        }

        if (intArrayJug2[9] != 0){
            txtView_jug2_generala.setText(String.valueOf(intArrayJug2[9]));
        }

        if (intArrayJug2[10] != 0){
            txtView_jug2_doble_generala.setText(String.valueOf(intArrayJug2[10]));
        }

        if (intArrayJug2[11] != 0){
            txtView_jug2_total.setText(String.valueOf(intArrayJug2[11]));
        }



    }

}
