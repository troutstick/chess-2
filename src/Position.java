package src;

/** Singleton class to represent the position of something on a 2d grid.
 *  Limited to 8x8 grid for now. */
public class Position {
    private Position(int x0, int y0) {
        x = x0;
        y = y0;
    }

    public static Position getPos(int x, int y) {
        assert (x >= 0 && y >= 0 && x < 8 && y < 8);
        if (_allPositions[x][y] == null) {
            Position newPos = new Position(x, y);
            _allPositions[x][y] = newPos;
        }
        return _allPositions[x][y];
    }

    final int x, y;
    private static Position[][] _allPositions = new Position[8][8];
}
