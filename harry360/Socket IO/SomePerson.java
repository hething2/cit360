public class SomePerson implements java.io.Serializable
{
   public String name;
   public String major;
   public String cell;
   public void mailCheck()
   {
      System.out.println("The Person's Information is " + name
                           + " " + major);
   }
}