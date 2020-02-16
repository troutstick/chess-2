package src;

public abstract class Piece {
    private String _shortName, _name;
    private boolean _isWhite, _hasMoved;
    private char _filePos, _rankPos;
    Position _position;

    private static final int[][] rookMoves = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };
    private static final int[][] bishopMoves = {
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
    private boolean validMoveVector(int[] moveVector) {
        for (int[] otherVector : moveVectors) {
            if (otherVector.equals(moveVector)) {
                return true;
            }
        }
        return false;
    }

    /** Returns true if a piece can be moved STEP * MOVEVECTOR.
     *  Does not account for checks.
     *  */
    private boolean pseudoMovable(int[] moveVector, int step) {
        if (validMoveVector(moveVector)) {
            int dx, dy;
            for (int i = 1; i <= step; i++) {
                dx = moveVector[0] * step;
                dy = moveVector[1] * step;
            }
        }
    }

    public void movePiece(int[] moveVector, int step) {
        if validMoveVector(moveVector);
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

    public Queen(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }
}