package com.example.leandro.proyectofinal;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantalla_2 extends AppCompatActivity {
    Button atras2;
    Button siguiente3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_2);

        atras2 = (Button) findViewById(R.id.btn4);
        atras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras2 = new Intent(pantalla_2.this, pantalla_intro.class);
                startActivity(atras2);
            }
        });
        siguiente3 = (Button) findViewById(R.id.btn5);
        siguiente3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent siguiente_3 = new Intent(pantalla_2.this, pantalla_inicial.class);
                startActivity(siguiente_3);
            }
        });


    }
}