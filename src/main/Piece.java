package main;

public abstract class Piece {
    private String _shortName, _name;
    public boolean _isWhite, _hasMoved;
    private char _filePos, _rankPos;
    Position _position;
    private static int[][] _moveVectors;

    public Piece(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        _isWhite = isWhite;
        _filePos = filePos;
        _rankPos = rankPos;
        _hasMoved = hasMoved;
        int file = Chessboard.fileToIndex(filePos);
        int rank = Chessboard.rankToIndex(rankPos);
        _position = Position.getPos(file, rank);
    }

    public int[][] moveVectors() {
        return _moveVectors;
    }

    /** Returns true iff a given moveVector is in this piece's move vectors. */
    public static boolean validMoveVector(Piece piece, int[] moveVector) {
        for (int[] otherVector : piece.moveVectors()) {
            if (otherVector.equals(moveVector)) {
                return true;
            }
        }
        return false;
    }

    /** Returns true if two pieces are on the same side. */
    public static boolean sameSide(Piece p1, Piece p2) {
        return p1._isWhite == p2._isWhite;
    }
}

class King extends Piece {
    private static final int[][] _moveVectors = {
            {0, 1},
            {1, 1},
            {1, 0},
            {1, -1},
            {0, -1},
            {-1, -1},
            {-1, 0},
            {-1, 1},
    };
    public King(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }
}

class Queen extends Piece {

    private static final int[][] _moveVectors = {
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

class Bishop extends Piece {

    private static final int[][] _moveVectors = {
            {1, 1},
            {1, -1},
            {-1, -1},
            {-1, 1},
    };

    public Bishop(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }
}

class Knight extends Piece {
    private static final int[][] _moveVectors = {
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
            {-1, -2},
            {-2, -1},
            {-2, 1},
            {-1, 2}
    };

    public Knight(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }
}

class Rook extends Piece {

    private static final int[][] _moveVectors = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };

    public Rook(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }
}

class Pawn extends Piece {
    private static final int[][] _moveVectors = {
            {0, 1},
            {-1, 1},
            {1, 1},
            {0, 2}
    };
    // y direction is flipped if black

    public Pawn(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
        super(isWhite, filePos, rankPos, hasMoved);
    }


}