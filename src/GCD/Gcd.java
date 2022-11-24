package GCD;

public class Gcd {//Greatest common factor
    int gcd(int a,int b){
        if (b==0){
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Gcd gcd=new Gcd();
        int a=6;
        int b=12;
        System.out.println(gcd.gcd(a,b));

    }
}
