package implementation;

public class Complex {
    private double r;
    private double i;

    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public double getI() {
        return i;
    }

    public double getModule(){
        return Math.sqrt(Math.pow(r,2) + Math.pow(i,2));
    }
    public double getPhase(){
        return Math.atan(i/r);
    }

    @Override
    public String toString() {
        return r + ((i>0) ? "+":"-") +"i" + ((i>0) ? i : -1*i);
    }
}
