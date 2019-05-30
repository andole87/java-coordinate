package coordinate.domain;

import java.util.Objects;

public class Point {
    private static final int MIN = 0;
    private static final int MAX = 24;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        valid(x, y);
        this.x = x;
        this.y = y;
    }

    private void valid(int x, int y) {
        if (x > MAX || x < MIN || y > MAX || y < MIN) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_COORDI.message());
        }
    }

    public int y() {
        return y;
    }

    public int x() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
