class shape
{
public int x,y;
void printarea()
{
System.out.println("prints area of shape");
}
}
class rectangle extends shape
{
void printarea()
{
System.out.println("area of rectangle is"+x*y);
}
}
public class override
{
public static void main(String[]args)
{
rectangle r=new rectangle();
r.x=10;
r.y=20;
r.printarea();
}
}