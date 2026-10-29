package ua.khpi.oop1.lab02;

public class MeasurementConverter {

    public static void main(String[] args) {
        double degrees=360.0;
        double radius = 5.0;
        double radians=degrees * Math.PI/180.0;
        double arclength= radius*radians;
        System.out.println("degrees :"+degrees);
        System.out.println("radians :"+radians);
        System.out.println("arc :"+arclength);


    }
}