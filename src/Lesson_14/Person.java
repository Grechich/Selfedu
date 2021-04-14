package Lesson_14;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int grade;
    {
        name = "Unnamed";
        age = 30;
        weight = 70;
        grade = 1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }


    private boolean isCorrect(int arg){
        if (30 <= arg & arg <= 200){
            return true;
        }
        else {return false;}

    }

    Person(){   }

    Person(String name, int age, int weight, int grade){
        if (isCorrect(age)&&isCorrect(weight)) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.grade = grade;
        }
        else {
            System.out.println("Incorrect input");
            this.name = "Incorrect input";
            this.age = 0;
            this.weight = 0;
            this.grade = 0;
        }


    }



}
