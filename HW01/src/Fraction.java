public class Fraction {
    private int numberator,denominator;

    public  Fraction(){
        numberator = 0;
        denominator = 0;
        makeNewFormat();
    }

    public Fraction(int n , int d){
        numberator = n;
        denominator = d;
        makeNewFormat();
    }

    public void setValue(int n , int d){
        numberator = n;
        denominator = d;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumberator() {
        return numberator;
    }

    public void print(){
        System.out.println(getNumberator() +"/"+getDenominator());
    }

   private int gcd(int a,int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }

    public int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a,b);
    }

    public void makeNewFormat(){
        int common = gcd(numberator,denominator);

        numberator /= common;
        denominator /= common;

        if (denominator < 0) {
            numberator = -numberator;
            denominator = -denominator;
        }

        setValue(numberator, denominator);
    }

    public void multiply(Fraction f2){
        numberator *= f2.getNumberator();
        denominator *= f2.getDenominator();

        setValue(numberator,denominator);
        makeNewFormat();
    }

    public void divide(Fraction f2){
        numberator *= f2.getDenominator();
        denominator *= f2.getNumberator();

        setValue(numberator,denominator);
        makeNewFormat();
    }

    public void add(Fraction f2){
        int commonDenominator = lcm(denominator, f2.getDenominator());

        int h1 = commonDenominator / denominator;
        int h2 = commonDenominator / f2.getDenominator();

        int newNumerator = (numberator * h1) + (f2.getNumberator() * h2);

        this.numberator = newNumerator;
        this.denominator = commonDenominator;

        setValue(numberator,denominator);
        makeNewFormat();
    }

    public void minus(Fraction f2){
        int commonDenominator = lcm(denominator, f2.getDenominator());

        int h1 = commonDenominator / denominator;
        int h2 = commonDenominator / f2.getDenominator();

        int newNumerator = (numberator * h1) - (f2.getNumberator() * h2);

        this.numberator = newNumerator;
        this.denominator = commonDenominator;

        setValue(numberator,denominator);
        makeNewFormat();
    }

    public boolean isEqual(Fraction f2){
        if(numberator == f2.getNumberator() && denominator == f2.getDenominator()){
            return true;
        }else{
            return false;
        }
    }
}
