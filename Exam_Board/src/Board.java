public class Board
{
  private Field[][] fields;

  public Board(int rows, int cols)
  {
    this.fields = new Field[rows][cols];
  }

  public void setPiece(int row, int col, Piece piece)
  {
    fields[row][col].setPiece(piece);
  }

  public void removePiece(int row, int col)
  {
    fields[row][col].removePiece();
  }

  public void movePiece(int fromRow, int fromCol, int toRow, int toCol)
  {
    fields[toRow][toCol] = fields[fromRow][fromCol];
  }

  public Piece show(int row, int col)
  {
    return fields[row][col].getPiece();
  }

  public boolean isEmpty(int row, int col)
  {
    return fields[row][col].getPiece() == null;
  }

  public String toString()
  {
    StringBuilder boardText = new StringBuilder();
    for (int row = 0; row < fields.length; row++)
    {
      for (int col = 0; col < fields[row].length; col++)
      {
        if (!isEmpty(row, col))
        {
          boardText.append(show(row, col).getInfo());
        }
      }
    }
    return boardText.toString();
  }
}
