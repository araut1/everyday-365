class Solution {
       
    public int[][] fill(int[][] image, int i, int j, int target, int newColor){

        if( i < 0 || i >= image.length || j <0 || j >= image[0].length || image[i][j] != target){
            return image;
        }

        image[i][j] = newColor;

        // Up
        image = fill(image, i-1, j,target, newColor);

        //Down
        image = fill(image, i+1, j,target, newColor);

        //Left
        image = fill(image, i, j-1,target, newColor);

        // Right
        image = fill(image, i, j+1,target, newColor);

        return image;

    }



    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if(image == null || image.length == 0){
            return image;
        }

        int target= image[sr][sc];

        if(target == newColor){
            return image;
        }

        return fill(image, sr, sc,target, newColor);


    }
}
