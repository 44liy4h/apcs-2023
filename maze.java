public class maze {
    class Maze {

        private char[][] grid;

        private boolean solution;
      
        public Maze(int rows, int cols, String maze) { /* TODO part a */ }
        public char[][] getGrid() {
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    maze[i][j] = 1;
        }
        /**
         * @returns coordinates of the starting location, as "r,c" (row, column)
         */ int row = 1;
        int col = 1;
        maze[row][col] = 0;
        public String getStart() { /* not shown */ }
      
        /**
         * @returns coordinates of the target location, as "r,c" (row, column)
         */
        public String getGoal() { /* not shown */ }
      
        /**
         * Explores the maze from point r,c to determine if there is a path
         * to the goal.
         */
        private void explore(int r, int c) { /* TODO part b */ }
      
        /**
         * Determins if the maze has a solution or not.
         */
        public boolean hasSolution() { /* TODO part c */ }
          if 
            
      }
}
