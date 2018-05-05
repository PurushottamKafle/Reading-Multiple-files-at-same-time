package pksoft;  
  
import java.io.*;    
public class first{    
  public static void main(String args[])throws Exception{    
   FileInputStream fis1=new FileInputStream("F://pksoft/first.txt");    
   FileInputStream fis2=new FileInputStream("F://pksoft/first2.txt");    
   FileOutputStream fos=new FileOutputStream("F://pksoft/second.txt");      
   SequenceInputStream sis=new SequenceInputStream(fis1,fis2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fos.write(i);        
   }    
   sis.close();    
   fos.close();      
   fis1.close();      
   fis2.close();       
   System.out.println("Success..");  
  }    
}    
