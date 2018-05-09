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

  public static void changeCLICKER()
  {
    CLICKER = CLICKER * MULTICLICK / DIVICLICK + ADDCLICK - SUBCLICK;
  }

  public static void changePERSEC()
  {
    PERSEC = PERSEC * MULTISEC / DIVISEC + ADDSEC - SUBSEC;
  }

  public static void raiseCostONEPC()
  {
    ONEPCCOST = ONEPCCOST ** 1.1;
  }

  public static void raiseCostFIVEPC()
  {
    FIVEPCCOST = FIVEPCCOST ** 1.1;
  }

  public static void raiseCostTWOTC()
  {
    TWOTCCOST = TWOTCCOST ** 1.1;
  }

  public static void raiseCostFIVETC()
  {
    FIVETCCOST = FIVETCCOST ** 1.1;
  }

  public static void raiseCostONEPS()
  {
    ONEPSCOST = ONEPSCOST ** 1.1;
  }

  public static void raiseCostFIVEPS()
  {
    FIVEPSCOST = FIVEPSCOST ** 1.1;
  }

  public static void raiseCostTWOTS()
  {
    TWOTSCOST = TWOTSCOST ** 1.1;
  }

  public static void raiseCostFIVETS()
  {
    FIVETSCOST = FIVETSCOST ** 1.1;
  }
}
