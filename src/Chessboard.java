package src;

/** This class represents the chessboard in which the game is played. */
class Chessboard {
    private Piece[][] _ranks;
    public Chessboard() {
        _ranks = new Piece[8][8];

    }

    public Piece getPiece(String position) {
        assert (position.length() == 2);
        int rankIndex = rankToIndex(position.charAt(0));
        int fileIndex = fileToIndex(position.charAt(1));
        return _ranks[rankIndex][fileIndex];
    }

    /** Translates file position into its index. */
    private Integer fileToIndex(char filePos) {
        Integer ans;
        switch (filePos) {
            case 'a':
                ans = 0; break;
            case 'b':
                ans = 1; break;
            case 'c':
                ans = 2; break;
            case 'd':
                ans = 3; break;
            case 'e':
                ans = 4; break;
            case 'f':
                ans = 5; break;
            case 'g':
                ans = 6; break;
            case 'h':
                ans = 7; break;
            default:
                ans = null;
        }
        return ans;
    }

    /** Translates rank position into its index. */
    private Integer rankToIndex(char rankPos) {
        Integer ans;
        switch (rankPos) {
            case '1':
                ans = 0; break;
            case '2':
                ans = 1; break;
            case '3':
                ans = 2; break;
            case '4':
                ans = 3; break;
            case '5':
                ans = 4; break;
            case '6':
                ans = 5; break;
            case '7':
                ans = 6; break;
            case '8':
                ans = 7; break;
            default:
                ans = null;
        }
        return ans;
    }

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

    public class King extends Piece {
        public King(boolean isWhite, char filePos, char rankPos, boolean hasMoved) {
            super(isWhite, filePos, rankPos, hasMoved);
        }
        private final int[][] moveVectors = {
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

    public static void main(String[] args) {
        System.out.println("hello");
    }
}