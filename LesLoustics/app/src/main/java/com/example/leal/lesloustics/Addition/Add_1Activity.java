package com.example.leal.lesloustics.Addition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.R;

public class Add_1Activity extends AppCompatActivity {

    public static final String NIVEAU = "niveau";
    Integer anonyme = getIntent().getIntExtra(MenuActivity.ANONYME, 0);

    public void niv1 (View view)
    {
        Intent intent = new Intent(this, Add_2Activity.class);
        intent.putExtra(NIVEAU,1);
        startActivity(intent);
    }
    public void niv2 (View view)
    {
        Intent intent = new Intent(this, Add_2Activity.class);
        intent.putExtra(NIVEAU, 2);
        startActivity(intent);
    }
    public void niv3 (View view)
    {
        Intent intent = new Intent(this, Add_2Activity.class);
        intent.putExtra(NIVEAU, 3);
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
        setContentView(R.layout.activity_add_1);
    }
}
