package Binary;

public class Binary {
    void convert(int n){
        if (n>0){
            convert(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        Binary binary=new Binary();
        int n=16;
        System.out.printf(" int -> binary: %d -> ",n);
        binary.convert(n);
    }
}
