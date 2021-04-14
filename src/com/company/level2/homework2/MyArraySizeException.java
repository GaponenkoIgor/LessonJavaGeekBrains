package com.company.level2.homework2;

public class MyArraySizeException extends Exception{

    MyArraySizeException(){
        super("Некорректный размер массива.");
    }

    @Override
    public void printStackTrace() {
        System.out.println(super.getMessage());
        // super.printStackTrace();
    }
}
