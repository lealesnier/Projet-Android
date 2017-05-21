package com.example.leal.lesloustics;

import com.orm.SugarRecord;

/**
 * Created by LeaL on 14/05/2017.
 */

public class Personne extends SugarRecord {
    private String login;
    private String mdp;
    private boolean anonyme;

    public Personne(){}

    public Personne(String l, String m, boolean a)
    {
        login = l;
        mdp = m;
        anonyme =a;
    }

    public String getLogin(){
        return login;
    }

    public String getMdp() {
        return mdp;
    }
}
