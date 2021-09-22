package project.antcolony.colony;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Colony extends GameboardObject {

	private List<Ant> ants;

	public Colony(Vector2 position, int size) {
		super(position, null, size, false);
		this.ants = new ArrayList<Ant>();
	}

	public Ant spawnAnt() {

		Ant ant = new Ant(position.copy(),
				new Vector2(Math.random() * Ant.MAX_ANT_SPEED, Math.random() * Ant.MAX_ANT_SPEED), 10);
		ants.add(ant);

		return ant;
	}

	public List<Ant> getAnts() {
		return ants;
	}

	@Override
	public void updatePosition() {
		for (Ant a : ants) {
			a.updatePosition();
		}
	}

	@Override
	public void render(GraphicsContext gc) {
		gc.setFill(Color.BROWN);
		gc.fillRect(position.x - size / 2, position.y - size / 2, size, size);
	}
}
