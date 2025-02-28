package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public boolean isCollinearLine(Point p) {
        return (p.x - p1.x) / (p2.x - p1.x) == (p.y - p1.y) / (p2.y - p1.y);
    }

    @Override
    public String toString() {
        return String.format("%s;%s", p1, p2);
    }
}
