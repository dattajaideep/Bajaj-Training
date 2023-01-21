package finserv.daytwo.interfaces;

interface Shape {
    double getArea();
}

interface Volume {
    double getVolume();
}

class Cube implements Shape, Volume {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }
    public double getArea() {
        return 6 * sideLength * sideLength;
    }

    public double getVolume() {
        return sideLength * sideLength * sideLength;
    }
}

public class interfaces {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("Area: " + cube.getArea());
        System.out.println("Volume: " + cube.getVolume());
    }
}
