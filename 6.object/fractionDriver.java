class fractionDriver {

    public static void main (String[]args) {

        fraction frac= new fraction();
        //System.out.println (frac.n);
        //System.out.println (frac.d);
        System.out.println (frac); //automatic uses toString
        
        //frac.reduce();
        //System.out.println (frac);
      //System.out.println (frac.getDenom());
       // System.out.println (frac.toString());
        //System.out.println (frac.toDouble());
        fraction frac2= new fraction(0,3);
        System.out.println (frac2);
        System.out.println (fraction.multiply(frac,frac2));
        System.out.println (fraction.divide(frac,frac2));
        System.out.println (fraction.add(frac,frac2));
        System.out.println (fraction.subtract(frac,frac2));
       
        
    }



}