package com.example.leal.lesloustics.Quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leal.lesloustics.R;

public class Quizz_22Activity extends AppCompatActivity {

    public static final String ERROR_2 = "nombre erreurs total";
    Integer erreur = getIntent().getIntExtra(Quizz_2Activity.ERROR,0);

    public void precedent(View view)
    {
        Quizz_22Activity.this.finish();
    }
    public void valider(View view)
    {
        if (erreur != 0)
        {
            Intent intent = new Intent(this, Quizz_ErrActivity.class);
            intent.putExtra(ERROR_2, erreur);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, Quizz_OkActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_22);
    }
}
