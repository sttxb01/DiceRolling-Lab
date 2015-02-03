public class Main
{
  public static void main(String[] args)
  {
    Histogram h = new Histogram();

    Die d1 = new Die();
    Die d2 = new Die();
    int val = 0;
    
    while (val < 300000)
    {
      d1.roll();
      d2.roll();
      h.tally(d1.getUpValue() + d2.getUpValue());
      val += 1;
    }
    h.print();
  }
}