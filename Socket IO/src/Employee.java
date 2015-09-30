public class Employee implements java.io.Serializable
{
   private String name;
   private String major;
   private String cell;
   public void mailCheck()
   {
      System.out.println("The Person's Information is " + name
                           + " " + major);
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public String getCell() {
	return cell;
}
public void setCell(String cell) {
	this.cell = cell;
}
   
}