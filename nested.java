import java.util.*;
class nested
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the favourite vegetable");
 String veg=sc.nextLine();
 if(veg.equals("indica"))
 {
  System.out.println("u entered a good one");
  System.out.println("enter"+veg+"scientific_name");
  String scientific_name=sc.nextLine();
 }
 if(scientific_name.equals("indica"))
 {
  System.out.println("you are intelligent");
 }
 else
 {
  System.out.println("veg");
 }
 sc.close();
}
}

