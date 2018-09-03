import static java.lang.String.*;

public class SamengesteldeIntrest {
    //formula: a = p (1 + r)n
    //where
    //	p is the original amount invested (i.e., the principal)
    //  r is the annual interest rate (e.g., use 0.05 for 5%)
    //  n is the number of yearsa is the amount on deposit at the end of the nth year.
    private double principal;
    private double intrest;
    private int years;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public SamengesteldeIntrest(double principal, double intrest, int years) {
        this.principal = principal;
        this.intrest = intrest;
        this.years = years;
    }

    @Override
    public String toString() {
        StringBuffer localBuffer = new StringBuffer("Als je ");
        //Euro
        localBuffer.append("\u20ac");
       localBuffer.append(format("%,4.2f",getPrincipal()));
       localBuffer.append(" uitzet aan ");
       localBuffer.append(format("%,4.2f",getIntrest()*100));
       localBuffer.append("% over ");
       localBuffer.append(format("%2d",getYears()));
        localBuffer.append(" jaar, \ndan bekom je een ");
        localBuffer.append("Samengestelde kapitaal = ")
                .append("\u20ac").append(format("%,4.2f%n", calculateReturn()));
        return localBuffer.toString();
    }

    public double getIntrest() {
        return intrest/100.0;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double calculateReturn(){
        return getPrincipal() * Math.pow(1 + getIntrest() ,getYears());
    }
}


