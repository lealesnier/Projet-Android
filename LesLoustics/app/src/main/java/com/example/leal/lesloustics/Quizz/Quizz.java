package com.example.leal.lesloustics.Quizz;

import com.orm.SugarRecord;

/**
 * Created by LeaL on 19/05/2017.
 */

public class Quizz extends SugarRecord {
    private String question;
    private Reponse r1;
    private Reponse r2;
    private Reponse r3;

    public Quizz(){};

    public Quizz(String r, Reponse un, Reponse deux, Reponse trois)
    {
        question = r;
        r1 = un;
        r2 = deux;
        r3 = trois;
    }

    public String getQuestion(){return question;}
    public Reponse getR1(){return r1;}
    public Reponse getR2(){return r2;}
    public Reponse getR3(){return r3;}

}
