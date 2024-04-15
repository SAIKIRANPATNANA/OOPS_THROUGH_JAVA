import java.util.StringTokenizer;
public class StringTokenization{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("what the fun..!");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }StringTokenizer st1 = new StringTokenizer("What:the:fun..!",":");
        System.out.println(st1.countTokens());
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }StringTokenizer st2 = new StringTokenizer("What:the:fun..!",":",true);
        System.out.println(st2.countTokens());
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        
    }
}