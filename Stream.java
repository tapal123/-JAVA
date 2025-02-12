import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.*;
public class Stream{
    public static void main(String[] args) {
        List<Integer>lst=Arrays.asList(1,2,3,4,5,6,7,8,6,7,6,6,6,8,8);
   Set<Integer> StreamList= lst.stream().filter((Integer n)->n%2==0).collect(Collectors.toSet());
   System.out.println(StreamList);

   List<Integer>mapList=lst.stream().map((Integer n)->n+10).collect(Collectors.toList());
System.out.println(mapList);
long totalEvenNumbers=lst.stream().filter((n)->n%2==0).count();
System.out.println(totalEvenNumbers);

List<Integer>sortedList=lst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(sortedList);

List<Integer>lst2=new ArrayList<>();
lst2.add(1);
lst2.add(2);
lst2.add(3);
lst2.add(41);
lst2.add(1);
lst2.add(2);
lst2.add(31);
lst2.add(14);
lst2.add(1);

List<Integer>distinctVal=lst2.stream().distinct().collect(Collectors.toList());
System.out.println(distinctVal);

List<String>lst3=Arrays.asList("tapal","junaid","jailani","Salam","Reshma","imrana","ruksana");
System.out.println(lst3.stream().filter((String s)-> s.endsWith("a")).sorted().collect(Collectors.toList()));

System.out.println("now working with ArrayStream");
int []arr=  {1,2,3,4,5,6,7,8,9,10};
//List<String>lts4=Arrays.asList("tapal","junaid","sohel","asad","ahad","khayyum","jaheer","iliyas","Ayaz","novman");
// long ccnt=lts4.stream().filter((String s)-> s.length()>5).sorted(Comparator.reverseOrder()).count();
// System.out.println(ccnt);

IntStream intStreamObj=Arrays.stream(arr);
double res =intStreamObj.filter((int n)-> n%2==0)
            .peek(n-> System.out.println("peeked  "+n))
            .sorted()
            .average()
            .getAsDouble();
            
System.out.println(res);


System.out.println("now worling with limit and skip functions");
List<Integer>lst5=new ArrayList<>();
for(int i=40;i<=100;i++){
    lst5.add(i);
}

System.out.println("now working with the terminal operators");
List<Integer>temp=lst5.stream().filter((Integer a)->a%2==0).sorted().skip(2).limit(5).collect(Collectors.toList());
System.out.println(temp);
System.out.println("For each method");
int arr3[]={2,3,1,4};
Arrays.stream(arr3).filter((int n)->n%2==1)
                    .sorted()
                    .forEach(n ->System.out.println(n));

IntStream reduceObj=Arrays.stream(arr3);
OptionalInt g=reduceObj.reduce((int a,int b)->a+b);
System.out.println(g);

Optional<Integer>reduceObj2Optional=lst2.stream().reduce((a,b)->a+b);
System.out.println("reduced value is "+ reduceObj2Optional.get());

List<Integer>lstToArray=Arrays.asList(1,2,13,4,5,6,6,7,8,8,9,0,76);
Object[] arrayObjFromList=lstToArray.stream().filter((n)->n%2==1).sorted(Comparator.reverseOrder()).toArray();
for(Object i:arrayObjFromList){System.out.println(i);}

System.out.println("finding max and min");
List<Integer>NormalList=new ArrayList<>();
for(int i=0;i<10;i++){
    NormalList.add(i);
}
Optional<Integer>minVal=NormalList.stream().min((a,b)->a-b);
System.out.println("minimum vlaue  is "+minVal.get());
System.out.println(NormalList.stream().max((a,b)->a-b).get());



System.out.println("working with ANYMATCH ALLMATCH NONE MATCH");
System.out.println("Any Match "+Arrays.asList(1,4,3,5,6,3,2,44,56,67).stream().anyMatch(n->n==3));
System.out.println("All Match "+Arrays.asList(1,4,3,5,6,3,2,44,56,67).stream().allMatch(n->n==3));
System.out.println("NoneMatch Match "+Arrays.asList(1,4,3,5,6,3,2,44,56,67).stream().noneMatch(n->n==3));
System.out.println("FindFirstElement "+Arrays.asList(1,4,3,5,6,3,2,44,56,67).stream().findFirst());
System.out.println("Find Any from Array or list "+Arrays.asList(1,4,3,5,6,3,2,44,56,67).stream().findAny());


    }


}