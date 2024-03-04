import java.util.Scanner;
public class JKSirStringsTask {
    static String ones_case(String digit) {
        switch (digit) {
            case "1":
                return "One";
            case "2":
                return "Two";
            case "3":
                return "Three";
            case "4":
                return "Four";
            case "5":
                return "Five";
            case "6":
                return "Six";
            case "7":
                return "Seven";
            case "8":
                return "Eight";
            case "9":
                return "Nine";
        }return "Zero";
    }static String tens_case(String num) {
        switch(num){
            case "10":
                return "Ten";
            case "11":
                return "Eleven";
            case "12":
                return "Twelve";
            case "13":
                return "Thirteen";
            case "14":
                return "Fourteen";
            case "15":
                return "Fifteen";
            case "16":
                return "Sixteen";
            case "17":
                return "Seventeen";
            case "18":
                return "Eighteen";
            case "19":
                return "Nineteen";
            case "2":
                return "Twenty";
            case "3":
                return "Thirty";
            case "4":
                return "Forty";
            case "5":
                return "Fifty";
            case "6":
                return "Sixty";
            case "7":
                return "Seventy";
            case "8":
                return "Eighty";
            case "9":
                return "Ninty";
            }return "";
        }static String findNumberInWords(String num){
            String ans = "";
            int i = 0;
            if(Integer.parseInt(num)==0) {
                return "Zero";
            }if(num.length()>=9) {
                if(num.charAt(i)!='0') {
                    ans += tens_case(num.substring(i,i+1)) + " ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=8) {
                if(num.charAt(i)!='0'  && i-1>=0 && num.charAt(i-1)=='1') {
                    ans += tens_case(num.substring(i-1,i+1)) + " Crore ";
                }else if(num.charAt(i)!='0'){
                    ans += ones_case(num.substring(i,i+1)) + " Crore ";
                }if(i-1>=0 && num.charAt(i-1)!='0' && num.charAt(i)=='0') {
                    ans += " Crore ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=7) {
                if(num.charAt(i)!='0') {
                     ans += tens_case(num.substring(i,i+1)) + " ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=6){
                if(num.charAt(i)!='0' && i-1>=0 && num.charAt(i-1)=='1') {
                    ans += tens_case(num.substring(i-1,i+1)) + " Lakh ";
                }else if(num.charAt(i)!='0') {
                    ans += ones_case(num.substring(i,i+1)) + " Lakh ";
                }if(i-1>=0 && num.charAt(i-1)!='0' && num.charAt(i)=='0') {
                    ans += " Lakh ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=5 ) {
                if(num.charAt(i)!='0') {
                    ans += tens_case(num.substring(i,i+1)) + " ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=4) {
                if(num.charAt(i)!='0' && i-1>=0 && num.charAt(i-1)=='1') {
                    ans += tens_case(num.substring(i-1,i+1)) + " Thousand ";
                }else if(num.charAt(i)!='0') {
                    ans += ones_case(num.substring(i,i+1)) + " Thousand ";
                }if(i-1>=0 && num.charAt(i-1)!='0'  && num.charAt(i)=='0') {
                    ans += " Thousand ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=3) {
                if(num.charAt(i)!='0') {
                    ans += ones_case(num.substring(i,i+1)) + " Hundred ";
                }else {
                    ans += "";
                }i++;
            }if(num.length()>=2) {
                if(num.substring(i,i+1).equals("1")){
                    ans +=   tens_case(num.substring(i,i+1)+num.substring(i+1,i+2));
                }else {
                    ans +=   tens_case(num.substring(i,i+1)) +" "+ ones_case(num.substring(i+1,i+2));
                }
            }return ans;
    }public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String digits[] = str.split(",");
        str = "";
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }for(int i=0; i<digits.length; i++){
            if(array[i]==0){
                str += digits[i];
                array[i] = 1;
            }
        }String first_number;
        String second_number;
        if(str.indexOf("5") == -1 || str.indexOf("8")==-1) {
            if(str.indexOf("5") == -1) {
                int first_number_1 = str.indexOf("8");
                first_number = str.substring(0,first_number_1);
                second_number = str.substring(first_number_1,str.length());
            }else{
                int first_number_1 = str.indexOf("5");
                first_number = str.substring(0,first_number_1);
                second_number = str.substring(first_number_1,str.length());
            }
        }else{
            int first_number_1 = str.indexOf("5");
            int first_number_2 = str.indexOf("8");
            first_number = str.substring(0,first_number_1) + str.substring(first_number_2+1,str.length());
            second_number = str.substring(first_number_1,first_number_2+1);
        }
        // String first_number_words = "";
        // for(int i=0; i<first_number.length(); i++) {
        //     first_number_words += ones_case(first_number.substring(i,i+1)) + " ";
        // }
        int number = Integer.parseInt(first_number)+Integer.parseInt(second_number);
        // if(first_number.length()!=0){
        //     System.out.println("First Number: " + first_number);
        //     System.out.println("First Number In Words: "+first_number_words);
        // }if(second_number.length()!=0){
        //     System.out.println("Second Number: "+second_number);
        //     System.out.println("Second Number In Words: "+findNumberInWords(second_number));
        // }
        System.out.println("Numeber: "+number);
        System.out.println("Number in words: "+findNumberInWords(Integer.toString(number)));
        scanner.close();
    }
}
