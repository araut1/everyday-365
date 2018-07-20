#include <stdio.h>

int main()

{

     int i, j, rows, space = 1;

 

     printf("Please enter number of rows you want to see in half Diamond\n");

     scanf("%d", &rows);

 

     printf("Diamond pattern:\n");

 

     space = rows - 1;

 

     for (j = 1; j <= rows; j++)

     {

          for (i = 1; i <= space; i++)

          printf(" ");

 

          space--;

 

          for (i = 1; i <= 2*j-1; i++)

          printf("*");

          printf("\n");

     }

 

     space = 1;

 

     for (j = 1; j <= rows - 1; j++)

     {

          for (i = 1; i <= space; i++)

          printf(" ");

 

          space++;

 

          for (i = 1 ; i <= 2*(rows-j)-1; i++)

          printf("*");

 

          printf("\n");

     }

     return 0;

}
