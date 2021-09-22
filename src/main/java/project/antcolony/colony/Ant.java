package project.antcolony.colony;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ant extends GameboardObject {

	public static double MAX_ANT_SPEED = 2;

	public Ant(Vector2 position, Vector2 velocity, int size) {
		super(position, velocity, size, true);
	}

	@Override
	public void render(GraphicsContext gc) {
		gc.setFill(Color.RED);
		gc.fillOval(position.x - size / 2, position.y - size / 2, size, size);
	}
}
