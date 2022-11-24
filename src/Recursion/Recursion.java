package Recursion;

public class Recursion {
    int value(int x){
        if(x==1){
            return 1;//base case
        }
        else{
            return x* value(x-1);
        }
    }
    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        int n=5;
        System.out.printf("%d! = %d",n, recursion.value(n));
    }
}
