package java0;
class Caaa
 {
 private int num;

 public void display()
 {
 System.out.println("printed from Caaa class");
 }
 }
 class Cbbb extends Caaa
 {
 public void display()
 {
 System.out.println("printed from Cbbb class");
 }
 }
 public class java09
 {
 public static void main(String args[])
 {
 Caaa bb=new Cbbb();
 bb.display();
 }
 }