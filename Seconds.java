import java.util.Timer;
import java.util.TimerTask;

public class Seconds extends TimerTask
{
  @Override
  public void run(x, y, z)
  {
    this.x = x;
    this.y = y;

    x += z;
    y += z;
  }

  Timer timer = new Timer();
  timer.schedule(new Seconds(), 0 ,1000);
}
