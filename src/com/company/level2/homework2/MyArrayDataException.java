package com.company.level2.homework2;

public class MyArrayDataException extends RuntimeException{
    final private int rowNumber;
    final private int colNumber;
    MyArrayDataException(int rowNumber, int colNumber, String message){
        super(message);
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    @Override
    public void printStackTrace() {
        System.out.println("Ошибка в массиве ("+super.getMessage()+"). Столбец:"+ colNumber +" ;Строка "+rowNumber+";");
        //super.printStackTrace();
    }
}
