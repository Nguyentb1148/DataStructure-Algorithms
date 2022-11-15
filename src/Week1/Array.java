package Week1;


import java.util.Random;
import java.util.Scanner;

public class Array {
    public  static Scanner sc =new Scanner(System.in);
    int A[]=new int[]{1,2,3,4,5,6,7,8,9,10};// define A with 10 elements
    void Nhap(int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ",i);
            A[i]=sc.nextInt();//Input data to array
        }
    }
    void NhapRandom(int n){
        Random rd=new Random();
        for (int i = 0; i < n; i++) {
           A[i]=rd.nextInt(1,9);
        }
    }
    void In(int n){//n elements
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
    }

    //sum all elements
    int Sum(int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+A[i];
        }
        return sum;
    }

    // sum odd number
    int SumOdd(int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (A[i]%2==1){
                sum=sum+A[i];
            }
        }
        return sum;
    }

    //Average even number
    float AverageEvenNumber(int n){
        int sum=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (A[i]%2==0){
                sum=sum+A[i];
                count++;
            }
        }
        if (count==0){
            return 0;
        }
        else {
            float average = sum / count;
            return average;
        }
    }

    void Insert(int x, int y,int n){
        n++;
        for (int i = n-1; i >y ; i--) {
            A[i]=A[i-1];
            A[y]=x;
        }
    }
    void Remove(int y,int n){
        for (int i = y; i <n ; i++) {
            A[i]=A[i+1];
            n--;
        }
    }
    void Soft(int n){
        for (int i = 0; i <n; i++) {
            for (int j = n-1; j >i; j--) {
                if (A[j]<A[j-1]){
                    int t =A[j];
                    A[j]=A[j-1];
                    A[j-1]=t;
                }
            }
        }
    }
    void Search(int n,int x){
        int count=-1;
        for (int i = 0; i < n; i++) {
            if (A[i]==x){
                count=i;
            }
        }
        if (count==-1){
            System.out.printf("Not found");
        }
        else {
            System.out.printf(" x=%d  place: %d", x, count);
        }
    }
    public static void main(String[] args) {
        Array arr=new Array();
        int n=10;
        arr.NhapRandom(n);
        arr.In(n);
        arr.Search(n,5);
    }
}
