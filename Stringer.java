

public class Stringer {
 
    public static void main(String[] args) {
        String s1 = "Bhavesh";
        
        String s2 = "Bhavesh";
        if(s1==s2){
            System.out.println("s1 s2 == are equal");
        }
        else{
            System.out.println("s1 s2== not equal");
        }
        if(s1.equals(s2)){
            System.out.println("s1 s2 Equals are equal");
        }
        else{
            System.out.println("s1 s2 Equals not equal");
        }

        String a1 = new String("Original");
        String a2 = new String("Original");
        a1 = "Purana";
        System.out.println(a1);
        if(a1==a2){
            System.out.println("a1 a2 == original Equal");
        }
        else{
            System.out.println("a1 a2 == Original Not Equal");
        }
        if(a1.equals(a2)){
            System.out.println("a1 a2 Equals original Equal");
        }
        else{
            System.out.println("a1 a2 Equals Original Not Equal");
        }

        int num1 = 10;
         num1 = 15;
         System.out.println(s1);
         System.out.println(num1);
         System.out.println(s2);
    }
}
