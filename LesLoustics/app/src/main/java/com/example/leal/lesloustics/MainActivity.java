package com.example.leal.lesloustics;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.Menu.MenuAnonymeActivity;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static  Personne loginPersonne = new Personne();
    public static final String ANONYME = "ANONYME";

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void valider(View view){
        NumberPicker login = (NumberPicker) findViewById(R.id.personne);
        EditText pwd = (EditText) findViewById(R.id.mdp);
        final List<Personne> personnes = PersonneDAO.selectAll();

        if(Objects.equals(personnes.get(login.getValue()).getLogin(),"Anonyme") ){
            Intent intent = new Intent(this,MenuActivity.class);
            intent.putExtra(ANONYME, 1);
            startActivity(intent);
        }else if(Objects.equals(personnes.get(login.getValue()).getMdp(), pwd.getText().toString())) {
            Toast.makeText(this, "Connexion..", Toast.LENGTH_SHORT).show();
            Personne loginPersonne = personnes.get(login.getValue());
            Intent intent = new Intent(this, MenuActivity.class);
            intent.putExtra(ANONYME, 0);
            startActivity(intent);
        }else if(Objects.equals(pwd.getText().toString(),"")) {
            Toast.makeText(this, "Champ vide", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Mauvais code",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Personne> personnes = PersonneDAO.selectAll();

        NumberPicker p = (NumberPicker) findViewById(R.id.personne);

        if(personnes.size() == 0)
        {
            Personne anonyme = new Personne("Anonyme", "", true);
            anonyme.save();
        }

        p.setMinValue(0);
        p.setMaxValue(personnes.size() - 1);
        p.setDisplayedValues(PersonneDAO.getList());
        p.setWrapSelectorWheel(false);
    }
}
