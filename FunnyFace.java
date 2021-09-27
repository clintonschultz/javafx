/*
Name: Clinton Schultz
Prof: Dr. Rasib Kahn
Assign: #3 Part 1
Date: 9/29/19
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class FunnyFace extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Set up Pane.
        Pane root = new Pane();
        root.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        //Create objects to add to pane.
        //Create a centered circle for the face.
        Circle face = new Circle();
        face.setCenterX(100);
        face.setCenterY(100);
        face.setRadius(80);
        face.setStroke(Color.BLACK);
        face.setFill(Color.WHITE);
        root.getChildren().add(face);

        //Create a triangle for the nose.
        Polygon nose = new Polygon(100, 100, 90, 120, 110, 120);
        nose.setStroke(Color.BLACK);
        nose.setFill(Color.WHITE);
        root.getChildren().add(nose);

        //Create an ellipse for the left eye.
        Ellipse leftEye = new Ellipse(70, 80, 15, 10);
        leftEye.setStroke(Color.BLACK);
        leftEye.setFill(Color.WHITE);
        root.getChildren().add(leftEye);

        //Create an ellipse for the right eye.
        Ellipse rightEye = new Ellipse(130, 80, 15, 10);
        rightEye.setStroke(Color.BLACK);
        rightEye.setFill(Color.WHITE);
        root.getChildren().add(rightEye);

        //Create an arc for the mouth.
        Arc mouth = new Arc(100, 70, 80, 80, 140 + 90, 80);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.WHITE);
        mouth.setType(ArcType.OPEN);
        root.getChildren().add(mouth);

        //Create an ellipse for the left pupil.
        Ellipse leftPupil = new Ellipse(70, 80, 11, 7);
        leftPupil.setStroke(Color.BLACK);
        leftPupil.setFill(Color.BLACK);
        root.getChildren().add(leftPupil);

        //Create an ellipse for the right pupil.
        Ellipse rightPupil = new Ellipse(130, 80, 11, 7);
        rightPupil.setStroke(Color.BLACK);
        rightPupil.setFill(Color.BLACK);
        root.getChildren().add(rightPupil);

        //Create scene and place it in the stage.
        Scene scene1 = new Scene(root, 200, 200);
        primaryStage.setTitle("FunnyFace"); //Sets the stage title.
        primaryStage.setScene(scene1); //Place scene1 in the stage.
        primaryStage.show(); //Display the stage.
    }
}



