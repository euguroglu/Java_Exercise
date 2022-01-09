import java.util.*;

//Write sort function to sort elements in a list
public class main2 {

    public void sorting(List mylist){
        Collections.sort(mylist);
        System.out.println(mylist);
    }


    public static void main(String args[]){

        main2 main = new main2();
        List mylist = new ArrayList();
        mylist = Arrays.asList("A", "C", "B");
        main.sorting(mylist);

    }
}
