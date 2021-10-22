import java.io.*;
import java.util.*;
public class filedemo {
    public static void main(String[] args)
    {
        String filename;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file:");
        filename = sc.nextLine();
        File f1 = new File(filename);
        System.out.println("FILE INFORMATION");
        System.out.println("The name of the file is:"+f1.getName());
        System.out.println("The path name of the file is:"+f1.getPath());
        System.out.println("Parent"+f1.getParent());
        if(f1.exists())
        {
            System.out.println("The file exists");
        }
        else
        {
            System.out.println("The file doesnt exist");
        }
        if(f1.canRead())
        {
            System.out.println("The file can be read");
        }
        else
        {
            System.out.println("The file cannot be read");
        }
        if(f1.canWrite())
        {
            System.out.println("The file operation is permitted");
        }
        else
        {
            System.out.println("The file operation is not permitted");
        }
        if(f1.isDirectory())
        {
            System.out.println("The file is a directory");
        }
        else
        {
            System.out.println("The file is not a directory");
        }
        if(f1.isFile())
        {
            System.out.println("It is a file");
        }
        else
        {
            
            System.out.println("It is not a file");
        }
        System.out.println("File Last modified information"+f1.lastModified());
        System.out.println("File size"+f1.length());
        System.out.println("File deleted"+f1.delete());
    }
    
}
