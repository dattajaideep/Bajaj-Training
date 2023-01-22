package finserv.dayfour.defaultandstatic;

interface Geometry {
    double PI = 3.14;
    double getArea();
    default double getCircumference(double radius) {
        return 2 * PI * radius;
    }
}