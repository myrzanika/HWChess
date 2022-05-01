public abstract class ChessPiece {

    String color;
    boolean check =true;
    public ChessPiece(String color){
        this.color = color;
    }
    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum);
    public abstract String getSymbol();

    protected boolean checkPos(int pos) {return pos >= 00 && pos <=7; }
    protected int getMax(int a, int b) { return Math.max(a,b);}
    protected int getMin(int a, int b) { return Math.min(a,b);}

}
