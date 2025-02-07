import java.util.Scanner;
class AgeIsInvalid extends Exception{
    AgeIsInvalid(String s){
        super(s);  //here super class is Exception class
    }
}
class Xecption {

    public static void fun(int n1,int n2) throws Exception{
       
        int res=n1/n2;
        System.out.println(res);

    }
    public static void main(String[] args) {
      Xecption obj=new Xecption();
        int arr[]=new int[5];
        try{
            int num=arr[6];
            int a=2;
            int b=0;
            int dd=a/b;

        }
        catch(Exception e){
System.out.println("error ="+e);
        }
        finally{
            System.out.println("terminated and finally ececuted");
        }
  
try{
   fun(3,0);                       //THROWS --->Keyword 

}
catch(Exception e){
    System.out.println("error = "+e);
}


 try {       //CUSTOM EXception'
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age ");
    age=sc.nextInt();
    if (age<18) {
        throw new AgeIsInvalid("Age is invalid and age must be greater than 18");
    }
 }
 catch(Exception e){
System.out.println(e);
 }

    }
}
