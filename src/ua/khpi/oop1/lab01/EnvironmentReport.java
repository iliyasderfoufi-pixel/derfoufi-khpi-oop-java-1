package ua.khpi.oop1.lab01;

public class EnvironmentReport {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String operatingSystem = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String userDirectory = System.getProperty("user.dir");

        System.out.println("Java version: " + javaVersion);
        System.out.println("Java vendor: " + javaVendor);
        System.out.println("Operating system: " + operatingSystem);
        System.out.println("OS version: " + osVersion);
        System.out.println("Working directory: " + userDirectory);
    }
}