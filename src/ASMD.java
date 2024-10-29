// import java.util.Scanner;

public class ASMD {
    // init variables
    private double a;
    private double b;

    //getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    //setters
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }

    //functions
    public double add() {
        return a + b;
    }
    public double subtract() {
        return a - b;
    }
    public double multiply() {
        return a * b;
    }
    public double divide() {
        return a / b;
    }

}
