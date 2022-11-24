package Recursion;

public class Fibonacci {
    int fibo(int n){
        if(n<=2){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
    void print(int n){
        System.out.printf("the fibonacci sequence %d: ",n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        int n=9;
        fibonacci.print(n);
    }
}
