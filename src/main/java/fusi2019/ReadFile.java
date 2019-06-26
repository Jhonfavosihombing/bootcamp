package fusi2019;
import java.io.File; 
import java.util.Scanner; 
public class ReadFile
{ 
  private static Scanner sc;

public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    File file = new File("E:\\mantap.txt"); 
    sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
  } 
} 
