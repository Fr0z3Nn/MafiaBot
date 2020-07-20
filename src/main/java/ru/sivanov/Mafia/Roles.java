package ru.sivanov.Mafia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Roles {
    public ArrayList<String> listOfRoles(int valueOfPlayers){
        ArrayList<String> listOfRoles = new ArrayList<>();

        switch (valueOfPlayers){
            case 7:
                listOfRoles.add("**Мирный житель**"); //1
                listOfRoles.add("**Мирный житель**"); //2
                listOfRoles.add("**Мирный житель**"); //3
                listOfRoles.add("**Мафия**"); //4
                listOfRoles.add("**Мафия**"); //5
                listOfRoles.add("**Мирный житель**"); //6
                listOfRoles.add("**Комиссар**"); //7
            case 8:
                listOfRoles.add("**Мирный житель**"); //1
                listOfRoles.add("**Мирный житель**"); //2
                listOfRoles.add("**Мирный житель**"); //3
                listOfRoles.add("**Мафия**"); //4
                listOfRoles.add("**Мафия**"); //5
                listOfRoles.add("**Мирный житель**"); //6
                listOfRoles.add("**Комиссар**"); //7
                listOfRoles.add("**Мирный житель**"); //8
            case 9:
                listOfRoles.add("**Мирный житель**"); //1
                listOfRoles.add("**Мирный житель**"); //2
                listOfRoles.add("**Мирный житель**"); //3
                listOfRoles.add("**Мафия**"); //4
                listOfRoles.add("**Мафия**"); //5
                listOfRoles.add("**Мирный житель**"); //6
                listOfRoles.add("**Комиссар**"); //7
                listOfRoles.add("**Мирный житель**"); //8
                listOfRoles.add("**Дон**"); //9
            case 10:
                listOfRoles.add("**Мирный житель**"); //1
                listOfRoles.add("**Мирный житель**"); //2
                listOfRoles.add("**Мирный житель**"); //3
                listOfRoles.add("**Мафия**"); //4
                listOfRoles.add("**Мафия**"); //5
                listOfRoles.add("**Мирный житель**"); //6
                listOfRoles.add("**Комиссар**"); //7
                listOfRoles.add("**Мирный житель**"); //8
                listOfRoles.add("**Дон**"); //9
                listOfRoles.add("**Доктор**"); //10
            case 11:
                listOfRoles.add("**Мирный житель**"); //1
                listOfRoles.add("**Мирный житель**"); //2
                listOfRoles.add("**Мирный житель**"); //3
                listOfRoles.add("**Мафия**"); //4
                listOfRoles.add("**Мафия**"); //5
                listOfRoles.add("**Мирный житель**"); //6
                listOfRoles.add("**Комиссар**"); //7
                listOfRoles.add("**Мирный житель**"); //8
                listOfRoles.add("**Дон**"); //9
                listOfRoles.add("**Доктор**"); //10
                listOfRoles.add("**Мирный житель**"); //11
            case 12:
                listOfRoles.add("**Мирный житель**"); //1
                listOfRoles.add("**Мирный житель**"); //2
                listOfRoles.add("**Мирный житель**"); //3
                listOfRoles.add("**Мафия**"); //4
                listOfRoles.add("**Мафия**"); //5
                listOfRoles.add("**Мирный житель**"); //6
                listOfRoles.add("**Комиссар**"); //7
                listOfRoles.add("**Мирный житель**"); //8
                listOfRoles.add("**Дон**"); //9
                listOfRoles.add("**Доктор**"); //10
                listOfRoles.add("**Мирный житель**"); //11
                listOfRoles.add("**Мирный житель**"); //12
        }

           Collections.shuffle(listOfRoles);
            return listOfRoles;
    }
}
