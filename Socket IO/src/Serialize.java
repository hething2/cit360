import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize
{
   public static void main(String [] args)
   {
      Employee s = new Employee();
      s.setName("Joop");
      s.setMajor("CIT");
      s.setCell("123456789");
      
      Family f = new Family();
      f.setName("Ethington");
      
      try
      {
        //Serializing Data 
        FileOutputStream fileOut =
              new FileOutputStream("/SomePerson.json");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s);
        out.writeObject(f);
        out.close();
        fileOut.close();
        System.out.print("Data has been transferred to C:");
        
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}