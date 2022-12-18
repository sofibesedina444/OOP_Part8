import java.util.Objects;

public class Example {

    private final int x;
    private final int y;

    public Example(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Example)) return false;
        Example example = (Example) o;
        return x == example.x && y == example.y || x == example.y && y == example.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x) + Objects.hash(y);
    }

    @Override
    public String toString() {
        return x + " * " + y + " = " + (x * y) + "\n";
    }
}
