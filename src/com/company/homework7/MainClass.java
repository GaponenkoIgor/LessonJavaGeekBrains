package com.company.homework7;

public class MainClass {

    public static void main(String[] arg){
            Cat[] cats = {new Cat("Vasia", 50, false),
                    new Cat("Barsik", 70, false),
                    new Cat("Lucifer", 25, false),
                    new Cat("Kuzia", 50, false),
                    new Cat("Keks", 25, false)};

            Plate plate = new Plate( 100);

            for (Cat cat : cats) {
                cat.eat(plate);
                cat.info();
                plate.info();
            }
        }


//        Cat cat = new Cat ("Barsik", 70, false);
//        Cat cat[]=new Cat[3];
//        cat [0]= new Cat("Barsik", 25,false);
//        cat [1]= new Cat("Lucifer", 55,false);
//        cat [2]= new Cat("Kardan", 45,false);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat(plate);
//        plate.info();
//        cat.eat(plate);
//
//        for (Cat cat : cat) {
//            cat.eat(p);
//            cat.info();
//        }
//        p.info();
//        p.addFood(100);
//        p.info();
//    }



//
//        plate.info();
//        for (int i = 0; i < cat.length; i++) {
//            cat[i].eat(plate);
//            cat[i].hungry(plate);
//            plate.info();
//        }
//        plate.extraFood(20);
//    }
}
