import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.util.Scanner;
class CharArrayWriterExample{
public static void main(String args[])throws Exception{
Scanner sc=new Scanner(System.in);
CharArrayWriter out=new CharArrayWriter();
out.write(sc.nextLine());
FileWriter f1=new FileWriter("c:\\fh\\a.txt");
out.writeTo(f1);
f1.close();
System.out.println("Success....");
}
}
