import java.io.FileReader;

public class Question5 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("/LAB-5/abc.txt");
        FileReader fr = new FileReader(f);
        String str = new String();
        int i;
        while((i=fr.read())!=-1){
            str += (char)i;
        }String words[] = str.split(" ");
        int alphabets[26];
        File f2 = new File("/LAB-5/xyz.txt");
        FileWrite fw = new FileWriter(f2);
        fw.write("Count of occurrences of each word: \n");
        for(int i=0; i<words.length; i++){
            if(words[i]!="-1"){
                int count = 0;
                for(int j=i+1; j<words.length; j++){
                    if(words[i]==words[j]){
                        count ++;
                        words[j] = "-1";
                    }
                }fw.write(words[i]+" : "+count+"\n");
                words[i] = "-1";
            }
        }fw.write("Count of occurrences of each letter: ");
        int capital_letters[26];
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)>=97 and (int)str.charAt(i)<=122){
                small_letters[(int)str.charAt(i)-97]++;
            }
        }for(int i=0; i<26; i++){
            fw.write((char)(i+97) + " : "+ small_letters[i]+"\n");
        }int small_letters[26];
        for(int i=0; i<str.length(); i++){
            if((int)str.charAt(i)>=97 and (int)str.charAt(i)<=122){
                small_letters[(int)str.charAt(i)-97]++;
            }
        }for(int i=0; i<26; i++){
            fw.write((char)(i+97) + " : "+ small_letters[i]+"\n");
        }
    }
}
