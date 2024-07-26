class TestBasicRules{
private int data;//instance variable
private static int count;//static/class variable
public static void main(String[] args){
int num1=100;
System.out.println("Num1="+num1);
TestBasicRules t1=new TestBasicRules();
System.out.println("Data="+t1.data);
System.out.println("Count="+count);
TestBasicRules t2=new TestBasicRules();
System.out.println("Data="+t2.data);
System.out.println("Count="+count);
String s=new String("Hello");
//s++;//Java doesnot support pointer Arithmetic
}
}