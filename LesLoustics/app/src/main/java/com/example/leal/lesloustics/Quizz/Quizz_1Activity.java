package com.example.leal.lesloustics.Quizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.R;

public class Quizz_1Activity extends AppCompatActivity {

    public static final String THEME = "thème";

    public void svt(View view)
    {
        Intent intent = new Intent(this, Quizz_2Activity.class);
        intent.putExtra(THEME, 1);
        startActivity(intent);
    }
    public void français(View view)
    {
        Intent intent = new Intent(this, Quizz_2Activity.class);
        intent.putExtra(THEME, 2);
        startActivity(intent);
    }
    public void histoire(View view)
    {
        Intent intent = new Intent(this, Quizz_2Activity.class);
        intent.putExtra(THEME, 3);
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
        setContentView(R.layout.activity_quizz_1);
    }
}
