public class MultiDimensionArray
{
  public static void main(String args[])
  {
    int [][] multiArray1 = { {1,5,7}, {2,4,6}};
    int [][] multiArray2 = {{1,2,1},{4,4,3}};
    int [][] differenceArray = new int [3][3];

    for(int i=0;i< 2;i++)
    {
      for(int j=0;j< 3;j++)
      {
         System.out.print("Matrix element in multiArray1 "+multiArray1[i][j]);
      }
   
    }
    
    for(int i=0;i< 2;i++)
    {
      for(int j=0;j< 3;j++)
      {
         System.out.print("Matrix element in multiArray2 "+multiArray2[i][j]);
      }
   
    }
    
    for(int i=0;i< 2;i++)
    {
      for(int j=0;j< 3;j++)
      {
        differenceArray[i][j] = multiArray1[i][j] + multiArray2[i][j];
        System.out.print("difference Array element "+ differenceArray[i][j]);
      }
    }
  }
}