class Bicycle
{
 void displayFeatures()
{
 System.out.println("Features:pedals,MAnual power");
}
}
class Motorbike extends Bicycle
{
 void displayFeatures()
{
 super.displayFeatures();
 System.out.println("Addedfeatures by motorbike:engine");
}
}
class Electricbike extends Motorbike
{
 void displayFeatures()
 {
  super.displayFeatures();
  System.out.println("New Feature by electric bilke:Electric motor and battery");
 }
}
class Transpmul
{
 public static void main(String[]args)
{
 Electricbike myebike=new Electricbike();
 myebike.displayFeatures();
}
}