class superhero
{
 String name;
 String power;
 public superhero(String name,String power)
{
 this.name=name;
 this.power=power;
}
public void usepower()
{
 System.out.println(name+"uses"+power);
}
}
class ironman extends superhero
{
 public ironman(String name)
{
 super(name,"advanceed technology");
}
}
class spiderman extends superhero
{
 public spiderman(String name)
{
 super(name,"web slinging spiderman-like abilities");
}
}
public class hierarchial
{
 public static void main(String args[])
{
 ironman iman=new ironman("ironman");
 spiderman spd=new spiderman("spiderman");
iman.usepower();
spd.usepower();
}
}