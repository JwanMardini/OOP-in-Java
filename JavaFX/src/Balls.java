import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Balls extends Application {

    private final List<Ball> balls = new ArrayList<>();
    private int ballCount = 0;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);

        // Create a button for creating new balls
        createButton(root);

        // Create an animation for updating the balls' positions
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(20), event -> updateBalls(root))
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

        primaryStage.setTitle("Bouncing Balls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void createButton(Group root) {
        Button newBallButton = new Button("New Ball");
        newBallButton.setTranslateX(700);
        newBallButton.setTranslateY(550);
        newBallButton.setOnAction(event -> createNewBall(root));
        root.getChildren().add(newBallButton);
    }

    private void createNewBall(Group root) {
        // Create a new ball with a unique color
        Ball ball = new Ball(ballCount++);
        balls.add(ball);
        root.getChildren().add(ball.getCircle());
    }

    private void updateBalls(Group root) {
        // Update the position of each ball and check for screen boundaries
        for (Ball ball : balls) {
            ball.move(root.getScene().getWidth(), root.getScene().getHeight());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}