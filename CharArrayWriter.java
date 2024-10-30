import java.io.CharArrayWriter;
import java.io.FileWriter;
class CharArrayWriterExample{
public static void main(String args[])throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome to this training");
FileWriter f1=new FileWriter("c:\\fh\\abc.txt");
out.writeTo(f1);
f1.close();
System.out.println("Success....");
}
}
