package com.example.leal.lesloustics.Quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leal.lesloustics.R;

public class Quizz_2Activity extends AppCompatActivity {

    public static final String THEME_2 = "thème";
    public static final String ERROR = "nombre erreurs";
    Integer erreur =0;
    Integer theme = getIntent().getIntExtra(Quizz_1Activity.THEME,0);

    public void suivant(View view)
    {
        Intent intent = new Intent(this, Quizz_22Activity.class);
        intent.putExtra(THEME_2, theme);
        intent.putExtra(ERROR, erreur);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_2);
    }
}
