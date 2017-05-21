package com.example.leal.lesloustics.Multiplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.R;

public class Multi_1Activity extends AppCompatActivity {

    public static final String TABLE = "Table";

    NumberPicker n = (NumberPicker) findViewById(R.id.number);
    Integer number = n.getValue();

    public void valider(View view)
    {
        Intent intent = new Intent(this, Multi_2Activity.class);
        intent.putExtra(TABLE, number);
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
        setContentView(R.layout.activity_multi_1);

        NumberPicker n = (NumberPicker) findViewById(R.id.number);

        n.setMaxValue(10);
        n.setMinValue(0);
    }
}
