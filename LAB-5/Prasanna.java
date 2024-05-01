import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class Prasanna implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }Prasanna(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }Prasanna(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        Prasanna add = new Prasanna();
        System.out.println(add.addNumbers());
        add = new Prasanna(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        Prasanna java  = new Prasanna();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("Prasanna.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class Prasanna implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }Prasanna(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }Prasanna(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        Prasanna add = new Prasanna();
        System.out.println(add.addNumbers());
        add = new Prasanna(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        Prasanna java  = new Prasanna();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("Prasanna.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
            System.out.print(code);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
import sai.kiran.patnana.MultiLevelPackages;
import java.util.*;
import java.io.*;
import java.lang.*;
class ExtendedThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class RunnableThread implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}class Circle{
    float r;
    Circle(float r){
        this.r = r;
    }float getCircleArea(){
        return (float)Math.PI*r*r;
    }
}class Cylinder extends Circle{
    float h;
    Cylinder(float r, float h){
        super(r);
        this.h = h;
    }float getCylinderVolume(){
        return getCircleArea()*h;
    }float getCylinderArea(){
        return 2*(float)Math.PI*r*(r+h);
    }
}class Rectangle{
    float l,b;
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }float getRectangleArea(){
        return l*b;
    }
}class Cuboid extends Rectangle{
    float h;
    Cuboid(float l, float b, float h){
        super(l,b);
        this.h = h;
    }float getCuboidVolume(){
        return l*b*h;
    }float getCuboidArea(){
        return 2*(getRectangleArea()+b*h+l*h);
    }
}class CustomException extends Exception {
    CustomException(String message){
        super(message);
    }
}interface Java1{
    int e = 1;
    void wish(String name);
}interface Java2{
    int f = 2;
    void welcome(String name);
}class Student{
    String name; 
    String id;
    String phone_number;
    String branch;
    String email;
    Student(String name, String id, String phone_number, String branch){
        this.name = name;
        this.id = id.toLowerCase();
        this.phone_number = phone_number;
        this.branch = branch;
        this.email = this.id+"@rguktn.ac.in";
    }
}public class JavaOneShotLabPractice implements Java1,Java2{
    int a,b;
    private int c,d;
    public void setC(int c){
        this.c = c;
        return;
    }public void setD(int d){
        this.d = d;
        return;
    }public int getC(){
        return this.c;
    }public int getD(){
        return this.d;
    }JavaOneShotLabPractice(){
        Random r = new Random();
        a = r.nextInt(10);
        b = r.nextInt(10);
    }JavaOneShotLabPractice(int a, int b){
        this.a = a;
        this.b = b;
    }public void wish(String name){
        System.out.println("Hello! "+ name);
        return;
    }public void welcome(String name){
        System.out.println("Welcome! "+ name);
        return;
    }public int addNumbers(){
        return a+b;
    }public static String capitalizeFirstLetterOfEachWordInString(String str){
        int n = str.length();
        String pascal_str = new String();
        str.toLowerCase();
        for(int i=0; i<n; ){
            while(i<n && (int)str.charAt(i)==32){
                pascal_str += ' ';
                i++;
            }if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                pascal_str +=  str.substring(i,i+1).toUpperCase();
            }else{
                pascal_str += str.charAt(i);
            }i++;
            while(i<n && (int)str.charAt(i)!=32){
                pascal_str += str.charAt(i);
                i++;
            }
        }return pascal_str;
    }public static boolean checkSubstring(String str, String original){
        for(int i=0; i<original.length(); i++){
            for(int j=i+1; j<original.length(); j++){
                if(original.substring(i,j).equals(str)){
                    return true;
                }
            }
        }return false;
    }public static String removeSpaceInString(String str){
        String strip_str = new String();
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)!=32){
                strip_str += str.charAt(i);
            }
        }return strip_str;
    }public static void VowelsConsonantsDigitsSpacesWords(String str){
        int n = str.length();
        int v = 0, c = 0, d = 0, s = 0, w = 0, spl = 0;
        str = str.toLowerCase();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                c++;
            }else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                d++;
            }else if((int)str.charAt(i)==32){
                s++;
            }else{
                spl++;
            }
        }for(int i=0; i<n; ){
            if((int)str.charAt(i)==32){
                while(i<n && (int)str.charAt(i)==32){
                    i++;
                }
            }else{
                while(i<n && (int)str.charAt(i)!=32){
                    i++;
                }w++;
            }
        }System.out.print("vowels: " + v + "\n" + "consonants: " + c + "\n" + "digits: " + d + "\n" + "spaces: " + s + "\n" + "words: " + w + "\n" + "spl chars: " + spl + "\n");
        return;
    }public static void equalSumPartition(int array[]){
        int n = array.length;
        int new_array[] = new int[n];
        new_array[0] = array[0];
        for(int i=1; i<n; i++){
            new_array[i] = array[i] + new_array[i-1];
        }int part_idx = -1;
        for(int i=0; i<n; i++){
            if(2*new_array[i] == new_array[n-1]){
                part_idx = i;
                break;
            }
        }if(part_idx != -1){
            for(int i=0; i<=part_idx; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
            for(int i=part_idx+1; i<n; i++){
                System.out.print(array[i]+" ");
            }System.out.println();
        }return;
    }public static int[] sortEvenOdd(int array[]){
        int n = array.length;
        for(int i=0; i<n; i+=2){
            for(int j=0; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }for(int i=1; i<n; i+=2){
            for(int j=1; j<n-i-1; j+=2){
                if(j+2<n && array[j]>array[j+2]){
                    array[j] ^= array[j+2];
                    array[j+2] ^= array[j];
                    array[j] ^= array[j+2];
                }
            }
        }return array;
    }public static int[] reverseRightHalfArray(int array[]){
        int n = array.length;
        int r = n%2==1? n/2+1: n/2;
        int new_array[] = new int[r];
        for(int i=n/2,j=0; i<n; j++,i++){
            new_array[j] = array[i];
        }for(int i=n/2,j=r-1; i<n; i++,j--){
            array[i] = new_array[j];
        }return array;
    }public static int greatestOfThreeNumber(int a, int b, int c){
        return a>b? a>c? a:c : b>c? b: c;
    }public static boolean checkEvenOdd(int n){
        return n%2==1? true:false;
    }public static boolean checkPrimeNumber(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if(checkPrimeNumber(1)){
            System.out.println("It's a prime.");
        }else{
            System.out.println("It's not a prime.");
        }if(checkEvenOdd(0)){
            System.out.println("It's odd.");
        }else{
            System.out.println("It's  even.");
        }System.out.println(greatestOfThreeNumber(1, 2, 3));
        int array[] = new int[] {1,2,3,6,5};
        equalSumPartition(array);
        array = reverseRightHalfArray(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        array = sortEvenOdd(array);
        for(int val: array){
            System.out.print(val+" ");
        }System.out.println();
        VowelsConsonantsDigitsSpacesWords("Sai Kiran Patnana143!");
        System.out.println(capitalizeFirstLetterOfEachWordInString("sai kiran patnana"));
        System.out.println(removeSpaceInString("Sai Kiran Patnana"));
        Student student = new Student("SaiKiranPatnana","N210132","6300006765","CSE");
        System.out.println(student.name+" "+student.id +" "+student.phone_number+" "+student.branch+" "+student.email);
        JavaOneShotLabPractice add = new JavaOneShotLabPractice();
        System.out.println(add.addNumbers());
        add = new JavaOneShotLabPractice(1,2);
        System.out.println(add.addNumbers());
        add.setC(1);
        add.setD(2);
        System.out.println(add.getC());
        System.out.println(add.getD());
        JavaOneShotLabPractice java  = new JavaOneShotLabPractice();
        System.out.println(java.e);
        System.out.println(java.f);
        java.welcome("SaiKiran");
        java.wish("SaiKiran");
        Cylinder cylinder = new Cylinder(1,2);
        System.out.println(cylinder.getCylinderArea());
        System.out.println(cylinder.getCylinderVolume());
        Cuboid cuboid = new Cuboid(1,2,3);
        System.out.println(cuboid.getCuboidArea());
        System.out.println(cuboid.getCuboidVolume());
        int age = 17;
        try{
            if(age<18){
                throw new CustomException("You are not eligible to vote!");
            }else{
                System.out.println("You are eligible to vote!");
            }
        }catch(CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Always Vote For The Right!");
        }try{
            System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }try{
            File f = new File("/home/user/Downloads/OOPS_THROUGH_JAVA/LAB-5/JavaOneShotLabPractice.java");
            FileReader fr = new FileReader(f);
            String code = new String();
            int a = fr.read();
            while(a != -1){
                code += (char)a;
                a = fr.read();
            }f = new File("Prasanna.java");
            f.createNewFile();
            FileWriter fw = new FileWriter("Prasanna.java",true);
            for(int i=0; i<code.length(); i++){
                fw.write(code.charAt(i));
            }fr.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }MultiLevelPackages mlp = new MultiLevelPackages();
        String strings[] = new String[0];
        mlp.main(strings);
        ExtendedThread et = new ExtendedThread();
        RunnableThread t = new RunnableThread();
        Thread rt = new Thread(t);
        et.start();
        rt.start();
    }
}
