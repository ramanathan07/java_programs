import java.util.Scanner;

class EBBillpay
{
  int conno;
  String conname;
  int previous_reading;
  int current_reading;
  String EBContype;
  double Billpay;

  void input_data ()
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("\n Enter Consumer Number: ");
      conno = sc.nextInt ();
      System.out.println ("\n Enter Consumer Name: ");
      conname = sc.next ();
      System.out.println ("\n Enter Previous Units: ");
      previous_reading = sc.nextInt ();
      System.out.println ("Enter Current Units consumed:");
      current_reading = sc.nextInt ();
      System.
      out.println
      ("Enter the types of EB Connection(domestic or commercial)");
      EBContype = sc.next ();
  }

  double calculate_Billpay ()
  {
    int choice;
    if (EBContype == "domenstic")
      choice = 1;
    else
      choice = 2;
    switch (choice)
      {
      case 1:
	if (current_reading >= 0 && current_reading <= 100)
	  Billpay = current_reading * 1;
	else if (current_reading > 100 && current_reading <= 200)
	  Billpay = (100 * 1) + ((current_reading - 100) * 2.50);
	else if (current_reading > 200 && current_reading <= 500)
	  Billpay = (100 * 1) + (100 * 2.50) + ((current_reading - 200) * 4);
	else
	  Billpay =
	    (100 * 1) + (100 * 2.50) + (300 * 4) +
	    ((current_reading - 500) * 6);
	break;
      case 2:
	if (current_reading >= 0 && current_reading <= 100)
	  Billpay = current_reading * 2;
	else if (current_reading > 100 && current_reading <= 200)
	  Billpay = (100 * 1) + ((current_reading - 100) * 4.50);
	else if (current_reading > 200 && current_reading <= 500)
	  Billpay = (100 * 1) + (100 * 2.50) + ((current_reading - 200) * 6);
	else
	  Billpay =
	    (100 * 1) + (100 * 2.50) + (300 * 4) +
	    ((current_reading - 500) * 7);
	break;
      }
    return Billpay;
  }
  void display ()
  {
    System.out.println ("__________________________________");
    System.out.println ("ELCTRICITY Billpay");
    System.out.println ("__________________________________");
    System.out.println ("Consumer Number: " + conno);
    System.out.println ("Consumer Name: " + conname);
    System.out.println ("Consumer Previous Units: " + previous_reading);
    System.out.println ("Consumer Current Units: " + current_reading);
    System.out.println ("Type of EBConection: " + EBContype);
    System.out.println ("___________________________________");
    System.out.println ("Total Amount(Rs.): " + Billpay);
  }
}

class Main
{

  public static void main (String[]args)
  {
    EBBillpay b = new EBBillpay ();
      b.input_data ();
      b.calculate_Billpay ();
      b.display ();
  }
}
