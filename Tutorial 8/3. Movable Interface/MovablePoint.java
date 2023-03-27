public class MovablePoint implements Movable {
	private int x, y, xSpeed, ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	/** Returns a self-descriptive string in the form of "(x,y),speed=(x,y)" */
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + "),speed=(" + this.xSpeed + "," + this.ySpeed + ")";
	}

	@Override
	public void moveUp() {   // provide implementation
		y -= ySpeed;
	}

	@Override
	public void moveDown() {   // provide implementation
		y += ySpeed;
	}

	@Override
	public void moveLeft() {   // provide implementation
		x -= xSpeed;
	}

	@Override
	public void moveRight() {   // provide implementation
		x += xSpeed;
	}
}