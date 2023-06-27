package com.epam.rd.autotasks.figures;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadrilateral extends Figure {
    private Point a1;
    private Point b1;
    private Point c1;
    private Point d1;

    double a;
    double b;
    double c;
    double d;
    double diag1;
    double diag2;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a1 = a;
        this.b1 = b;
        this.c1 = c;
        this.d1 = d;

        this.a = sideLenght(a, b);
        this.b = sideLenght(b, c);
        this.c = sideLenght(c, d);
        this.d = sideLenght(a, d);

        diag1 = sideLenght(a, c);
        diag2 = sideLenght(b, d);
    }

    public double area() {
        double temp = 0;
        temp += 4 * (pow(diag1, 2)  * pow(diag2, 2)) - (pow((pow(a, 2) + pow(c, 2) - pow(b, 2) - pow(d, 2)), 2) );
        temp = sqrt(temp) / 4;
        return temp;
    }

    public Point leftmostPoint() {
        Point temp = new Point(0, 0);
        if(a1.getX() < b1.getX())
            temp = a1;
        else temp = b1;

        if(c1.getX()<temp.getX())
            temp = c1;

        if(d1.getX()<temp.getX())
            temp = d1;

        return temp;
    }

    double sideLenght(Point a, Point b) {
        double temp = pow(b.getX() - a.getX(), 2);
        temp += pow(b.getY() - a.getY(), 2);
        double result = sqrt(temp);

        if(result > 0)
            return result;

        else
            throw new IllegalArgumentException();
    }

    @Override
    public String pointsToString() {
        return a1.toString() + b1.toString() + c1.toString() + d1.toString();
    }
}
