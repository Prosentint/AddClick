public class addClick extends Application
{
  public int PERSEC = 1;
  public int PERSEC = 0;
  public int TOTAL = 0;
  public int COUNTER = 0;
  public int TIME = 0;

  public int ONEPCCOST = 20;
  public int FIVEPCCOST = 50
  public int TWOTCCOST = 100;
  public int FIVETCCOST = 200;

  public int ONEPSCOST = 100;
  public int FIVEPSCOST = 200;
  public int TWOTSCOST = 400;
  public int FIVETSCOST = 1000;

  public int ADDCLICK = 0;
  public int SUBCLICK = 0;
  public int MULTICLICK = 0;
  public int DIVICLICK = 0;

  public int ADDSEC = 0;
  public int SUBSEC = 0;
  public int MULTISEC = 0;
  public int DIVISEC = 0;

  public int PURCHASECOUNT = 1;

  public static void changeMULTS()
  {
    CLICKER = CLICKER * MULTICLICK / DIVICLICK + ADDCLICK - SUBCLICK;
    PERSEC = PERSEC * MULTISEC / DIVISEC + ADDSEC - SUBSEC;
  }

  public static void raisePrice(x)
  {
    this.x = x;
    COUNTER = COUNTER - x;
    x = x ** 1.1;
  }
  public static void purchaseResultONE1PC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 90)
    {
      ADDCLICK++;
    }
    else
    {
      SUBCLICK++;
    }
  }
  public static void purchaseResultFIVE1PC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 95)
    {
      ADDCLICK = ADDCLICK + 5;
    }
    else
    {
      SUBCLICK = SUBCLICK - 5;
    }
  }
  public static void purchaseResultTEN1PC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 99)
    {
      ADDCLICK = ADDCLICK + 10;
    }
    else
    {
      SUBCLICK = SUBCLICK - 10;
    }
  }
  public static void purchaseResultONE5PC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 80)
    {
      ADDCLICK = ADDCLICK + 5;
    }
    else
    {
      SUBCLICK = SUBCLICK - 5;
    }
  }
  public static void purchaseResultFIVE5PC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 85)
    {
      ADDCLICK = ADDCLICK + 25;
    }
    else
    {
      SUBCLICK = SUBCLICK - 25;
    }
  }
}
