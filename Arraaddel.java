import java.util.ArrayList;
public class Arraaddel
{
public static void main(String[]args)
{
ArrayList<Integer>ab=new ArrayList<Integer>();
ab.add(7);
ab.add(2);
ab.add(3);
ab.add(4);
ab.add(6);
ab.add(9);
 

System.out.println(ab.size());
ab.add(2,8);
System.out.println(ab);
}
}
