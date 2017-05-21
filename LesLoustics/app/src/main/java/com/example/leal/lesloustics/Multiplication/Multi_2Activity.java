package com.example.leal.lesloustics.Multiplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.leal.lesloustics.R;

public class Multi_2Activity extends AppCompatActivity {

    public static final String ERROR = "erreur";
    Integer erreur = 0;
    Integer number = getIntent().getIntExtra(Multi_1Activity.TABLE,0);

    public void valider(View view){
        EditText premier = (EditText) findViewById(R.id.premier);
        EditText second = (EditText) findViewById(R.id.second);
        EditText troisieme = (EditText) findViewById(R.id.troisieme);
        EditText quatrieme = (EditText) findViewById(R.id.quatrieme);
        EditText cinquieme = (EditText) findViewById(R.id.cinquième);
        EditText sixieme = (EditText) findViewById(R.id.sixieme);
        EditText septieme = (EditText) findViewById(R.id.septieme);
        EditText huitieme = (EditText) findViewById(R.id.huitieme);
        EditText neuvieme = (EditText) findViewById(R.id.neuvieme);
        EditText dixieme = (EditText) findViewById(R.id.dixieme);

        int r1 = Integer.parseInt(premier.getText().toString());
        int r2 = Integer.parseInt(second.getText().toString());
        int r3 = Integer.parseInt(troisieme.getText().toString());
        int r4 = Integer.parseInt(quatrieme.getText().toString());
        int r5 = Integer.parseInt(cinquieme.getText().toString());
        int r6 = Integer.parseInt(sixieme.getText().toString());
        int r7 = Integer.parseInt(septieme.getText().toString());
        int r8 = Integer.parseInt(huitieme.getText().toString());
        int r9 = Integer.parseInt(neuvieme.getText().toString());
        int r10 = Integer.parseInt(dixieme.getText().toString());

        if(r1 != number*1){erreur++;}
        if(r2 != number*2){erreur++;}
        if(r3 != number*3){erreur++;}
        if(r4 != number*4){erreur++;}
        if(r5 != number*5){erreur++;}
        if(r6 != number*6){erreur++;}
        if(r7 != number*7){erreur++;}
        if(r8 != number*8){erreur++;}
        if(r9 != number*9){erreur++;}
        if(r10 != number*10){erreur++;}

        if(erreur != 0)
        {
            Intent intent = new Intent(this, Multi_ErrActivity.class);
            intent.putExtra(ERROR, erreur);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, Multi_OkActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_2);

        Integer number = getIntent().getIntExtra(Multi_1Activity.TABLE,0);

        TextView un = (TextView) findViewById(R.id.un);
        un.setText("1 x "+number);
        TextView deux = (TextView) findViewById(R.id.deux);
        deux.setText("2 x "+number);
        TextView trois = (TextView) findViewById(R.id.trois);
        trois.setText("3 x "+number);
        TextView quatre = (TextView) findViewById(R.id.quatre);
        quatre.setText("4 x "+number);
        TextView cinq = (TextView) findViewById(R.id.cinq);
        cinq.setText("5 x "+number);
        TextView six = (TextView) findViewById(R.id.six);
        six.setText("6 x "+number);
        TextView sept = (TextView) findViewById(R.id.sept);
        sept.setText("7 x "+number);
        TextView huit = (TextView) findViewById(R.id.huit);
        huit.setText("8 x "+number);
        TextView neuf = (TextView) findViewById(R.id.neuf);
        neuf.setText("9 x "+number);
        TextView dix = (TextView) findViewById(R.id.dix);
        dix.setText("10 x "+number);
    }
}
