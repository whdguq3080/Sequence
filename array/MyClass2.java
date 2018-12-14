package array; 
  
 
  import java.util.Scanner;
import java.util.Stack; 
  
 
  public class MyClass2 { 
  	public static void main(String[] args) { 
  		String[] vivace = {"은지","서우","지우","창준","현일"}; 
          String[] royal = {"창하","수호","은영","정욱",""}; 
          String[] atlas = {"동준","이레","종협","지은",""}; 
          String[] ntom = {"정우","기호","승아","태혁",""}; 
          String[] res = new String[4];
          System.out.println("조장은?");
          String[][] a = {vivace,royal,atlas,ntom};
          
          for(int i=0; i<a.length; i++) {
        	  for(int j=0; j<1; j++) {
        		 res[i] =a[i][j]; 
          }
          }
          
        	  for(int i=0; i<4; i++) {
        	  System.out.println(res[i]+"");
        	  }
          
  	} 
  } 
