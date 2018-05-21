public class addClick extends Application
{
  public int PERCLICK = 1;
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

  public static void changePERCLICK()
  {
    if(MULTICLICK == 0)
    {
      if(DIVICLICK == 0)
      {
        PERCLICK = PERCLICK + ADDCLICK - SUBCLICK;
      }
      else
      {
        PERCLICK = PERCLICK / DIVICLICK + ADDCLICK - SUBCLICK;
      }
    }
    else if(DIVICLICK = 0)
    {
      PERCLICK = PERCLKICK * MULTICLICK + ADDCLICK - SUBCLICK;
    }
    else
    {
      PERCLICK = PERCLICK * MULTICLICK / DIVICLICK + ADDCLICK - SUBCLICK;
    }
  }

  public static void buyAndRaisePrice(x)
  {
    this.x = x;
    COUNTER = COUNTER - x;
    x = x ** 1.1;
  }
  public static void purchaseONE1PC()
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
    buyAndRaisePrice(ONEPCCOST);
  }
  public static void purchaseFIVE1PC()
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
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
  }
  public static void purchaseTEN1PC()
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
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
    buyAndRaisePrice(ONEPCCOST);
  }
  public static void purchaseONE5PC()
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
    buyAndRaisePrice(FIVEPCCOST);
  }
  public static void purchaseFIVE5PC()
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
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
  }
  public static void purchaseTEN5PC()
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
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
    buyAndRaisePrice(FIVEPCCOST);
  }
  public static void purchaseONE2TC()
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
    buyAndRaisePrice(TWOTCCOST);
  }
  public static void purchaseFIVE2TC()
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
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
  }
  public static void purchaseTEN2TC()
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
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
    buyAndRaisePrice(TWOTCCOST);
  }
  public static void purchaseONE5TC()
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
    buyAndRaisePrice(FIVETCCOST);
  }
  public static void purchaseFIVE5TC()
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
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
  }
  public static void purchaseTEN5TC()
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
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
    buyAndRaisePrice(FIVETCCOST);
  }
  public static void purchaseONE1PS()
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
    buyAndRaisePrice(ONEPSCOST);
  }
  public static void purchaseFIVE1PS()
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
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
  }
  public static void purchaseTEN1PS()
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
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
    buyAndRaisePrice(ONEPSCOST);
  }
  public static void purchaseONE5PS()
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
    buyAndRaisePrice(FIVEPSCOST);
  }
  public static void purchaseFIVE5PS()
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
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
  }
  public static void purchaseTEN5PS()
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
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
    buyAndRaisePrice(FIVEPSCOST);
  }
  public static void purchaseONE2TS()
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
    buyAndRaisePrice(TWOTSCOST);
  }
  public static void purchaseFIVE2TS()
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
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
  }
  public static void purchaseTEN2TS()
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
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
    buyAndRaisePrice(TWOTSCOST);
  }
  public static void purchaseONE5TS()
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
    buyAndRaisePrice(FIVETSCOST);
  }
  public static void purchaseFIVE5TS()
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
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
  }
  public static void purchaseTEN5TS()
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
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
    buyAndRaisePrice(FIVETSCOST);
  }
}
