package com.aprc.generalapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TablaAnotaciones extends AppCompatActivity {
    private TextView txtView_jug1_opc1, txtView_jug1_opc2, txtView_jug1_opc3, txtView_jug1_opc4, txtView_jug1_opc5, txtView_jug1_opc6;
    private TextView txtView_jug1_escalera, txtView_jug1_full, txtView_jug1_poker, txtView_jug1_generala, txtView_jug1_doble_generala;
    private TextView txtView_jug2_opc1, txtView_jug2_opc2, txtView_jug2_opc3, txtView_jug2_opc4, txtView_jug2_opc5, txtView_jug2_opc6;
    private TextView txtView_jug2_escalera, txtView_jug2_full, txtView_jug2_poker, txtView_jug2_generala, txtView_jug2_doble_generala;
    private TextView txtView_jug1_total, txtView_jug2_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_anotaciones);

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

        // Jugador 1
        txtView_jug1_opc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "1");
                startActivity(intent);
            }
        });

        txtView_jug1_opc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "2");
                startActivity(intent);
            }
        });

        txtView_jug1_opc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "3");
                startActivity(intent);
            }
        });

        txtView_jug1_opc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "4");
                startActivity(intent);
            }
        });

        txtView_jug1_opc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "5");
                startActivity(intent);
            }
        });

        txtView_jug1_opc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "6");
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


        // Jugador 2
        txtView_jug2_opc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "1");
                startActivity(intent);
            }
        });

        txtView_jug2_opc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "2");
                startActivity(intent);
            }
        });

        txtView_jug2_opc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "3");
                startActivity(intent);
            }
        });

        txtView_jug2_opc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "4");
                startActivity(intent);
            }
        });

        txtView_jug2_opc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "5");
                startActivity(intent);
            }
        });

        txtView_jug2_opc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OpcionesNumericas.class);
                intent.putExtra("opcion", "6");
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
    }
}
