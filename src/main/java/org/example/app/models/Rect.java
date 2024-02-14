package org.example.app.models;

public record Rect(Point a, Point b, Point leftTop, Point rightBottom) {
    public Rect(Point a, Point b) {
        this(a, b, new Point(a.x(), b.y()), new Point(b.x(), a.y()));
    }
}
