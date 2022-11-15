package Week1;

public class PT {

//    public  static Scanner sc =new Scanner(System.in);
    public  static void PBT1(int a,int b){//ax+b=0
        if (a==0){
            if (b==0){
                System.out.printf("Phuong trinh vo so nghiem");
            }
            else {
                System.out.printf("Phuong trinh vo nghiem");
            }
        }
        else {
            System.out.printf("Phuong trinh cos 1 nghiem: x= "+ ((float)-b/a));
        }
    }

    public static void PBT2(int a,int b,int c){//ax2+bx+c=0
        if (a==0) {
            PBT1(b,c);}
        else {
            float d=b*b-4*a*c;
            if (d>0){
                System.out.printf("Phuong trinh co 2 nghiem la : x1= "+ (-b+Math.sqrt(d))/(2*a) + " x2= "+(-b-Math.sqrt(d))/(2*a));
            } else if (d==0) {
                System.out.printf("Phuong trinh co nghiem la : x= "+ ((float)-b/2*a));
            } else {
                System.out.printf("Phuong trinh vo nghiem");}
        }
    }
    
    public static  long Fact(int n){//n!(5!=120)
        long m=1;
        if (n==0 ||n==1){
            return m;
        }
        else {
            for (int i = 2; i <= n ; i++) {
                m*=i;
            }
            return m;
        }
    }
    
    public static int Sum(int n){//sum 123=6,237=12
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum ;
    }
    
    public static void main(String[] args) {
        int n=237;
        System.out.printf("%d = %d",n, Sum(n) );
    }
}
