  public void mark(char[][] grid, int i, int j) {

        //  mark(grid,i,j);


        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return ;
        }


        grid[i][j] = '0';


        int ui = i - 1;
        int uj = j;
        int di = i + 1;
        int dj = j;
        int ri = i;
        int rj = j + 1;
        int li = i;
        int lj = j - 1;

        // up

        mark( grid, ui, uj);


        // down

         mark(grid, di, dj);

        // left

         mark( grid, li, lj );

        // right

         mark( grid, ri, rj);



    }


   public int numIslands(char[][] grid) {


        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int num = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {


                // land
                if (grid[i][j] == '1' ) {

                    num++;

                    mark(grid, i, j);


                }
            }
        }


        return num;

    }
