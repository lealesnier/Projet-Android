package com.example.leal.lesloustics.Quizz;

import com.orm.SugarRecord;

/**
 * Created by LeaL on 19/05/2017.
 */

public class Reponse extends SugarRecord {
    private String label;
    private boolean rep;

    public Reponse(String l, boolean r)
    {
        label = l;
        rep = r;
    }

    public String getLabel(){return label;}
    public boolean getRep(){return rep;}
}
