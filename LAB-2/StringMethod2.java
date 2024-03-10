
public class StringMethod2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello world");
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        sb.insert(0,"Love");
        System.out.println(sb.toString());
        sb.append("you");
        System.out.println(sb.toString());
        sb.delete(0,4);
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        sb.reverse();
        System.out.println(sb);
        sb.replace(1,2,"a");
        System.out.println(sb);
        sb.replace(1,3,"b");
        System.out.println(sb);


    }
    
}
