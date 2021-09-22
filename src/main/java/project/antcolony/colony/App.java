package project.antcolony.colony;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) {
		var javaVersion = SystemInfo.javaVersion();
		var javafxVersion = SystemInfo.javafxVersion();

		var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		// var scene = new Scene(new StackPane(label), 640, 480);

		stage.setTitle("AntColony");
		Group root = new Group();
		Canvas canvas = new Canvas(300, 250);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.BLUE);
		gc.fillRect(75, 75, 100, 100);

		Simulation simulation = new Simulation();
		simulation.startTimer();

		root.getChildren().add(simulation.getSimulationUI());
		stage.setScene(new Scene(root));

		stage.show();

	}

	public static void main(String[] args) {

		launch();
	}

}