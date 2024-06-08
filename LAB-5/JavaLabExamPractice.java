package JavaLabExam;
import MultiLevelPackagesjava.MultiPkgLabExamPrep;
import java.util.*;
import java.io.*;
import java.lang.*;
class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return 2*(float)Math.PI*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderArea(){
        return getCircleArea()*(r+h);
    }
}class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}interface in{
    int a = 2;
    public void hai();
}public class JavaLabExamPractice implements in{ 
    private int a;
    public void set(int a){
        this.a = a;
        return;
    }public int get(){
        return a;
    }public void hai(){ // dynamic/compiletime polymorphism
        System.out.println("hai");
    }public int addNumbers(int a, int b){
        return a+b;
    }public float addNumbers(float a, float b){   // static/compiletime polymorphism
        return a+b;
    }public static String getPascalStr(String str){
        int n = str.length();
        String pascal_str = new String();
        int i = 0;
        while(i<n){
            while(i<n && str.charAt(i)==' '){
                pascal_str += ' ';
                i++;
            }if(i<n && ((int)str.charAt(i))>=97 && ((int)str.charAt(i))<=122){
                pascal_str += str.substring(i,i+1).toUpperCase();
                i++;
            }while(i<n && str.charAt(i)!=' '){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static void getStrStats(String str){
            int v,c,d,s,spl,i,n,w;
            v = c = d = s = spl = w = i = 0;
            n = str.length();
            str = str.toLowerCase();
            while(i<n){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                    v++;
                }else if((int)str.charAt(i)>=97 && str.charAt(i)<=122){
                    c++;
                }else if((int)str.charAt(i)>=48 && str.charAt(i)<=57){
                    d++;
                }else if(str.charAt(i)==' '){
                    s++;
                }else{
                    spl++;
                }i++;
            }i = 0;
            while(i<n){
                while(i<n && str.charAt(i)==' '){
                    i++;
                }int flag = 0;
                while(i<n && str.charAt(i)!=' '){
                    i++;
                    flag = 1;
                }if(flag==1){
                    w++;
                }
            }System.out.println("v: "+v+" c: "+c+" d: "+d+" s: "+s+" spl: "+spl+" w: "+w);
            return;
    }public static void checkSubStr(String str, String s){
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                if(str.substring(i,j+1).equals(s)){
                    System.out.println("found");
                    break;
                }
            }
        }return;
    }public static String removeSpaceInStr(String str){
        String new_str = new String();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                new_str += str.charAt(i);
            }
        }return new_str;
    }public static void sortEvenOdd(int arr[]){
        for(int i=0; i<arr.length; i+=2){
            for(int j=0; j<arr.length; j+=2){
                if(j+2<arr.length && arr[j]>arr[j+2]){
                    arr[j] = arr[j]^arr[j+2];
                    arr[j+2] = arr[j]^arr[j+2];
                    arr[j] = arr[j]^arr[j+2];
                }
            }
        }for(int i=1; i<arr.length; i+=2){
            for(int j=1; j<arr.length; j+=2){
                if(j+2<arr.length && arr[j]>arr[j+2]){
                    arr[j] = arr[j]^arr[j+2];
                    arr[j+2] = arr[j]^arr[j+2];
                    arr[j] = arr[j]^arr[j+2];
                }
            }
        }for(int val: arr){
            System.out.print(val+ " ");
        }return;
    }public static void equalSumPartition(int arr[]){
        int sum_arr[] = new int[arr.length];
        sum_arr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            sum_arr[i] += sum_arr[i-1];
        }int part_idx = -1;
        for(int i=0; i<arr.length; i++){
            if(2*arr[i] == arr[arr.length-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(arr[i]+ " ");
            }System.out.println();
            for(int i=part_idx; i<arr.length; i++){
                System.out.println(arr[i]+ " ");
            }
        }return;
    }public static void reverseRightHalfArray(int arr[]){
        int mid = arr.length/2;
        int new_arr[] = new int[arr.length-mid];
        int t = mid;
        for(int i=0; i<arr.length-mid; i++){
            new_arr[i] = arr[t];
            t++;
        }t = mid;
        for(int i=new_arr.length-1; i>=0; i--){
            arr[t] = new_arr[i];
            t++;
        }for(int val: arr){
            System.out.print(val+ " ");
        }return;
    }public static void characterFrequency(String str){
        int flag[] = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            flag[i] = 1;
        }for(int i=0; i<str.length(); i++){
            if(flag[i] == 1){
                int c = 0;
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(i)==str.charAt(j)){
                        flag[j] = 0;
                        c++;
                    }
                }System.out.println(str.charAt(i)+ " : " + c);
            }
        }return;
    }public static void main(String[] args) throws Exception{
        String str = "sai12 how*& are you?";
        System.out.println(getPascalStr(str));
        getStrStats(str);
        checkSubStr(str,"?");
        System.out.println(removeSpaceInStr(str));
        int arr[] = new int[]{4,2,3,1,0,6,7};
        sortEvenOdd(arr);
        System.out.println();
        reverseRightHalfArray(arr);
        System.out.println();
        int age = 15;
        try{
            if(age<18){
                throw new CustomException("Error");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("vote for right");
        }JavaLabExamPractice java = new JavaLabExamPractice();
        java.set(1);
        java.get();
        java.hai();
        System.out.println(java.addNumbers(1, 2));
        System.out.println(java.addNumbers(3f,2f));
        Cylinder cylinder = new Cylinder(2,1);
        System.out.println(cylinder.getCircleArea());
        System.out.println(cylinder.getCylinderArea());
        File file = new File("JavaLabExamPractice.java");
        FileReader fr = new FileReader(file);
        String code = new String();
        int i = fr.read();
        while(i!=-1){
            code += (char)i;
            i = fr.read();
        }FileWriter fw = new FileWriter("JavaLabExamCopy.txt",true);
        fw.write(code);
        fw.flush();
        fr.close();
        fw.close();
        characterFrequency(code);
        MultiPkgLabExamPrep mlp = new MultiPkgLabExamPrep();
        mlp.display();
        System.out.println(mlp.a);
    }
}