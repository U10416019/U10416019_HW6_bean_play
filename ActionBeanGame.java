//U10416019鄭文琪

import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.animation.*;
import java.security.SecureRandom;
import javafx.util.*;
import javafx.stage.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.paint.Color;

public class ActionBeanGame extends Application{
	
	//create a pane to add all lines and circles
	Pane pane = new Pane();
	
	//create some data fields to count how many balls are there in the grid
	private static int one = 0;
	private static int two = 0;
	private static int three = 0;
	private static int four = 0;
	private static int five = 0;
	private static int six = 0;
	private static int seven = 0;
	private static int eight = 0;

	@Override
	public void start(Stage primaryStage){
		
		//create the button, lower left and lower right line
		Line button = new Line(50, 380, 330, 380);
		Line bleft = new Line(50, 380, 50, 315);
		Line bright = new Line(330, 380, 330, 315);
		//add lines in pane
		pane.getChildren().add(button);
		pane.getChildren().add(bleft);
		pane.getChildren().add(bright);
		
		
		
		//create seven button lines
		Line b1 = new Line(85, 380, 85, 315);
		Line b2 = new Line(120, 380, 120, 315);
		Line b3 = new Line(155, 380, 155, 315);
		Line b4 = new Line(190, 380, 190, 315);
		Line b5 = new Line(225, 380, 225, 315);
		Line b6 = new Line(260, 380, 260, 315);
		Line b7 = new Line(295, 380, 295, 315);
		//add lines in pane
		pane.getChildren().add(b1);
		pane.getChildren().add(b2);
		pane.getChildren().add(b3);
		pane.getChildren().add(b4);
		pane.getChildren().add(b5);
		pane.getChildren().add(b6);
		pane.getChildren().add(b7);
		
		
		
		//create top left and top right line
		Line topLeft = new Line(172.5, 15, 172.5, 55);
		Line topRight = new Line(207.5, 15, 207.5, 55);
		//add lines in pane
		pane.getChildren().add(topLeft);
		pane.getChildren().add(topRight);
		
		
		
		//create right and left slash lines
		Line left = new Line(50, 315, 172.5, 55);
		Line right = new Line(330, 315, 207.5, 55);
		//add lines in pane
		pane.getChildren().add(left);
		pane.getChildren().add(right);
		
		
		
		//create the first layer circles
		Circle c1_1 = new Circle(85, 310, 7);
		Circle c1_2 = new Circle(120, 310, 7);
		Circle c1_3 = new Circle(155, 310, 7);
		Circle c1_4 = new Circle(190, 310, 7);
		Circle c1_5 = new Circle(225, 310, 7);
		Circle c1_6 = new Circle(260, 310, 7);
		Circle c1_7 = new Circle(295, 310, 7);
		//add the circles in the pane
		pane.getChildren().add(c1_1);
		pane.getChildren().add(c1_2);
		pane.getChildren().add(c1_3);
		pane.getChildren().add(c1_4);
		pane.getChildren().add(c1_5);
		pane.getChildren().add(c1_6);
		pane.getChildren().add(c1_7);
		
		
		
		//create the second layer circles
		Circle c2_1 = new Circle(102.5, 272, 7);
		Circle c2_2 = new Circle(137.5, 272, 7);
		Circle c2_3 = new Circle(172.5, 272, 7);
		Circle c2_4 = new Circle(207.5, 272, 7);
		Circle c2_5 = new Circle(242.5, 272, 7);
		Circle c2_6 = new Circle(277.5, 272, 7);
		//add the circles in the pane
		pane.getChildren().add(c2_1);
		pane.getChildren().add(c2_2);
		pane.getChildren().add(c2_3);
		pane.getChildren().add(c2_4);
		pane.getChildren().add(c2_5);
		pane.getChildren().add(c2_6);
		
		
		
		//create the third layer circles
		Circle c3_1 = new Circle(120, 234, 7);
		Circle c3_2 = new Circle(155, 234, 7);
		Circle c3_3 = new Circle(190, 234, 7);
		Circle c3_4 = new Circle(225, 234, 7);
		Circle c3_5 = new Circle(260, 234, 7);
		//add the circles in the pane
		pane.getChildren().add(c3_1);
		pane.getChildren().add(c3_2);
		pane.getChildren().add(c3_3);
		pane.getChildren().add(c3_4);
		pane.getChildren().add(c3_5);
		
		
		
		//create the forth layer circles
		Circle c4_1 = new Circle(137.5, 196, 7);
		Circle c4_2 = new Circle(172.5, 196, 7);
		Circle c4_3 = new Circle(207.5, 196, 7);
		Circle c4_4 = new Circle(242.5, 196, 7);
		//add the circles in the pane
		pane.getChildren().add(c4_1);
		pane.getChildren().add(c4_2);
		pane.getChildren().add(c4_3);
		pane.getChildren().add(c4_4);
		
		
		
		//create the fifth, sixth and seventh layer circles
		Circle c5_1 = new Circle(155, 158, 7);
		Circle c5_2 = new Circle(190, 158, 7);
		Circle c5_3 = new Circle(225, 158, 7);
		Circle c6_1 = new Circle(172.5, 120, 7);
		Circle c6_2 = new Circle(207.5, 120, 7);
		Circle c7_1 = new Circle(190, 82, 7);
		//add the circles in the pane
		pane.getChildren().add(c5_1);
		pane.getChildren().add(c5_2);
		pane.getChildren().add(c5_3);
		pane.getChildren().add(c6_1);
		pane.getChildren().add(c6_2);
		pane.getChildren().add(c7_1);
		
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 380, 410);
		primaryStage.setTitle("U10416019 鄭文琪");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//when the user press the space then start
		pane.requestFocus();
		pane.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.SPACE){
				ballAction();
			}
		});
	}

	}
}