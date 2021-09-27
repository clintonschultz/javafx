/*
Name: Clinton Schultz
Prof: Dr. Rasib Kahn
Assign: #3 Part 2
Date: 10/3/19
*/

import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import java.util.Random;


public class ModernArts extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group(); //Create Group to store random rectangles
        Random rand = new Random(); //Instantiate Random object.
        //For-loop to create the rectangles
        for (int i = 0; i < 50; i++) {
            float x = (float) (rand.nextInt(600));
            float y = (float) (rand.nextInt(300));

            //Create new random rectangles.
            Rectangle r = new Rectangle(x, y, Math.random() * 100, Math.random() * 100);
            r.setFill(Color.color(Math.random(), Math.random(), Math.random())); //Set fill color of rectangle.
            //r.setStroke(Color.color(Math.random(), Math.random(), Math.random())); Optional: randomly colored stroke.
            r.setOpacity(Math.random()); //Set opacity of rectangle object.
            root.getChildren().add(r); //Add each rectangle to the Group.
        }

        Scene scene = new Scene(root, 600, 300, Color.WHITE); //Set up scene with root Group inside.
        primaryStage.setTitle("ModernArts"); //Set title for the scene.
        primaryStage.setScene(scene); //Set up the stage for displaying the scene.
        primaryStage.show(); //Show the project.
    }

    public static void main(String[] args) {
        launch(args);
    }
}
