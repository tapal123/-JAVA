import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        String s1="tapal";
        String s2="tapal";
        String s3=new String("tapal");
        System.out.println(s1==s2);
        System.out.println(s1==s3); //here s1 and s2 pointing to same address but s1 and s3 is diffeent address so false


       System.out.println(s1);
       System.out.println(s3);
       System.out.println(s1.toLowerCase()+"  "+s1.toUpperCase()+"  "+ s1.replace("pal", "kal")+"  "+s1.substring(0,3)+"   "+s1.endsWith("al"));

       String s5="";
       Scanner sc=new Scanner(System.in);
      for(int i=0;i<4;i++){
        String t=sc.nextLine();
        s5+=t+"  ";
      }
      sc.close();
      System.out.println(s5);
    }
}