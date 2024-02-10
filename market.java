import java.util.ArrayDeque;
 
public class market
{
    public static void main(String[] args) {
        
          
     
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        int count = 0;
        
        people.add(new Person("Vasya"));
        people.addLast(new Person("Boris"));
        System.out.printf("Queue size: %s \n", count);
        
        
        for(Person p : people){
            System.out.println("new person in queue");
            System.out.println(p.getName());
            count = count + 1;
            System.out.printf("Queue size: %s \n", count);
            
           
        }
        System.out.println("NEXT!!");
        people.remove();
        
       
        for(Person p : people){
          
            System.out.println(p.getName());
            count = count - 1;
            System.out.printf("Queue size: %s \n", count);
           
        }
        
        
    }
}
class Person{
      
    private String name;
    public Person(String value){
          
        name=value;
    }
    String getName(){return name;}
}