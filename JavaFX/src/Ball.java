import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball {
    private Circle circle;
    private double dx;
    private double dy;

    public Ball(int ballNumber) {
        // Set the ball's color based on its number
        Color color;
        if (ballNumber % 2 == 0) {
            color = Color.RED;
        } else if (ballNumber % 3 == 0) {
            color = Color.BLUE;
        } else {
            color = Color.GREEN;
        }

        // Create the ball's circle shape
        circle = new Circle(50, color);
        circle.setCenterX(Math.random() * 700 + 50);
        circle.setCenterY(Math.random() * 500 + 50);

        // Set the ball's initial movement direction
        dx = Math.random() * 10 - 5;
        dy = Math.random() * 10 - 5;
    }

    public void move(double sceneWidth, double sceneHeight) {
        // Update the ball's position based on its movement direction
        circle.setCenterX(circle.getCenterX() + dx);
        circle.setCenterY(circle.getCenterY() + dy);
        if (getX() - getRadius() <= 0 ||
                getX() + getRadius() >= sceneWidth) {
            dx=-dx;
        }
        if (getY() - getRadius() <= 0 ||
                getY() + getRadius() >= sceneHeight) {
            dy=-dy;
        }
    }

    public Circle getCircle() {
        return circle;
    }

    private double getX() {
        return circle.getCenterX();
    }

    private double getY() {
        return circle.getCenterY();
    }

    private double getRadius() {
        return circle.getRadius();
    }
}