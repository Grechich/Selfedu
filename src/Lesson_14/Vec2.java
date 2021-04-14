package Lesson_14;

public class Vec2 {
    private int a;
    private int b;
    private final int MAX_VAL = 100;

    public Vec2(int a, int b) {
        if (isCorrect(a)&&isCorrect(b)) {
            this.a = a;
            this.b = b;
        }
        else {
            System.out.println("Incorrect input!!!");
            this.a = 0;
            this.b = 0;
        }
    }
    private boolean isCorrect(int a) {
        if (a > -MAX_VAL && a < MAX_VAL) return true;
        else return false;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public Vec2 Sum(Vec2 v){
        Vec2 summa = new Vec2((this.a + v.getA()), (this.b + v.getB()));
        return summa;
    }
}
