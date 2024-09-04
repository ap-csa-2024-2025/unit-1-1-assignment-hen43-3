public class HelloWorld
{
  public static void main(String[] args)
  {
    String name = "Quingledorf";
   
    int mcChickens = 5;
    String drinkSize = "Large";
    boolean isSoda = true;


    if ((mcChickens > 2) || (drinkSize == "Large" && isSoda)) {
      System.out.println("hey " + name + ", u smelly!!");
    } else {
      System.out.println("u not smelly" + name);
    }
  }
}
