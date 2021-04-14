package Lesson_14;

public class Main {
    public static void main(String[] args) {

/*        Person andrey = new Person("Andrey", 38,75,5);
        Person ira = new Person("Ira", 30,50,4);
        Person liza = new Person("1", 1, 1, 1);

        System.out.println("Name - " + andrey.getName() + "  age - " + andrey.getAge() + "  wieght - " + andrey.getWeight() + "  grade - " + andrey.getGrade());
        System.out.println("Name - " + ira.getName() + "  age - " + ira.getAge() + "  wieght - " + ira.getWeight() + "  grade - " + ira.getGrade());
        System.out.println("Name - " + liza.getName() + "  age - " + liza.getAge() + "  wieght - " + liza.getWeight() + "  grade - " + liza.getGrade());
 */
        Vec2 vector = new Vec2(56, 54);
        Vec2 vector2 = new Vec2(5, 6);

        Vec2 vectorSumarniy = vector.Sum(vector2);
        System.out.println(vectorSumarniy.getA());
        System.out.println(vectorSumarniy.getB());
    }

}
