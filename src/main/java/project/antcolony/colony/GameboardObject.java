package project.antcolony.colony;

import javafx.scene.canvas.GraphicsContext;

public class GameboardObject {
	protected Vector2 position;
	protected Vector2 velocity;
	protected int size;
	protected boolean moving;

	private static long NEXT_UNIQUE_ID = 0;

	public GameboardObject(Vector2 position, Vector2 velocity, int size, boolean moving) {
		this.position = position;
		this.velocity = velocity;
		this.size = size;
		this.moving = moving;
	}

	void updatePosition() {
		if (moving) {
			position.addTo(velocity);
		}
	}

	public static long getNextUniqueID() {
		return NEXT_UNIQUE_ID++;
	}

	public int getSize() {
		return size;
	}

	public void render(GraphicsContext gc) {
		// TODO
	}
}
