// Pause class to pause applications
// Anderson, Franceschi
//Not Mine

public class Pause
{
  public static void wait( double seconds )
  {
     try
     {
       Thread.sleep( (int) ( seconds * 1000 ) );
     }
     catch ( InterruptedException e )
     {
       e.printStackTrace( );
     }
  }
}