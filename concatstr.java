 class concatstr
{
 public static void main(String[] args)
{
 String str1="hrllo";
 String str2=new String(str1);
 System.out.println("string1 is:"+str1);
 System.out.println("string2is:"+str2);
 str2=str1.concat("world");
 System.out.println("string1 is:"+str1);
 System.out.println("modified string is"+str2);
}
}