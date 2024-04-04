import java.util.ArrayList;
public class JavaArrayList{
    public static void main(String[] args){
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            li.add(i);
        }System.out.println(li);
        li.add(11);
        System.out.println(li);
        System.out.println(li.get(0));
        System.out.println(li.indexOf(5));
        System.out.println(li.lastIndexOf(12));
        System.out.println(li.isEmpty());
        li.clear();
        System.out.print(li);
    }
}