package teach;

public class rectanglearea
{
  
int length;
   
int breath;
   
void insert (int l, int b)
  {
    
length = l;
    
breath = b;
  
} 
void CalculateArea ()
  {
    System.out.println (length * breath);
  } 
public static void main (String args[])
  {
    
rectanglearea r1 = new rectanglearea ();
    
rectanglearea r2 = new rectanglearea ();
    
r1.insert (201, 99);
    
r2.insert (313, 185);
    
r1.CalculateArea ();
    
r2.CalculateArea ();

} 
}

