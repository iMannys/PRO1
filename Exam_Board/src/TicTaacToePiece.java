public class TicTaacToePiece extends Piece
{
  public TicTaacToePiece(boolean isX)
  {
    super(isX ? "X" : "O");
  }

  public String getInfo()
  {
    return "Piece: " + super.getName();
  }
}
