package ArrayList;

import java.util.ArrayList;
public class ArrList {
    ArrayList<Integer> arrayList=new ArrayList();
    ArrayList<String> Sdsv=new ArrayList();
    public static void main(String[] args) {
        ArrList arrList=new ArrList();
        arrList.Sdsv.add("A B C");
        arrList.Sdsv.add("X Y Z");
        for (String x:arrList.Sdsv){
            System.out.printf("%s \n",x);
        }
    }
}
