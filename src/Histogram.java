public class Histogram
{
  private int count;
  private int[] data;
  public Histogram()
  {
    count = 0;
    data = new int[13];
  }
  
  public void tally(int roll)
  {
    data[roll] += 1;
    count += 1;
  }
  
  public int getCount(int roll)
  {
    return data[roll];
  }
  
  public double getRatio(int roll)
  {
    return (double) data[roll] / count;
  }
  
  public void print()
  {
    int val = 2;
    while(val <= 12)
         {
      System.out.println(val + ":  " + data[val] + "  " + (double) data[val] / count);
      val += 1;
         }
  }
  
 // public void prettyprint()
 // {
    
 // }
}