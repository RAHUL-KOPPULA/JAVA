interface flight
{
void fly();
}
interface strength
{
void superstrength();
}
class superhero implements flight,strength
{
String name;
public superhero(String name)
{
this.name=name;
} 
@Override
public void fly() 
{
System.out.println(name+"flighes thrpough the sky");
}
@Override
public void superstrength()
{
System.out.println(name+"demonstrates superstrength!");
}
public void useability()
{
System.out.println(name+"use super abilities!");
}
}
public class multipleinh
{
public static void main(String[]args)
{
superhero superman=new superhero("superman");
superman.useability();
superman.fly();
superman.superstrength();
}
}