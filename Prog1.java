import java.util.Scanner;
class Prog1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
try{

int n3=(int)n1/n2;
System.out.println(n1+"/"+n2+"="+n3);
}
catch(Exception e){
System.out.println("We learnt Exception");
}
finally{

System.out.println("finally block executed");
}
System.out.println("Thank you");
}
}