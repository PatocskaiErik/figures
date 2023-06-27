package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private Point centerPoint;
    private double radius;

    Circle(Point centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point leftmostPoint() {
        return new Point(centerPoint.getX() - radius, centerPoint.getY());
    }

    @Override
    public String pointsToString() {
        return centerPoint.toString();
    }

    @Override
    public String toString() {
        return "Circle["
                + centerPoint +
                 radius +
                ']';
    }
}
