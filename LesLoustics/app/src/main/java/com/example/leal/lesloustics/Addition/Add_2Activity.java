package com.example.leal.lesloustics.Addition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.leal.lesloustics.R;

public class Add_2Activity extends AppCompatActivity {

    public static final String NB_ERREUR = "nombre_erreurs";
    int error = 0;

    EditText res1 = (EditText) findViewById(R.id.res1);
    EditText res2 = (EditText) findViewById(R.id.res2);
    EditText res3 = (EditText) findViewById(R.id.res3);
    EditText res4 = (EditText) findViewById(R.id.res4);
    EditText res5 = (EditText) findViewById(R.id.res5);

    TextView op1 = (TextView) findViewById(R.id.op1);
    TextView op2 = (TextView) findViewById(R.id.op2);
    TextView op3 = (TextView) findViewById(R.id.op3);
    TextView op4 = (TextView) findViewById(R.id.op4);
    TextView op5 = (TextView) findViewById(R.id.op5);
    Integer op[] = {Integer.parseInt(op1.getText().toString().substring(0,1))+Integer.parseInt(op1.getText().toString().substring(2)),Integer.parseInt(op2.getText().toString().substring(0,1))+Integer.parseInt(op2.getText().toString().substring(2)),Integer.parseInt(op3.getText().toString().substring(0,1))+Integer.parseInt(op3.getText().toString().substring(2)), Integer.parseInt(op4.getText().toString().substring(0,1))+Integer.parseInt(op4.getText().toString().substring(2)), Integer.parseInt(op5.getText().toString().substring(0,1))+Integer.parseInt(op5.getText().toString().substring(2))};

    int r1 = Integer.parseInt(res1.getText().toString());
    int r2 = Integer.parseInt(res2.getText().toString());
    int r3 = Integer.parseInt(res3.getText().toString());
    int r4 = Integer.parseInt(res4.getText().toString());
    int r5 = Integer.parseInt(res5.getText().toString());

    public void valider(View view)
    {
        if(op[1] != r1){error++;}
        if(op[2] != r1){error++;}
        if(op[3] != r1){error++;}
        if(op[4] != r1){error++;}
        if(op[5] != r1){error++;}

        if(error == 0)
        {
            Intent intent = new Intent(this, Add_OkActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, Add_ErrActivity.class);
            intent.putExtra(NB_ERREUR, error);
            startActivity(intent);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_2);

        Integer niveau = getIntent().getIntExtra(Add_1Activity.NIVEAU, 0);

        TextView calc1 = (TextView) findViewById(R.id.op1);
        TextView calc2 = (TextView) findViewById(R.id.op2);
        TextView calc3 = (TextView) findViewById(R.id.op3);
        TextView calc4 = (TextView) findViewById(R.id.op4);
        TextView calc5 = (TextView) findViewById(R.id.op5);
        TextView calc[] = {calc1, calc2, calc3, calc4, calc5};

        String op;
        int min = 1, max;
        if (niveau == 1)
        {
            max = 10;
            for (int i =0; i<5; i++)
            {
                op = min+Math.random()*(max-min)+"+"+min+Math.random()*(max-min);
                calc[i].setText(op);
            }
        }
        if (niveau == 2)
        {
            max = 50;
            for (int i =0; i<5; i++)
            {
                op = min+Math.random()*(max-min)+"+"+min+Math.random()*(max-min);
                calc[i].setText(op);
            }
        }
        if (niveau == 2)
        {
            max = 100;
            for (int i =0; i<5; i++)
            {
                op = min+Math.random()*(max-min)+"+"+min+Math.random()*(max-min);
                calc[i].setText(op);
            }
        }

    }
}
