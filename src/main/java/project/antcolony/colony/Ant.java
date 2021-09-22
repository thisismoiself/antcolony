package project.antcolony.colony;

public class Ant {
    private Vector2 position;
    private Vector2 velocity;
    private int size;

    public Ant(Vector2 position, Vector2 velocity, int size) {
        this.position = position;
        this.velocity = velocity;
        this.size = size;
    }

    private void updatePostition() {
        position.addTo(velocity);
    }
}

