import java.util.Scanner;
class compare
{
 public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("entrn your subject");
 String subj=sc.next();
 String sch=new String("python");
 if(subj.equalsIgnoreCase("java"))
 {    
 System.out.println("patience is needed");  
 }
  else
  {
  System.out.println("domt watse time");
  }
 if(sch.equals("python"))
 {
 System.out.println("great");
}
}
}