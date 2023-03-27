public class Main {
    public static void main(String[] args) {
        int age = 10; //hw4.1
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он несовершеннолетний");
        }
        int temp = -5; //hw4.2
        if (temp <= 5) {
            System.out.println(" На улице " + temp + " градусов, нужно одеть шапку");
        } else {
            System.out.println(" На улице " + temp + " градусов, не нужно одевать шапку");
        }
        int speedCar = 61; //hw 4.3
        if (speedCar <= 60) {
            System.out.println(" Если скорость " + speedCar + " км/ч, можно ездить спокойно.");
        } else {
            System.out.println(" Если скорость " + speedCar + " км/ч, придется заплатить штраф.");
        }

    }
}