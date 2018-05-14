// exchange sort code
void ExchangeSort(apvector <int> &num)
{
     int i, j;
     int temp;   // holding variable
     int numLength = num.length( ); 
     for (i=0; i< (numLength -1); i++)    // element to be compared
    {
          for(j = (i+1); j < numLength; j++)   // rest of the elements
         {
                if (num[i] < num[j])          // descending order
               {
                        temp= num[i];          // swap
                        num[i] = num[j];
                        num[j] = temp;
               }
          }
     }
     return;
}
