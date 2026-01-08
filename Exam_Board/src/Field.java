public class Field
{
  private Piece piece;

  public Field()
  {
    this.piece = null;
  }

  public Field(Piece piece)
  {
    if (piece == null)
    {
      throw new IllegalArgumentException("Piece cannot be null");
    }
    this.piece = piece;
  }

  public void setPiece(Piece piece)
  {
    if (piece == null)
    {
      throw new IllegalArgumentException("Piece cannot be null");
    }
    this.piece = piece;
  }

  public void removePiece()
  {
    this.piece = null;
  }

  public Piece getPiece()
  {
    return piece;
  }

  public String toString()
  {
    return piece.toString();
  }
}
