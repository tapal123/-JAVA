import java.util.*;

public class Collections {
    void arrayListFunction(){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        
        
        
arr.add(0,99);
arr.add(100);
arr.set(1, 898);
Iterator<Integer>itr=arr.iterator();
        while(itr.hasNext()){
          
            System.out.println(itr.next()+"   ");
        }

       System.out.println("checking element present or not     "+arr.contains(100));
       arr.remove(1);// removing through index
       System.out.println(arr);
       arr.remove(Integer.valueOf(100));  //removing by value
       System.out.println(arr);

       for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i));
       }

arr.set(0, 77); //updating the value
       arr.clear();
       System.out.println(arr);
    }
   


    void stackFunction(){
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()+"  is the peak and top element");

         
        stack.pop();
        System.out.println("after popoing  "+stack);


    }

void queueFunction(){
    Queue<Integer> queue=new LinkedList<>();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    System.out.println(queue.peek());
    queue.poll();  //removes element from front

    System.out.println("after removig front element   "+queue);
}

void priorityQueueFunction(){
    Queue<Integer> pq =new PriorityQueue<>();
    pq.offer(40);
    pq.offer(12);
    pq.offer(24);
    pq.offer(36);
    System.out.println(pq);
    System.out.println("top element is " +pq.peek());
    pq.poll();
    System.out.println(pq);
}


void arrayDeque(){
    ArrayDeque<Integer>deque=new ArrayDeque<>();
    deque.offerFirst(1);
    deque.offerFirst(2);
    deque.offerFirst(3);
    deque.offerLast(29);
    System.out.println(deque);
    deque.pollFirst();
    System.out.println("after removing from first element "+deque);
    deque.offer(34);
    deque.offer(44);
    deque.pollLast();
    System.out.println(deque);
    
}


void setFunction(){
    // Set<Integer> set=new TreeSet<>();     // Hashset insert the element randomly in disorder
                                          // LinkedHashSet insert element order as we insert
                                          // TreeSet insert the element in sorted order                                      // above three sets dont allow duplicates 
    // set.add(1);
    // set.add(2);
    // set.add(1);    set.add(9); set.add(3);   set.add(4);   set.add(3);

    // System.out.println(set.contains(99));
    // set.remove(1); //we have functions same as ArrayList like contains e.t.c
    // System.out.println(set);
    // for(Integer i:set){
    //     System.out.println(i);
    // }



Set<String> set=new TreeSet<>();
set.add("tapal");
set.add("ramesh");
set.add("ratish");  
set.add("rateesh");
set.add("junaid");
for(String i:set){
    System.out.println(i);
}


}

void mapFunction(){
    Map<Integer,String> map=new TreeMap<>();
    map.put(1,"tapal" );
    map.put(33, "fyugf");
    map.putIfAbsent(2, "junaid");
    map.putIfAbsent(1, "cool");
    for(Integer i:map.keySet()){
        System.out.println(map.get(i));
    }
    
if(!map.containsKey(10)){
    System.out.println("not there so we aare inserting now");
    map.put(10, "sjhbvhvj");
}
else{
    System.out.println("already there");
}

System.out.println(map);
}

    public static void main(String[] args) {
        Collections obj =new Collections();
        // obj.arrayListFunction();
        // obj.stackFunction();
        obj.queueFunction();
        // obj.priorityQueueFunction();
        //  obj.setFunction();
        // obj.arrayDeque();
        // obj.mapFunction();

       
    }

}
