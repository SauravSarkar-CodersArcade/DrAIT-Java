package oops.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 7.5;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest() {
        return 5.6;
    }
}
class IDBI extends RBI{
    @Override
    double rateOfInterest() {
        return 6.9;
    }
}
class Demo {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        ICICI icici = new ICICI();
        IDBI idbi = new IDBI();
        System.out.println("RBI Rate Of Interest is: " + rbi.rateOfInterest() + "%");
        System.out.println("ICICI Rate Of Interest is: " + icici.rateOfInterest() + "%");
        System.out.println("IDBI Rate Of Interest is: " + idbi.rateOfInterest() + "%");
    }
}