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

public class TablaAnotaciones extends AppCompatActivity {
    private TextView txtView_jug1_opc1, txtView_jug1_opc2, txtView_jug1_opc3, txtView_jug1_opc4, txtView_jug1_opc5, txtView_jug1_opc6;
    private TextView txtView_jug1_escalera, txtView_jug1_full, txtView_jug1_poker, txtView_jug1_generala, txtView_jug1_doble_generala;
    private TextView txtView_jug2_opc1, txtView_jug2_opc2, txtView_jug2_opc3, txtView_jug2_opc4, txtView_jug2_opc5, txtView_jug2_opc6;
    private TextView txtView_jug2_escalera, txtView_jug2_full, txtView_jug2_poker, txtView_jug2_generala, txtView_jug2_doble_generala;
    private TextView txtView_jug1_total, txtView_jug2_total;
    private Button btnSumar;
    private static int[] intArrayJug1 = new int[12];
    private static int[] intArrayJug2 = new int[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_anotaciones);

        if (getIntent().getExtras() != null) {

            // Jugador 1
<<<<<<< HEAD

            if (!(getIntent().getExtras().getString(("valor_jug1_opc1")).equalsIgnoreCase("0"))
                    && (!getIntent().getExtras().getString(("valor_jug1_opc1")).equalsIgnoreCase("Tachar"))
                    && (!getIntent().getExtras().getString(("valor_jug1_opc1")).equalsIgnoreCase("Borrar"))) {

                Integer valor_jug1_opc1 = Integer.parseInt(getIntent().getExtras().getString(("valor_jug1_opc1")));

=======
            if (getIntent().getExtras().getInt("valor_jug1_opc1") != 0) {
                Integer valor_jug1_opc1 = getIntent().getExtras().getInt("valor_jug1_opc1");
>>>>>>> parent of 155612d... se desarrollo todos los elementos de opcionesJugadas
                intArrayJug1[0] = valor_jug1_opc1;
            } else if ((getIntent().getExtras().getString(("valor_jug1_opc1")).equalsIgnoreCase("Tachar"))) {
                intArrayJug1[0] = -1;
            } else if ((getIntent().getExtras().getString(("valor_jug1_opc1")).equalsIgnoreCase("Borrar"))) {
                intArrayJug1[0] = 0;
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


            // Jugador 2
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


        }

<<<<<<< HEAD
        //TODO--------------------------------para deshabilitar botones--------------------

//       if (!txtView_jug1_opc1.equals(null)){
//           if(!txtView_jug1_opc1.getText().toString().equalsIgnoreCase("0")){
//           txtView_jug1_opc1.setClickable(false);
//            }
//        }


//--------------------------hasta aca----------------------------------------------
        //Boton sumar
=======
>>>>>>> parent of 155612d... se desarrollo todos los elementos de opcionesJugadas
        btnSumar = findViewById(R.id.btnSumar);

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


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PodioGanador.class);
                startActivity(intent);

                //integer resultado = sumar(array);
                //txtView_jug1_total.setText(resultado);

            }
        });

        // Jugador 1
        txtView_jug1_opc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
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
                startActivity(intent);
            }
        });

        txtView_jug1_full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "full");
                startActivity(intent);
            }
        });

        txtView_jug1_poker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "poker");
                startActivity(intent);
            }
        });

        txtView_jug1_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "generala");
                startActivity(intent);
            }
        });

        txtView_jug1_doble_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "doble_generala");
                startActivity(intent);
            }
        });


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
                startActivity(intent);
            }
        });

        txtView_jug2_full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "full");
                startActivity(intent);
            }
        });

        txtView_jug2_poker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "poker");
                startActivity(intent);
            }
        });

        txtView_jug2_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "generala");
                startActivity(intent);
            }
        });

        txtView_jug2_doble_generala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesJugadas.class);
                intent.putExtra("opcion", "doble_generala");
                startActivity(intent);
            }
        });
