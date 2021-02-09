class fraction { 
    int n, d;

    public fraction() {
        this.n=10;
        this.d=5;
    }

    public fraction (int n, int d){
        this.n=n;
        if (d==0){
            System.out.println ("error: fraction undefined");
            this.d=1;
        }
        else this.d=d;
    }

    public fraction (String frac){
        this.n=Integer.parseInt(frac.substring(0,frac.indexOf("/")));
        if (Integer.parseInt(frac.substring(frac.indexOf("/")+1))==0){
            System.out.println ("error: fraction undefined");
            this.d=1;
        }
        else this.d= Integer.parseInt(frac.substring(frac.indexOf("/")+1));
    }

    public fraction (fraction f){
        this.n=f.n;
        this.d=f.d;
    }

    public int getNum(){
        return this.n;
    }

    public int getDenom() {
        return this.d;
    }

    public String toString() { //override internal function
        return n+"/"+d;
    }

    public double toDouble() {
        return (double)n/d;
    }

    public void reduce() {
        if (n!=0) {
        int gcf = gcf(n, d);
        n=n/gcf;
        d=d/gcf;
        if (n<0&&d<0) {
            n=-n;
            d=-d;
        }
    }
    }

    private int gcf(int a, int b) { //helper method
        a=Math.abs(a);
        b=Math.abs(b);
        while (a!=b){
            if (a>b) {
                a=a-b;
            }
            if (a<b){
                b=b-a;
            }
        }
        return a;
    }

    public void setNum(int n) {
        this.n=n;
    }

    public void setDenom(int d) {
        if (d==0){
            System.out.println ("error: fraction undefined");
            this.d=1;
        }
        else this.d=d;
    }

    public static fraction multiply(fraction a, fraction b){
        int num= a.n*b.n;
        int den= a.d*b.d;
        fraction f= new fraction (num, den);
        f.reduce();
        return f;
    }

    public static fraction divide(fraction a, fraction b){
        int num= a.n*b.d;
        int den= a.d*b.n;
        if (den==0){
            System.out.println("error: fraction undefined");
            return new fraction();
        }else {
            fraction f= new fraction(num, den);
            f.reduce();
            return f;
        }
       
    }

    public static fraction add(fraction a, fraction b){
        int num=a.n*b.d+b.n*a.d;
        int den=a.d*b.d;
        fraction f= new fraction(num, den);
        f.reduce();
        return f;
    }

    public static fraction subtract(fraction a, fraction b){
        int num=a.n*b.d-b.n*a.d;
        int den=a.d*b.d;
        fraction f= new fraction(num, den);
        f.reduce();
        return f;
    }

}