
public class Piece {
	private Position position;
	private String type;
	private String color;
	public Piece(Position position, String type, String color) {
		super();
		this.position = position;
		this.type = type;
		this.color = color;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
