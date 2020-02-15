package src;

public abstract class Piece {
    private String _shortName, _name;
    private boolean _isWhite, _hasMoved;
    private char _filePos, _rankPos;
    Position _position;

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
    private static final int[][] moveVectors = new int[0][0];

    public Piece(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        _isWhite = isWhite;
        _filePos = filePos;
        _rankPos = rankPos;
        _hasMoved = hasMoved;
        int file = Chessboard.fileToIndex(filePos);
        int rank = Chessboard.rankToIndex(rankPos);
        _position = Position.getPos(file, rank);
    }

    /** Returns true iff a given moveVector is in this piece's move vectors. */
    private boolean validMoveVector(int[][] moveVector, int step) {
        for (int[] otherVector : moveVectors) {
            if (otherVector.equals(moveVector)) {
                return true;
            }
        }
        return false;
    }

    public movePiece(int[][] moveVector, int step)
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