package Lesson_14;

public class Main {
    public static void main(String[] args) {

        Person andrey = new Person("Andrey", 38,75,5);
        Person ira = new Person("Ira", 30,50,4);
        Person liza = new Person("1", 1, 1, 1);


        System.out.println("Name - " + andrey.getName() + "  age - " + andrey.getAge() + "  wieght - " + andrey.getWeight() + "  grade - " + andrey.getGrade());
        System.out.println("Name - " + ira.getName() + "  age - " + ira.getAge() + "  wieght - " + ira.getWeight() + "  grade - " + ira.getGrade());
        System.out.println("Name - " + liza.getName() + "  age - " + liza.getAge() + "  wieght - " + liza.getWeight() + "  grade - " + liza.getGrade());
    }

}
