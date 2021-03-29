package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return first.distance(second) > 0
                && second.distance(third) > 0
                && first.distance(third) > 0;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = first.distance(third);
        double p = period(ab, bc, ac);
        if (this.exist(ab, bc, ac)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        } else {
            rsl = -1;
        }
        return rsl;
    }
}
