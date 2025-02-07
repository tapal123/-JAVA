class Mythread extends Thread{
public void run(){
    Thread t=new Thread();
    for(int i=0;i<5;i++){
        System.out.println("thread  "+i);
        System.out.println("name of threadf is "+t.getName());
        System.out.println("thread name is" +t.getName());
        try{Thread.sleep(1000);}
        catch(Exception e){}
    }
}
}

public class Multithreading {

    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
    
        t1.start();
       
        try{
            t1.join();
        }
        catch(Exception e){}
        
        t2.start();


    }
}