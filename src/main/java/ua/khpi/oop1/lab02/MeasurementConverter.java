package ua.khpi.oop1.lab02;

public class MeasurementConverter {

    public static void main(String[] args) {

        // ==========================================
        // PART 1: Variant 10 - Angular Position
        // ==========================================

        System.out.println("===== DATASET 1: TYPICAL =====");

        double degrees = 45.0;
        double radius = 5.0;

        double radians = degrees * Math.PI / 180.0;
        double arcLength = radius * radians;

        System.out.printf("Degrees: %.2f degrees%n", degrees);
        System.out.printf("Radius: %.2f m%n", radius);
        System.out.printf("Radians: %.6f rad%n", radians);
        System.out.printf("Arc length: %.6f m%n", arcLength);


        System.out.println("\n===== DATASET 2: MINIMUM =====");

        degrees = 0.0;
        radius = 5.0;

        radians = degrees * Math.PI / 180.0;
        arcLength = radius * radians;

        System.out.printf("Degrees: %.2f degrees%n", degrees);
        System.out.printf("Radius: %.2f m%n", radius);
        System.out.printf("Radians: %.6f rad%n", radians);
        System.out.printf("Arc length: %.6f m%n", arcLength);


        System.out.println("\n===== DATASET 3: LARGE TEST VALUE =====");

        degrees = 360.0;
        radius = 100.0;

        radians = degrees * Math.PI / 180.0;
        arcLength = radius * radians;

        System.out.printf("Degrees: %.2f degrees%n", degrees);
        System.out.printf("Radius: %.2f m%n", radius);
        System.out.printf("Radians: %.6f rad%n", radians);
        System.out.printf("Arc length: %.6f m%n", arcLength);


        System.out.println("\n===== DATASET 4: ERROR-PRONE =====");

        degrees = 0.1;
        radius = 0.001;

        radians = degrees * Math.PI / 180.0;
        arcLength = radius * radians;

        System.out.printf("Degrees: %.6f degrees%n", degrees);
        System.out.printf("Radius: %.6f m%n", radius);
        System.out.printf("Radians: %.12f rad%n", radians);
        System.out.printf("Arc length: %.12f m%n", arcLength);


        // ==========================================
        // PART 2: Four Numeric-Operation Checks
        // ==========================================

        System.out.println("\n===== CHECK 1: INTEGER DIVISION =====");

        double wrongRatio = 1 / 4;
        double correctRatio = 1.0 / 4;

        System.out.println("Wrong result: " + wrongRatio);
        System.out.println("Correct result: " + correctRatio);


        System.out.println("\n===== CHECK 2: INTERMEDIATE PRODUCT OVERFLOW =====");

        int width = 70000;
        int height = 70000;

        long wrongArea = width * height;
        long correctArea = (long) width * height;

        System.out.println("Wrong area: " + wrongArea);
        System.out.println("Correct area: " + correctArea);


        System.out.println("\n===== CHECK 3: NARROWING =====");

        double source = 260.75;
        byte narrowed = (byte) source;

        System.out.printf("Source: %.2f%n", source);
        System.out.println("Narrowed byte: " + narrowed);


        System.out.println("\n===== CHECK 4: DECIMAL APPROXIMATION ERROR =====");

        double sum = 0.1 + 0.2;
        double difference = Math.abs(sum - 0.3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Hexadecimal sum: " + Double.toHexString(sum));
        System.out.println("Hexadecimal difference: " + Double.toHexString(difference));
    }
}