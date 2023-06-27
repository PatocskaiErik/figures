package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private Point a1;
    private Point b1;
    private Point c1;

    double a;
    double b;
    double c;

    double s;
    double h;
    double p;

    public Triangle(Point a, Point b, Point c) {
        this.a1 = a;
        this.b1 = b;
        this.c1 = c;

        this.a = sideLenght(a, b);
        this.b = sideLenght(b, c);
        this.c = sideLenght(a, c);
    }

    public double area() {
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        h = (Math.sqrt(p * (p - a) * (p - b) * (p - c))) / a;

        return s;
    }

    public Point leftmostPoint() {
        Point temp;
        if(a1.getX() < b1.getX())
            temp = a1;
        else temp = b1;

        if(c1.getX() < temp.getX())
            temp = c1;

        return temp;
    }

    double sideLenght(Point a, Point b) {
        double temp = Math.pow(b.getX() - a.getX(), 2);
        temp += Math.pow(b.getY() - a.getY(), 2);
        double result = Math.sqrt(temp);

        if(result > 0)
            return result;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String pointsToString() {
        return a1.toString() + b1.toString() + c1.toString();
    }
}
