public class StringConversions {
    public static void main(String[] args){
        String str = "Sai";
        StringBuffer bfr = new StringBuffer(str);
        StringBuilder blr = new StringBuilder(str);
        System.out.println(str);
        System.out.println(bfr);
        System.out.println(blr);
        String sbfr = bfr.toString();
        String str1 = sbfr;
        String str2 = new String(str1);
        System.out.println(str1);
        System.out.println(str2);
        StringBuffer nsbfr = new StringBuffer(blr.toString());
        StringBuilder nsblr = new StringBuilder(bfr.toString());
        System.out.println(nsbfr);
        System.out.println(nsblr);
    }
}
