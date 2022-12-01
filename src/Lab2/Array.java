package Lab2;

import java.util.Scanner;

public class Array {
    public  static Scanner sc =new Scanner(System.in);
    int array[]=new int[100];
        void add(int n){
            for (int i = 0; i < n; i++) {
                System.out.printf("array[%d] = ",i);
                array[i]=sc.nextInt();
            }
        }
        void print(int n){
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]+" ");
            }
        }
        void insert(int x,int p,int n){
            for (int i = n; i >p-1 ; i--) {
                array[i]=array[i-1];
            }
            array[p-1]=x;
        }
        void remove(int m, int n){
            for (int i = m-1; i < n; i++) {
                array[i]=array[i+1];
            }

        }
        void search(int x,int n){
            int position=-1;
            for (int i = 0; i < n; i++) {
                if (array[i]==x){
                    position=i+1;
                }
            }
            if (position==-1){
                System.out.println("Not found!!!");
            }
            else {
                System.out.printf("%d :place %d",x,position);
            }
        }
    public static void main(String[] args) {
        Array array1=new Array();
        int n=5;
        array1.add(n);
        array1.print(n);
        array1.insert(5,2,n);
        System.out.println("\nAfter add 5 in position 2: ");
        array1.print(n+1);
        array1.remove(2,n);
        System.out.println("\nAfter remove position 2: ");
        array1.print(n);
        System.out.println();
        array1.search(4,n);

    }
}
