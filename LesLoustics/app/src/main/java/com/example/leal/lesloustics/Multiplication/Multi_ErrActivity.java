package com.example.leal.lesloustics.Multiplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leal.lesloustics.Addition.Add_2Activity;
import com.example.leal.lesloustics.Menu.MenuActivity;
import com.example.leal.lesloustics.R;

public class Multi_ErrActivity extends AppCompatActivity {

    public void corriger(View view)
    {
        Multi_ErrActivity.this.finish();
    }
    public void changer(View view)
    {
        Intent intent = new Intent(this, Multi_1Activity.class);
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
        setContentView(R.layout.activity_multi__err);

        TextView error = (TextView) findViewById(R.id.nbErr);
        Integer e = getIntent().getIntExtra(Add_2Activity.NB_ERREUR,0);
        error.setText("Tu as fait "+e+" erreurs.\n Courage ! Tu peux y arriver !");
    }
}
