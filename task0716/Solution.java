package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л

1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("рог");
        strings.add("леопард");
        strings.add("лимон");
        strings.add("мама");
        ArrayList<String> stringsFixed = fix(strings);

        for (String string : stringsFixed) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> stringsFixed = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).contains("р") && strings.get(i).contains("л")){
                stringsFixed.add(strings.get(i));
            }else if((strings.get(i).contains("р")) && !(strings.get(i).contains("л"))){
                //оставить это слово без изменений
                continue;
            }else if((strings.get(i).contains("л")) && !(strings.get(i).contains("р"))){
                stringsFixed.add(strings.get(i));
                stringsFixed.add(strings.get(i));
            } else{
                stringsFixed.add(strings.get(i));
            }
        }
        return stringsFixed;
    }
}