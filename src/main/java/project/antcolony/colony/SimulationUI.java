package project.antcolony.colony;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SimulationUI extends Canvas {

	public SimulationUI() {
		super(500, 500);
	}

	public void updateUI() {
		// System.out.println("updating UI");
		renderUI();
	}

	public void renderUI() {
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(javafx.scene.paint.Color.AQUAMARINE);
		gc.fillRect(0, 0, getWidth(), getHeight());
		gc.setFill(Color.RED);
		gc.strokeLine(0, 0, getWidth(), getHeight());
		gc.strokeLine(0, getHeight(), getWidth(), 0);
		gc.setFill(javafx.scene.paint.Color.CHOCOLATE);
		gc.fillOval(getWidth() / 2 - 15, getHeight() / 2 - 15, 30, 30);
	}

}
