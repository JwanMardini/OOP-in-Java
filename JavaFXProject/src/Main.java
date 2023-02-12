import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    // Two scenes
    /*@Override
    public void start(Stage stage) throws Exception {
        window = stage;

        Label label = new Label("Welcome to first scene!");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 200, 200);

        // Button2
        Button button2 = new Button("This is scene 2");
        button2.setOnAction(e -> window.setScene(scene1));

        // Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();

    }*/

    // Alert box
    @Override
    public void start(Stage stage) {
        //stage.setTitle("Title of the window");
        window = stage;
        window.setTitle("First window");

        button.setText("Click me");
        button.setOnAction(e -> AlertBox.display("Title of window", "Alert box"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();
    }



}