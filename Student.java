public class Student
{
  int studentrollno;
  String studentname;
  void insertRecord (int r, String n)
  {
    studentrollno = r;
    studentname = n;
  }
  void displayInformation ()
  {
    System.out.println (studentrollno + " " + studentname);
  }

  public static void main (String args[])
  {
    Student s1 = new Student ();
    Student s2 = new Student ();
    s1.insertRecord (100, "teech");
    s2.insertRecord (200, "teach");
    s1.displayInformation ();
    s2.displayInformation ();
  }
}
