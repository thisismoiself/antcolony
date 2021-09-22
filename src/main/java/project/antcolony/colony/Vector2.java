package project.antcolony.colony;

public class Vector2 {

	double x, y;
	
	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public static Vector2 add(Vector2 a, Vector2 b) {
		return new Vector2(a.x + b.x, a.y + b.y);
	}
	
	public static Vector2 sub(Vector2 a, Vector2 b) {
		return new Vector2(a.x - b.x, a.y - b.y);
	}
	
	public static Vector2 scale(Vector2 n, double s) {
		return new Vector2(n.x * s, n.y * s);
	}
	
	public void addTo(Vector2 n) {
		this.x += n.x;
		this.y += n.y;
	}
	
	public void subFrom(Vector2 n) {
		this.x -= n.x;
		this.y -= n.y;
	}
	
	public void scaleBy(double s) {
		this.x *= s;
		this.y *= s;
	}
	//Test 
	
}
