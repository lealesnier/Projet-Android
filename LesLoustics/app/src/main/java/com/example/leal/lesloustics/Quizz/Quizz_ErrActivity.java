package com.example.leal.lesloustics.Quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.R;

public class Quizz_ErrActivity extends AppCompatActivity {

    public void corriger(View view)
    {
        Quizz_ErrActivity.this.finish();
    }
    public void changer(View view)
    {
        Intent intent = new Intent(this, Quizz_1Activity.class);
        startActivity(intent);
    }
    public void retour(View view)
    {
        Intent intent = new Intent(this, MenuActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz__err);

        Integer e = getIntent().getIntExtra(Quizz_22Activity.ERROR_2,0);

        TextView erreur = (TextView) findViewById(R.id.nbErr);
        erreur.setText("Tu as fait "+e+" erreurs.\n Courage ! Tu vas y arriver !");
    }
}
