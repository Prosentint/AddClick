Timer timer = new Timer();
timer.schedule(new Seconds(), 0 ,1000);

public class addClick
{
  public double PERCLICK = 1;
  public double PERSEC = 0;
  public double TOTAL = 0;
  public double COUNTER = 0;

  public double ONEPCCOST = 20;
  public double FIVEPCCOST = 50;
  public double TWOTCCOST = 100;
  public double FIVETCCOST = 200;

  public double ONEPSCOST = 100;
  public double FIVEPSCOST = 200;
  public double TWOTSCOST = 400;
  public double FIVETSCOST = 1000;

  public double ADDCLICK = 0;
  public double SUBCLICK = 0;
  public double MULTICLICK = 0;
  public double DIVICLICK = 0;

  public double ADDSEC = 0;
  public double SUBSEC = 0;
  public double MULTISEC = 0;
  public double DIVISEC = 0;

  public double PURCHASECOUNT = 1;

  public double numberPerPurchase = 1;
  public double type;

  Timer timer = new Timer();
  timer.schedule(new Seconds(), 0 ,1000);

  public void click()
  {
    COUNTER += PERCLICK;
    TOTAL += PERCLICK;
  }
  public void changePERCLICK()
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
    else if(DIVICLICK == 0)
    {
      PERCLICK = PERCLICK * MULTICLICK + ADDCLICK - SUBCLICK;
    }
    else
    {
      PERCLICK = PERCLICK * MULTICLICK / DIVICLICK + ADDCLICK - SUBCLICK;
    }
    noLowerThanClick();
  }
  public void changePERSEC()
  {
    if(MULTISEC == 0)
    {
      if(DIVISEC == 0)
      {
        PERSEC = PERSEC + ADDSEC - SUBSEC;
      }
      else
      {
        PERSEC = PERSEC / DIVISEC + ADDSEC - SUBSEC;
      }
    }
    else if(DIVISEC == 0)
    {
      PERSEC = PERSEC * MULTISEC + ADDSEC - SUBSEC;
    }
    else
    {
      PERSEC = PERSEC * MULTISEC / DIVISEC + ADDSEC - SUBSEC;
    }
    noLowerThanSec();
  }
  public void noLowerThanClick()
  {
    if(PERCLICK < 1)
    {
      PERCLICK = 1;
    }
  }
  public void noLowerThanSec()
  {
    if(PERSEC < 0)
    {
      PERSEC = 0;
    }
  }
  public void onePerPurchase()
  {
    numberPerPurchase = 1;
  }
  public void fivePerPurchase()
  {
    numberPerPurchase = 5;
  }
  public void tenPerPurchase()
  {
    numberPerPurchase = 10;
  }
  public void buyAndRaisePrice(double type)
  {
    this.type = type;
    COUNTER = COUNTER - type;
    type = (type) * (type*1.1);
  }
  public void purchaseONE1PC()
  {
    if(ONEPCCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 90)
      {
        ADDCLICK++;
      }
      else
      {
        SUBCLICK++;
      }
      buyAndRaisePrice(ONEPCCOST);
      changePERCLICK();
    }
  }
  public void purchaseFIVE1PC()
  {
    if((ONEPCCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseTEN1PC()
  {
    if((ONEPCCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseONE5PC()
  {
    if(FIVEPCCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 80)
      {
        ADDCLICK = ADDCLICK + 5;
      }
      else
      {
        SUBCLICK = SUBCLICK + 5;
      }
      buyAndRaisePrice(FIVEPCCOST);
      changePERCLICK();
    }
  }
  public void purchaseFIVE5PC()
  {
    if((FIVEPCCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseTEN5PC()
  {
    if((FIVEPCCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseONE2TC()
  {
    if(TWOTCCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 70)
      {
        MULTICLICK = MULTICLICK + 2;
      }
      else
      {
        DIVICLICK = DIVICLICK + 2;
      }
      buyAndRaisePrice(TWOTCCOST);
      changePERCLICK();
    }
  }
  public void purchaseFIVE2TC()
  {
    if((TWOTCCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseTEN2TC()
  {
    if((TWOTCCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseONE5TC()
  {
    if(FIVETCCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 60)
      {
        MULTICLICK = MULTICLICK + 5;
      }
      else
      {
        DIVICLICK = DIVICLICK + 5;
      }
      buyAndRaisePrice(FIVETCCOST);
      changePERCLICK();
    }
  }
  public void purchaseFIVE5TC()
  {
    if((FIVETCCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseTEN5TC()
  {
    if((FIVETCCOST * 10) > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERCLICK();
    }
  }
  public void purchaseONE1PS()
  {
    if(ONEPSCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 90)
      {
        ADDSEC++;
      }
      else
      {
        SUBSEC++;
      }
      buyAndRaisePrice(ONEPSCOST);
      changePERSEC();
    }
  }
  public void purchaseFIVE1PS()
  {
    if((ONEPSCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
  public void purchaseTEN1PS()
  {
    if((ONEPSCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
  public void purchaseONE5PS()
  {
    if(FIVEPSCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 80)
      {
        ADDSEC = ADDSEC + 5;
      }
      else
      {
        SUBSEC = SUBSEC + 5;
      }
      buyAndRaisePrice(FIVEPSCOST);
      changePERSEC();
    }
  }
  public void purchaseFIVE5PS()
  {
    if((FIVEPSCOST * 5) > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
  public void purchaseTEN5PS()
  {
    if((FIVEPSCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 89)
      {
        ADDSEC = ADDSEC + 50;
      }
      else
      {
        SUBSEC = SUBSEC + 50;
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
      changePERSEC();
    }
  }
  public void purchaseONE2TS()
  {
    if(TWOTSCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 70)
      {
        MULTISEC = MULTISEC + 2;
      }
      else
      {
        DIVISEC = DIVISEC + 2;
      }
      buyAndRaisePrice(TWOTSCOST);
      changePERSEC();
    }
  }
  public void purchaseFIVE2TS()
  {
    if((TWOTSCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
  public void purchaseTEN2TS()
  {
    if((TWOTSCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
  public void purchaseONE5TS()
  {
    if(FIVETSCOST > COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
      if(c <= 60)
      {
        MULTISEC = MULTISEC + 5;
      }
      else
      {
        DIVISEC = DIVISEC + 5;
      }
      buyAndRaisePrice(FIVETSCOST);
      changePERSEC();
    }
  }
  public void purchaseFIVE5TS()
  {
    if((FIVETSCOST * 5)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
  public void purchaseTEN5TS()
  {
    if((FIVETSCOST * 10)> COUNTER)
    {
      ;
    }
    else
    {
      double c = (Math.random()*((100-0)+1))+1;
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
      changePERSEC();
    }
  }
}
