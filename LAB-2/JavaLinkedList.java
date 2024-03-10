import java.util.LinkedList;
public class JavaLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> li = new LinkedList<Integer>();
        for(int i=1; i<=10; i++){
            li.add(i);
        }System.out.println(li);
        li.add(11);
        System.out.println(li);
        System.out.println(li.get(1));
        li.remove(1);
        System.out.println(li);
        System.out.println(li.isEmpty());
        System.out.println(li.size());
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        System.out.println(li);
        System.out.println(li.indexOf(1));
        System.out.println(li.lastIndexOf(12));
    }
}