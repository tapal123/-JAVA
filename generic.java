 class A<T>{
    T value;
    A(T value){
        this.value=value;
    }
    public T getFunc(){
return value;
    }

}
public class generic{
    public static void main(String[] args) {
        A<String>obj=new A<String>("i am generic class");
        System.out.println(obj.getFunc());
        A<Integer>obj2=new A<Integer>(45);
       System.out.print( obj2.getFunc());
   
    }
    }
    

