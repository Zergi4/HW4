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
//hw 4.4
        int Age = 25;
        if (Age >= 2 && Age <= 6) {
            System.out.println("Если человеку " + Age + " лет ,то ему нужно ходить в детский сад.");
        }
        if (Age >= 7 && Age <= 18) {
            System.out.println("Если человеку " + Age + " лет, то ему нужно ходить в школу.");
        }
        if (Age > 18 && Age < 24) {
            System.out.println("Если человеку " + Age + " лет, то его место в университете.");
        } else {
            System.out.println("Если человеку " + Age + " лет, то ему пора ходить на работу");

        }
//hw 4.5
        int ageChildren = 14;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " годам, то он не может кататься на аттракционе.");
        }
        if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " годам, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChildren + " годам, то он может кататься без сопровождения взрослого.");
        }
//hw 4.6
        int peopleInCarriage = 103;
        if (peopleInCarriage > 0 && peopleInCarriage <= 60) {
            System.out.println("В вагоне есть сидячие и стоячее места.");
            }
        if (peopleInCarriage > 60 && peopleInCarriage <= 102) {
            System.out.println("Остались только стоячие места.");
        } else {
            System.out.println("Извините, мест нету.");
        }
    }
}