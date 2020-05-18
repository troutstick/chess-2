package main;

enum Piece {
    Pawn, Knight, Bishop, Rook, Queen, King;

    private String _shortName, _name;
    public boolean _isWhite, _hasMoved;
    private char _filePos, _rankPos;
    Position _position;
    private static int[][]
            _moveVectorsKQ = {
            {0, 1},
            {1, 1},
            {1, 0},
            {1, -1},
            {0, -1},
            {-1, -1},
            {-1, 0},
            {-1, 1}
        },
            _moveVectorsR = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        },
            _moveVectorsB = {
            {1, 1},
            {1, -1},
            {-1, -1},
            {-1, 1},
        },
            _moveVectorsN = {
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
            {-1, -2},
            {-2, -1},
            {-2, 1},
            {-1, 2}
        },
            _moveVectorsP = {
            {0, 1},
            {-1, 1},
            {1, 1},
            {0, 2}
        };

    /** The directions in which this piece can move. */
    public int[][] moveVectors() {
        switch (this) {
            case King:
            case Queen:
                return _moveVectorsKQ;
                break;
            case Rook:
                return _moveVectorsR;
                break;
            case Bishop:
            case Knight:
            case Pawn:
            default:
        }
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