package entities;

public class OutSourcedEmployee extends Employee{
    private double additionalCharge;

    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + (additionalCharge * 1.1);
    }
}
