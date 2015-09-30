public class Family implements java.io.Serializable
{
   private String name;
   public void mailCheck()
   {
      System.out.println("The Person's Information is " + name);
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}