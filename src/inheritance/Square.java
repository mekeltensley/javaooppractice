package inheritance;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}
