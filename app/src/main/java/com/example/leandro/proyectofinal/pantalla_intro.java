package com.example.leandro.proyectofinal;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla_intro extends AppCompatActivity {
    Button atras;
    Button siguiente2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_intro);

        atras = (Button) findViewById(R.id.btn2);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras = new Intent(pantalla_intro.this, pantalla_inicial.class);
                startActivity(atras);
            }
        });
        siguiente2 = (Button) findViewById(R.id.btn3);
        siguiente2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent siguiente_2 = new Intent(pantalla_intro.this, pantalla_inicial.class);
                startActivity(siguiente_2);
            }
        });


    }
}


