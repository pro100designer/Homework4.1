public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача №1");
        int age = 19;
        if (age < 18) {
            System.out.printf("Возраст %s, несовершеннолетний %n", age);
        } else {
            System.out.printf("Возраст %s, совершеннолетний%n", age);
        }

        System.out.println("Задача №2"); // ctrl alt t
        double temperature = 2.0;
        if (temperature < 5) {
            System.out.printf("«На улице %s градусов, на улице холодно нужно надеть шапку»%n", temperature);
        } else {
            System.out.printf("«На улице %s градусов, можно идти без шапки»%n", temperature);
        }

        System.out.println("Задача №3");
        int speed = 60;
        if (speed > 60) {
            System.out.printf("Если скорость больше %s, то нужно заплатить штраф%n", speed);
        } else {
            System.out.printf("Если скорость меньше %s, то штраф платить не нужно%n", speed);
        }

        System.out.println("Задача №4");
        if (age > 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в садик%n", age);
        } else if (age > 6 && age < 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу%n", age);
        } else if (age > 17 && age <= 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет%n", age);
        } else if (age > 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу%n", age);

        }

        System.out.println(" Задача № 5");
        if (age < 5) {
            System.out.printf("если возраст ребенка равен %s, то он не может кататься на аттракционе\n", age);
        } else if (age > 5 && age < 14) {
            System.out.printf("если возраст ребенка равен %s, то он  может кататься на аттракционе только в сопровождении врозлого\n", age);
        } else if (age > 14) {
            System.out.printf("если возраст ребенка равен %s, то он  может кататься на аттракционе без сопровождения врозлого\n", age);

        }


        System.out.println("Задача №6");
        int amountOfPeople = 102;
        if (amountOfPeople < 60) {
            System.out.println("Сидячие места есть");
        }
        if (amountOfPeople >= 102) {
            System.out.println("Мест нет!");
        }
        if (amountOfPeople <= 102) {
            System.out.println(" сидячих мест нет но есть стоячие");
        }

        System.out.println(" Задача №7");
        int one = 3;
        int two = 4;
        int three = 5;
        if (one > two && two > three) {
            System.out.println("Первое число больше всех");
        } else if (two > one && two > three) {
            System.out.println("Второе больше всех");
        } else if (three > one && three > two) {
            System.out.println("Третье больше всех");
        }


    }
}