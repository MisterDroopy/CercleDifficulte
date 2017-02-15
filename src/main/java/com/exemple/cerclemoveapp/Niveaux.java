package com.exemple.cerclemoveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Niveaux extends AppCompatActivity implements View.OnClickListener {
    private Button niveau_1=null;
    private Button niveau_2=null;
    private Button niveau_3 = null;
    private Button niveau_4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveaux);

        niveau_1 = (Button) findViewById(R.id.niveau_1);
        niveau_1.setOnClickListener(this);

        niveau_2 = (Button) findViewById(R.id.niveau_2);
        niveau_2.setOnClickListener(this);

        niveau_3 = (Button) findViewById(R.id.niveau_3);
        niveau_3.setOnClickListener(this);

        niveau_4 = (Button) findViewById(R.id.niveau_4);
        niveau_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    /* Réagir au clic */
        if(v==niveau_1){
            Intent ecran_niveau_1 = new Intent(Niveaux.this, Game.class);
            ecran_niveau_1.putExtra("objectif", 800);
            ecran_niveau_1.putExtra("carte", 1);
            ecran_niveau_1.putExtra("nbcoup", 8);
            startActivity(ecran_niveau_1);
        }
        else if (v==niveau_2){
            Intent ecran_niveau_2 = new Intent(Niveaux.this, Game.class);
            ecran_niveau_2.putExtra("objectif", 1200);
            ecran_niveau_2.putExtra("carte", 2);
            ecran_niveau_2.putExtra("nbcoup", 10);
            startActivity(ecran_niveau_2);
        }
        else if (v==niveau_3){
            Intent ecran_niveau_3 = new Intent(Niveaux.this, Game.class);
            ecran_niveau_3.putExtra("objectif", 1400);
            ecran_niveau_3.putExtra("carte", 3);
            ecran_niveau_3.putExtra("nbcoup", 10);
            startActivity(ecran_niveau_3);
        }
        else {
            Intent ecran_niveau_4 = new Intent(Niveaux.this, Game.class);
            ecran_niveau_4.putExtra("objectif", 1800);
            ecran_niveau_4.putExtra("carte", 4);
            ecran_niveau_4.putExtra("nbcoup", 10);
            startActivity(ecran_niveau_4);
        }

    }
}
