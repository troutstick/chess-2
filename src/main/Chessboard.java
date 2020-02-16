package main;

/** This class represents the chessboard in which the game is played. */
class  Chessboard {
    private Piece[][] _ranks;
    public Chessboard() {
        _ranks = new Piece[8][8];

    }

    public Piece getPiece(String position) {
        assert (position.length() == 2);
        int rankIndex = rankToIndex(position.charAt(0));
        int fileIndex = fileToIndex(position.charAt(1));
        if (rankIndex < 0 || fileIndex < 0) {
            return null;
        }
        return _ranks[rankIndex][fileIndex];
    }

    public Piece getPiece(int x, int y) {
        if (x >= 0 && y >= 0 && x < 8 && y < 8) {
            return _ranks[y][x];
        }
        return null;
    }

    /** Translates file position into its index. */
    protected static int fileToIndex(char filePos) {
        int ans;
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
                System.out.println("invalid char");
                ans = -1;
        }
        return ans;
    }

    /** Translates rank position into its index. */
    protected static int rankToIndex(char rankPos) {
        int ans;
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
                System.out.println("invalid char");
                ans = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}