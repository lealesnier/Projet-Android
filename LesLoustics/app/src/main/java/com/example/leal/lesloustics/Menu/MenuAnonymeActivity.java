package com.example.leal.lesloustics.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leal.lesloustics.Addition.Add_1Activity;
import com.example.leal.lesloustics.Multiplication.Multi_1Activity;
import com.example.leal.lesloustics.Quizz.Quizz_1Activity;
import com.example.leal.lesloustics.R;

public class MenuAnonymeActivity extends AppCompatActivity {

    public static final String ANONYME = "FAUX";

    public void add(View view)
    {
        Intent intent = new Intent(this, Add_1Activity.class);
        intent.putExtra(ANONYME, 1);
        startActivity(intent);
    }
    public void multi(View view)
    {
        Intent intent = new Intent(this, Multi_1Activity.class);
        intent.putExtra(ANONYME, 1);
        startActivity(intent);
    }
    public void quizz(View view)
    {
        Intent intent = new Intent(this, Quizz_1Activity.class);
        intent.putExtra(ANONYME, 1);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_anonyme);
    }
}
