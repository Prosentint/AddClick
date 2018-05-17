public class addClick extends Application
{
  public int PERCLICK = 1;
  public int PERSEC = 0;
  public int TOTAL = 0;
  public int COUNTER = 0;
  public int TIME = 0;

  public int CLICKER = 1;

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
    if(MULTICLICK == 0)
    {
      if(DIVICLICK == 0)
      {
        CLICKER = CLICKER + ADDCLICK - SUBCLICK;
      }
      else
      {
        CLICKER = CLICKER / DIVICLICK + ADDCLICK - SUBCLICK;
      }
    }
    else if(DIVICLICK = 0)
    {
      CLICKER = CLICKER * MULTICLICK + ADDCLICK - SUBCLICK;
    }
    else
    {
      CLICKER = CLICKER * MULTICLICK / DIVICLICK + ADDCLICK - SUBCLICK;
    }
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
      SUBCLICK = SUBCLICK + 5;
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
      SUBCLICK = SUBCLICK + 10;
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
      SUBCLICK = SUBCLICK + 5;
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
      SUBCLICK = SUBCLICK + 25;
    }
  }
  public static void purchaseResultTEN5PC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 89)
    {
      ADDCLICK = ADDCLICK + 50;
    }
    else
    {
      SUBCLICK = SUBCLICK + 50;
    }
  }
  public static void purchaseResultONE2TC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 70)
    {
      MULTICLICK = MULTICLICK + 2;
    }
    else
    {
      DIVICLICK = DIVICLICK + 2;
    }
  }
  public static void purchaseResultFIVE2TC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 75)
    {
      MULTICLICK = MULTICLICK + 10;
    }
    else
    {
      DIVICLICK = DIVICLICK + 10;
    }
  }
  public static void purchaseResultTEN2TC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 79)
    {
      MULTICLICK = MULTICLICK + 20;
    }
    else
    {
      DIVICLICK = DIVICLICK + 20;
    }
  }
  public static void purchaseResultONE5TC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 60)
    {
      MULTICLICK = MULTICLICK + 5;
    }
    else
    {
      DIVICLICK = DIVICLICK + 5;
    }
  }
  public static void purchaseResultFIVE5TC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 65)
    {
      MULTICLICK = MULTICLICK + 25;
    }
    else
    {
      DIVICLICK = DIVICLICK + 25;
    }
  }
  public static void purchaseResultTEN5TC()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 70)
    {
      MULTICLICK = MULTICLICK + 50;
    }
    else
    {
      DIVICLICK = DIVICLICK + 50;
    }
  }
  public static void purchaseResultONE1PS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 90)
    {
      ADDSEC++;
    }
    else
    {
      SUBSEC++;
    }
  }
  public static void purchaseResultFIVE1PS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 95)
    {
      ADDSEC = ADDSEC + 5;
    }
    else
    {
      SUBSEC = SUBSEC + 5;
    }
  }
  public static void purchaseResultTEN1PS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 99)
    {
      ADDSEC = ADDSEC + 10;
    }
    else
    {
      SUBCLICK = SUBCLICK + 10;
    }
  }
  public static void purchaseResultONE5PS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 80)
    {
      ADDSEC = ADDSEC + 5;
    }
    else
    {
      SUBSEC = SUBSEC + 5;
    }
  }
  public static void purchaseResultFIVE5PS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 85)
    {
      ADDSEC = ADDSEC + 25;
    }
    else
    {
      SUBSEC = SUBSEC + 25;
    }
  }
  public static void purchaseResultTEN5PS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 89)
    {
      ADDSEC = ADDSEC + 50;
    }
    else
    {
      SUBSEC = SUSEC + 50;
    }
  }
  public static void purchaseResultONE2TS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 70)
    {
      MULTISEC = MULTISEC + 2;
    }
    else
    {
      DIVISEC = DIVISEC + 2;
    }
  }
  public static void purchaseResultFIVE2TS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 75)
    {
      MULTISEC = MULTISEC + 10;
    }
    else
    {
      DIVISEC = DIVISEC + 10;
    }
  }
  public static void purchaseResultTEN2TS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 79)
    {
      MULTISEC = MULTISEC + 20;
    }
    else
    {
      DIVISEC = DIVISEC + 20;
    }
  }
  public static void purchaseResultONE5TS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 60)
    {
      MULTISEC = MULTISEC + 5;
    }
    else
    {
      DIVISEC = DIVISEC + 5;
    }
  }
  public static void purchaseResultFIVE5TS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 65)
    {
      MULTISEC = MULTISEC + 25;
    }
    else
    {
      DIVISEC = DIVISEC + 25;
    }
  }
  public static void purchaseResultTEN5TS()
  {
    int c = (Math.random()*((100-0)+1))+1;
    if(c <= 70)
    {
      MULTISEC = MULTISEC + 50;
    }
    else
    {
      DIVISEC = DIVISEC + 50;
    }
  }
}
