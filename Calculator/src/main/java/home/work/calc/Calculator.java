package home.work.calc;

public class Calculator {
   private int num1;
   private int num2;

    public void setNum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSumm() {
        return num1 + num2;
    }
    public int getMinus() {
        return num1 - num2;
    }
    public int getMult() {
        return num1 * num2;
    }
    public double getDiv() {
        return (double)num1 / num2;
    }
}
