package project.antcolony.colony;

public class GameboardObject {
    protected Vector2 position;
    protected Vector2 velocity;
    protected int size;
    protected boolean moving;

    public GameboardObject(Vector2 position, Vector2 velocity, int size, boolean moving) {
        this.position = position;
        this.velocity = velocity;
        this.size = size;
        this.moving = moving;
    }

    void updatePosition() {
        if(moving) {
            position.addTo(velocity);
        }
    }
}
