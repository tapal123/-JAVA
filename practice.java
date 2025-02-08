
// class A extends Thread{
//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
               
//                 e.printStackTrace();
//             }
//             System.out.println(i);
//         }
//     }
// }
// class B extends Thread{
//     @Override 
//     public void run(){
       
//         for(int i=5;i<10;i++){
//             try {
//                 Thread.sleep(750);
//             } catch (InterruptedException e) {
         
//                 e.printStackTrace();
//             }
//             System.out.println(i);
//         }
//     }
// }



// class C implements Runnable{
//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
             
//                 e.printStackTrace();
//             }
//             System.out.println("hi");
//         }
//     }
// }

// class D implements Runnable{
//     @Override
//     public void run(){
//         for(int i=0;i<5;i++){
//             try {
//                 Thread.sleep(250);
//             } catch (InterruptedException e) {
              
//                 e.printStackTrace();
//             }
//             System.out.println("hello");
//         }
//     }
// }

// public class practice{
//     public static void main(String[] args) {
//         A t1=new A();
//         B t2=new B();
//         C interfaceObj=new C();
//         D interfaceObj2=new D();
//         Thread t3=new Thread(interfaceObj);
//         Thread t4= new Thread(interfaceObj2);

//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//     }
// }



//2ND Topic(Threads,Runnable applying in Lambda function and anonymus function)


interface A {
    public abstract void fun(int a,int b);
}

public class practice{
    public static void main(String[] args) {


        Runnable threadObjForRunnableClass=()->{
       
        
            for(int i=0;i<5;i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                   
                    e.printStackTrace();
                }
                System.out.println(i);
            }
         
        };
        Thread t1=new Thread(threadObjForRunnableClass);
        t1.start();


        Runnable threadObjForRunnableClass2=new Runnable() {
            @Override
            public void run(){
                for(int i=5;i<10;i++){
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                    
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
             
            }
        };
            Thread t2=new Thread(threadObjForRunnableClass2);
            t2.start(); 



        A functIonalinterfaceObj=new A(){
            @Override
            public void fun(int a,int b){
                System.out.println(a+b);
            }
             
        };
        functIonalinterfaceObj.fun(2, 4);

        A functInterfaceOnj2Lambda=(a,b)->{
System.out.println(a/b);
        };
        functInterfaceOnj2Lambda.fun(25, 5);
    }



}