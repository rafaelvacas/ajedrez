package logica;

public class Piece {
	private Position position;
	private PieceTypeEnum type;
	private ColorEnum color;
	public Piece(Position position, PieceTypeEnum type, ColorEnum color) {
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
	public PieceTypeEnum getType() {
		return type;
	}
	public void setType(PieceTypeEnum type) {
		this.type = type;
	}
	public ColorEnum getColor() {
		return color;
	}
	public void setColor(ColorEnum color) {
		this.color = color;
	}
	
}
