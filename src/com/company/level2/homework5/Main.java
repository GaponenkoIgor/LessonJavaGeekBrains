package com.company.level2.homework5;

import java.util.Arrays;

public class Main  {

    public static final int SIZE = 10000000;
    public static final int HALF = SIZE / 2;
    public static final float[] ARR = new float[SIZE];

    public static void main(String[] args) {
        oneThread();
        twoThreads();
    }

    public static float[] calculate(float[] arr, float startIndex) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i+startIndex)/5) * Math.cos(0.2f + (i+startIndex) / 5) * Math.cos(0.4f + (i+startIndex) / 2));
        }
        return arr;
    }

        public static void oneThread() {
            Arrays.fill(ARR, 1.0f);
            long a = System.currentTimeMillis();
            calculate(ARR, 0);
            System.out.println("Время работы метода с одним потоком: " + (System.currentTimeMillis() - a));
        }

        public static void twoThreads() {
            Arrays.fill(ARR, 1.0f);
            float[] arr1 = new float[HALF];
            float[] arr2 = new float[HALF];
            long b = System.currentTimeMillis();

            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.arraycopy(ARR, 0, arr1, 0, HALF);
                    calculate(arr1,0);
                    System.arraycopy(arr1, 0, ARR, 0, HALF);
                }
            });
            thread1.start();

                    System.arraycopy(ARR, 0, arr2, 0, HALF);
                    calculate(arr2,0);
                    System.arraycopy(arr2, 0, ARR, 0, HALF);

            try{
                thread1.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Время работы метода с двумя потоками: " + (System.currentTimeMillis()-b) );
        }
}

