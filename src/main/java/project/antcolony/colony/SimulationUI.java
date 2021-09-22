package project.antcolony.colony;

import java.util.List;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SimulationUI extends Canvas {

	public SimulationUI() {
		super(500, 500);
	}

	public void updateUI(List<Colony> colonies) {
		// System.out.println("updating UI");
		renderUI(colonies);
	}

	public void renderUI(List<Colony> colonies) {
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.clearRect(0, 0, getWidth(), getHeight());
		;
		drawAllColonies(colonies);
	}

	public void drawAllColonies(List<Colony> colonies) {
		for (Colony c : colonies) {
			c.render(getGraphicsContext2D());
		}
		for (Colony c : colonies) {
			for (Ant a : c.getAnts()) {
				a.render(getGraphicsContext2D());
			}
		}
	}

}
