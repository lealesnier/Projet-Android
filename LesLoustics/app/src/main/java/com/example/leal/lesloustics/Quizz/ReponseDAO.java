package com.example.leal.lesloustics.Quizz;

import java.util.List;

/**
 * Created by LeaL on 19/05/2017.
 */

public class ReponseDAO {
    public static List<Reponse> selectAll ()
    {
        return Reponse.listAll(Reponse.class);
    }

    public static String[] getReponse()
    {
        List<Reponse> r = ReponseDAO.selectAll();
        String[] list;
        list = new String[r.size()];
        int i = 0;
        for (Reponse rep : selectAll()){
            list[i] = rep.getLabel();
            i++;
        }
        return list;
    }
}
