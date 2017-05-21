package com.example.leal.lesloustics;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.List;
import java.util.Objects;

/**
 * Created by LeaL on 14/05/2017.
 */

public class PersonneDAO {
    public static List<Personne> selectAll ()
    {
        return Personne.listAll(Personne.class);
    }

    /*
    La méthode getList nous servira pour remplir le numberPicker de la page d'accueil
     */
    public static String[] getList()
    {
        List<Personne> personnes = PersonneDAO.selectAll();
        String[] list;
        list = new String[personnes.size()];
        int i = 0;
        for (Personne p : selectAll()){
            list[i] = p.getLogin();
            i++;
        }
        return list;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static Personne getByLogin(String Login)
    {
        Personne personne = null;
        for (Personne p : selectAll())
        {
            if (Objects.equals(p.getLogin(), Login)){
            personne = p;
            break;
            }
        }
        return personne;
    }
}
