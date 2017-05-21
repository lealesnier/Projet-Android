package com.example.leal.lesloustics.Addition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.R;

public class Add_OkActivity extends AppCompatActivity {

    public void changer(View view)
    {
        Intent intent = new Intent(this, Add_1Activity.class);
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
        setContentView(R.layout.activity_add__ok);
    }
}
