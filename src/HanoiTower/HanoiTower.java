package HanoiTower;

public class HanoiTower {

    void hanoiTower(int n,char a,char b,char c){//move n disk forn a-> b
        //1:
//        if (n==0){
//            return;//base case
//        }
//        hanoiTower(n-1,a,c,b);
//        System.out.println("Move disk "+n+" from "+a+" to "+ b);
//        hanoiTower(n-1,c,b,a);
        //2:
        if (n==1){//only 1 disk
            System.out.println("\n Move form " +a+" to "+b);//base case
        }
        else {
            hanoiTower(n-1,a,c,b);//1. ring n-1 disks form A-> C
            System.out.println("\n Move form " +a+" to "+b);//2.Bring 1 disk
            hanoiTower(n-1,c,b,a);//3.Bring back n-1 disks form c->b
             }
    }
    public static void main(String[] args) {
        int n=3;
        HanoiTower hanoiTower=new HanoiTower();
        hanoiTower.hanoiTower(n,'A','C','B');//A :Start,C: end,B:intermediary
    }
}
