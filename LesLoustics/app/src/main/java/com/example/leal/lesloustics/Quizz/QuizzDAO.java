package com.example.leal.lesloustics.Quizz;

import java.util.List;

/**
 * Created by LeaL on 19/05/2017.
 */

public class QuizzDAO {

    public static List<Quizz> selectAll ()
    {
        return Quizz.listAll(Quizz.class);
    }

    public static String[] getList()
    {
        List<Quizz> quizz = QuizzDAO.selectAll();
        String[] list;
        list = new String[quizz.size()];
        int i = 0;
        for (Quizz q : selectAll()){
            list[i] = q.getQuestion();
            i++;
        }
        return list;
    }
}
