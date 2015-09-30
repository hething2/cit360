import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialize
{
   public static void main(String [] args)
   {
      Employee s = null;
      Family f = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("/SomePerson.html");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         s = (Employee) in.readObject();
         f = (Family) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("SomePerson class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Person Information:");
      System.out.println("Name: " + s.getName());
      System.out.println("major: " + s.getMajor());
      System.out.println("Cell: " + s.getCell());
      System.out.println("Name: " + f.getName());
    }
}