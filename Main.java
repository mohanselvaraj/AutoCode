
import java.util.Set;
import java.util.TreeSet;
public class Main {
  public static void main(String[] args) {
  // Write your code here
   String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "JAVA", "C#", "PHP"};
    int count =0;
 Set<String> str1 = new TreeSet<String>();
   for(String str :my_array){
    
     if(!str1.add(str)){
       System.out.println("Duplicate Entry is: "+str);
       count++;
       
     }
      //System.out.println(count);
   }
   
 }
}