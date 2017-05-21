package com.example.leal.lesloustics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InscriptionActivity extends AppCompatActivity {

    public void retour(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Toast.makeText(this, "Inscription annulée", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void valider(View view)
    {
        EditText login = (EditText) findViewById(R.id.id);
        EditText motdp = (EditText) findViewById(R.id.mdp);

        String id = login.toString();
        String mdp = motdp.toString();

        Personne nveau = new Personne(id, mdp, false);
        nveau.save();

        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Toast.makeText(this, "Inscription réussie !", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }
}
