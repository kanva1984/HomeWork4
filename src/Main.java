public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 7;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age+ ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", пусть отдыхает пока");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему можно кататься на атракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seats = 60;
        int numberOfPassengers = 100;

       if (numberOfPassengers ==102) {
            System.out.println("Нет мест");
       }

        else if (numberOfPassengers >= seats && numberOfPassengers < wagonCapacity) {
            System.out.println("стоячие");
        }
        else if (numberOfPassengers < seats) {
            System.out.println("сидячие и стоячие");
        }


    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one + " больше чем " + two + " и " + three);
        }
        else if (two > one && two > three) {
            System.out.println(two + " больше чем " + one + " и " + three);
        }
        else {
            System.out.println(three + " больше чем " + two + " и " + one);
        }
    }
}
