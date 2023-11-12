import java.util.*;
import java.io.*;
public class WordTool{
    public static void main(String args[]) throws Exception{
        HashMap<String,Integer>hs=new HashMap<String,Integer>();
        File f=new File("C:\\Users\\sriha\\OneDrive\\Desktop\\New Text.txt");
        Scanner sc=new Scanner(f);
        int c=0,avg=0;String s;
        while(sc.hasNext()){
            s=sc.next();
            if(hs.containsKey(s))
            hs.put(s,hs.get(s)+1);
            else
            hs.put(s,1);
            avg=avg+s.length();
            System.out.print(s+" ");
            c++;
        }
        System.out.println();
        System.out.println(hs);
        System.out.println("Number of words are "+c);
        System.out.println("Average word length="+avg/c);
        sc.close();
    }
}
