package com.company.level2.homework2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[][] array_normal = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] array_wrong_size = {{"1","2","3","4"}};
        String[][] array_wrong_num = {{"ABC12","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};


        List<String[][]> arrayList = new ArrayList<String[][]>();

        arrayList.add(array_normal);
        arrayList.add(array_wrong_size);
        arrayList.add(array_wrong_num);

        for (String[][] array : arrayList) {
            System.out.println("Begin of calculation");

            try {
                System.out.println("Результат расчета = " + sumArrayElements(array));
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Что-то совсем пошло не так!");
                //e.printStackTrace();
            }

            System.out.println("End of calculation");
        }

    }

    public static int sumArrayElements(String[][] arr) throws MyArraySizeException,MyArrayDataException{
        int result = 0;

        checkArrayElements(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try{
                    result += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j, e.getMessage());
                }

            }
        }
        return result;
    }

    public static void checkArrayElements(String[][] arr) throws MyArraySizeException {
        if (arr.length !=4)
            throw new MyArraySizeException();

        for (String[] strings : arr) {
            if (strings.length != 4)
                throw new MyArraySizeException();
        }
    }


}