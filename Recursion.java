public class Recursion{
   //part1: factorial non-recursion
   
   
   
   //part2: factorial recursion
   
   
   
   //part3: fibonacci sequence non-recursion
   
   
   
   //part4: fibonacci sequence recursion


}
public class recursion{

    public static void rec(int n){
    
        System.out.println(n);
        if(n == 1){
    
    return;
    
        }
        rec(n-1);
        System.ou.println(n);
    }
    
    public static int factorial(int n){
    if(n ==1 || n == 0){
        return 1;
    }
    return n * factorial(n - 1);
    }
    
    public static void main(String[] args){
    
        int n = 3;                                                     
        rec(n); 
    
    }
    }