<<<<<<< HEAD

        //Mapea el valor del array en el elemento del layout
        // Jug 1
        if (intArrayJug1[0] != 0 && intArrayJug1[0] != -1) {
            txtView_jug1_opc1.setText(String.valueOf(intArrayJug1[0]));
        } else if (intArrayJug1[0] == -1) {
            txtView_jug1_opc1.setText("X");
        }

        if (intArrayJug1[1] != 0) {
            txtView_jug1_opc2.setText(String.valueOf(intArrayJug1[1]));
        }

        if (intArrayJug1[2] != 0) {
            txtView_jug1_opc3.setText(String.valueOf(intArrayJug1[2]));
        }

        if (intArrayJug1[3] != 0) {
            txtView_jug1_opc4.setText(String.valueOf(intArrayJug1[3]));
        }

        if (intArrayJug1[4] != 0) {
            txtView_jug1_opc5.setText(String.valueOf(intArrayJug1[4]));
        }

        if (intArrayJug1[5] != 0) {
            txtView_jug1_opc6.setText(String.valueOf(intArrayJug1[5]));
        }

        //------------------A desde aca opcionesJugadas - jugador1-------------------------------------------------

        if (intArrayJug1[6] != 0) {
            txtView_jug1_escalera.setText(String.valueOf(intArrayJug1[6]));
        }

        if (intArrayJug1[7] != 0) {
            txtView_jug1_full.setText(String.valueOf(intArrayJug1[7]));
        }

        if (intArrayJug1[8] != 0) {
            txtView_jug1_poker.setText(String.valueOf(intArrayJug1[8]));
        }

        if (intArrayJug1[9] != 0) {
            txtView_jug1_generala.setText(String.valueOf(intArrayJug1[9]));
        }

        if (intArrayJug1[10] != 0) {
            txtView_jug1_doble_generala.setText(String.valueOf(intArrayJug1[10]));
        }

        if (intArrayJug1[11] != 0) {
            txtView_jug1_total.setText(String.valueOf(intArrayJug1[11]));
        }

        //---------------A hasta aca------------------------------------------------------


        // Jug 2
        if (intArrayJug2[0] != 0) {
            txtView_jug2_opc1.setText(String.valueOf(intArrayJug2[0]));
        }

        if (intArrayJug2[1] != 0) {
            txtView_jug2_opc2.setText(String.valueOf(intArrayJug2[1]));
        }

        if (intArrayJug2[2] != 0) {
            txtView_jug2_opc3.setText(String.valueOf(intArrayJug2[2]));
        }

        if (intArrayJug2[3] != 0) {
            txtView_jug2_opc4.setText(String.valueOf(intArrayJug2[3]));
        }

        if (intArrayJug2[4] != 0) {
            txtView_jug2_opc5.setText(String.valueOf(intArrayJug2[4]));
        }

        if (intArrayJug2[5] != 0) {
            txtView_jug2_opc6.setText(String.valueOf(intArrayJug2[5]));
        }

        //------------------A desde aca opcionesJugadas - jugador2-------------------------------------------------

        if (intArrayJug2[6] != 0) {
            txtView_jug2_escalera.setText(String.valueOf(intArrayJug2[6]));
        }

        if (intArrayJug2[7] != 0) {
            txtView_jug2_full.setText(String.valueOf(intArrayJug2[7]));
        }

        if (intArrayJug2[8] != 0) {
            txtView_jug2_poker.setText(String.valueOf(intArrayJug2[8]));
        }

        if (intArrayJug2[9] != 0) {
            txtView_jug2_generala.setText(String.valueOf(intArrayJug2[9]));
        }

        if (intArrayJug2[10] != 0) {
            txtView_jug2_doble_generala.setText(String.valueOf(intArrayJug2[10]));
        }

        if (intArrayJug2[11] != 0) {
            txtView_jug2_total.setText(String.valueOf(intArrayJug2[11]));
        }


=======
>>>>>>> parent of 155612d... se desarrollo todos los elementos de opcionesJugadas
    }
}


//---------------------------Metodo Sumar------------------------------------------------

//    public int sumar(int[] array){
//        int resultado=0;
//        int i=0;
//
//        for (i=0; i<array.length; i++){
//            if(array[i]!=-1) {
//                resultado = resultado + array[i];
//            }
//        }
//        return resultado;
//    }

