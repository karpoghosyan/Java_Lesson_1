package com.company;

public class DistanceConverter {
    private double meter;
    private double mile;
    private double centimeter;
    private double inch;

    public void convertMilesToMeters() {
        System.out.println(mile * 1609.34);
    }

    public void convertMetersToMiles() {
        System.out.println(meter * 0.000621371);
    }

    public void convertCentimeterToInches() {
        System.out.println(centimeter * 0.393701);
    }

    public void convertInchesToCentimeters() {
        System.out.println(inch * 2.54);
    }

    public DistanceConverter() {
    }

    public DistanceConverter(double meter, double mile, double centimeter, double inch) {
        this.meter = meter;
        this.mile = mile;
        this.centimeter = centimeter;
        this.inch = inch;
    }

    public double getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public double getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public double getCentimeter() {
        return centimeter;
    }

    public void setCentimeter(int centimeter) {
        this.centimeter = centimeter;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
