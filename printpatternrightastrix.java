class printpatternrightastrix
{ 
    public static void rightTriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++)
        {
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++)
            {       
                System.out.print("* ");
            } 
             System.out.println();
        }  
    } 
} 
public class one extends printpatternrightastrix{
    public static void main(String args[]) 
    { 
        int n = 5; 
        printpatternrightastrix o=new printpatternrightastrix();
        o.rightTriangle(n); 
    } }
