
public class Piece {
	private Position position;
	private PieceType type;
	private Color color;
	public Piece(Position position, PieceType type, Color color) {
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
	public PieceType getType() {
		return type;
	}
	public void setType(PieceType type) {
		this.type = type;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
