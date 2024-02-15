package org.example.app.models;

import java.util.Objects;

public record Point(int x, int y) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    public boolean isSameVertical(Point point) {
        return y == point.y;
    }

    public boolean isSameHorizontal(Point point) {
        return x == point.x;
    }

    public boolean isAboveThan(Point point) {
        return y > point.y;
    }

    public boolean isBelowThan(Point point) {
        return y < point.y;
    }

    public boolean isLefterThan(Point point) {
        return x < point.x;
    }

    public boolean isRighterThan(Point point) {
        return x > point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
