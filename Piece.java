public class Piece {
    private String _shortName, _name;
    private boolean _isWhite, _hasMoved;
    private char _filePos, _rankPos;

    private final int[][] rookMoves = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };
    private final int[][] bishopMoves = {
            {1, 1},
            {1, -1},
            {-1, -1},
            {-1, 1},
    };
    private final int[][]

    public Piece(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        _isWhite = isWhite;
        _filePos = filePos;
        _rankPos = rankPos;
        _hasMoved = hasMoved;
    }
}

class King extends Piece {
    public King(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }
    private static final int[][] moveVectors = {
            {0, 1},
            {1, 1},
            {1, 0},
            {1, -1},
            {0, -1},
            {-1, -1},
            {-1, 0},
            {-1, 1},
    };
}

class Queen extends Piece {

}