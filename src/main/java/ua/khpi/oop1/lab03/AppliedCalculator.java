package ua.khpi.oop1.lab03;

public class AppliedCalculator {
    public static void main(String[] args) {
        double initialVelocityMps=100.0;
        double angleDegrees=30.0;
        double GravityMps2=9.81;
        double angleRadians = Math.toRadians(angleDegrees);
        double sineAngle = Math.sin(angleRadians);
        double newangle=Math.sin(angleRadians*2);

        double flightTimeSeconds=2*initialVelocityMps*sineAngle/GravityMps2;
        System.out.println("result: " + flightTimeSeconds +" second");
        double maximumHeightMeters=initialVelocityMps*initialVelocityMps*sineAngle*sineAngle/(2*GravityMps2);
        System.out.println("result: " + maximumHeightMeters +" meters");
        double rangeMeters=initialVelocityMps*initialVelocityMps*(newangle)/GravityMps2;
        System.out.println("result: " + rangeMeters +" meters");



    }
}