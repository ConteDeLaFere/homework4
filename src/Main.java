public class Main {

    public static void task1(int age) {
        System.out.print("Если возраст человека равен " + age + ", то он ");
        if (age >= 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2(int temperature) {
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3(int speed) {
        System.out.print("Если скорость " + speed + " км/ч, то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4(int age) {
        System.out.print("Если возраст человека равен " + age + " то ему нужно ходить ");
        if (age >= 2 && age <= 6) {
            System.out.println("в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("в университет");
        } else if (age > 24) {
            System.out.println("на работу");
        }
    }

    public static void task5(int age) {
        System.out.print("Если возраст ребенка равен " + age + ", то ему ");
        if (age < 5) {
            System.out.println("нельзя кататься на аттрационах");
        } else if (age <= 14) {
            System.out.println("можно кататься на аттракционах только в сопровождении взрослого");
        } else {
            System.out.println("можно кататься на аттракционах без сопровождения взрослого");
        }
    }

    public static void task6(int passengers) {
        int vanCapacity = 102;
        int numSeats = 60;
        if (passengers > vanCapacity) {
            System.out.println("В вагоне не хватит мест для всех пассажиров");
        } else if (passengers < vanCapacity && passengers > numSeats){
            System.out.println("В вагоне есть только стоячие места");
        } else{
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        }

    }

    public static void task7(int one, int two, int three) {
        int max = one;
        if (two > max) {
            max = two;
        }
        if (three > max) {
            max = three;
        }
        System.out.println("Максимальное число - " + max);
    }


    public static void main(String[] args) {
        task1(14);
        task2(10);
        task3(50);
        task4(15);
        task5(16);
        task6(100);
        task7(21, 10, 17);

    }
}