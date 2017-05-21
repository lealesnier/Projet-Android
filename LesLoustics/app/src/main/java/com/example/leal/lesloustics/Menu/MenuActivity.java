package com.example.leal.lesloustics.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.leal.lesloustics.Addition.Add_1Activity;
import com.example.leal.lesloustics.Addition.Add_2Activity;
import com.example.leal.lesloustics.MainActivity;
import com.example.leal.lesloustics.Multiplication.Multi_1Activity;
import com.example.leal.lesloustics.Quizz.Quizz_1Activity;
import com.example.leal.lesloustics.R;

public class MenuActivity extends AppCompatActivity {

    public static final String ANONYME = "FAUX";

    public void add(View view)
    {
        Intent intent = new Intent(this, Add_1Activity.class);
        intent.putExtra(ANONYME, 0);
        startActivity(intent);
    }
    public void multi(View view)
    {
        Intent intent = new Intent(this, Multi_1Activity.class);
        intent.putExtra(ANONYME, 0);
        startActivity(intent);
    }
    public void quizz(View view)
    {
        Intent intent = new Intent(this, Quizz_1Activity.class);
        intent.putExtra(ANONYME, 0);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Integer anonyme = getIntent().getIntExtra(MainActivity.ANONYME, 0);
        if(anonyme == 1)
        {
            Button res = (Button) findViewById(R.id.resu);
            res.setClickable(false);
            res.setText("Pour avoir accès aux résultats,\nmerci de te créer un compte !");
        }
    }
}
