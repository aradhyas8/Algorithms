import java.util.*;

public class Solution {

    public static final int ROAD = 0;
    public static final int WALL = 1;

    public enum DIRECTION {
        UP, DOWN, LEFT, RIGHT
    }

    public static class Coordinate {
        public int x;
        public int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * The method for you to implement.
     */
    public List<DIRECTION> explore(int[][] maze, Coordinate start, Coordinate end) {
        List<DIRECTION> result = new ArrayList<>();
        // TODO
        return result;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0}
        };
        Solution solution = new Solution();
        System.out.println(solution.explore(maze, new Coordinate(0, 1), new Coordinate(3, 4))); // Should be [DOWN, RIGHT, RIGHT, DOWN, DOWN, RIGHT]
    }
}

