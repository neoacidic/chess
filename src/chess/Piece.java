package chess;

public abstract class Piece {
	private int xPosition;
	private int yPosition;
	private String color;
	
	private void setColor(String color) throws IllegalArgumentException
	{
		if(color.equals("black") || color.equals("white"))
			this.color = color;
		else
			throw new IllegalArgumentException("color was neither black nor white");
	} // setColor()
	
	public String getColor()
	{
		return this.color;
	} // getColor()
	
	public int getXPosition()
	{
		return xPosition;
	} // getXPosition()
	
	public int getYPosition()
	{
		return yPosition;
	} // getYPosition()
	
	// Reveal a Piece's type
	public String toString()
	{
		return getType() + " at " + getXPosition() + " / " + getYPosition();
	} // toString()
	
	// Reveal a Piece's type
	public String getType()
	{
		return getClass().getSimpleName();
	} // getType()
	
	// Check if two Peices are of the same type
	public boolean equals(Piece piece)
	{
		if(getType().equals(piece.getType()))
			return true;
		else
			return false;
	} // equals()
} // Piece
