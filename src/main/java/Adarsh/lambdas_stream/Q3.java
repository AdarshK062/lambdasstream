package Adarsh.lambdas_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Q3 {
    public static void main(String args[])
    {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("nitin");
        arrayList.add("krishna");
        arrayList.add("adbbdsaa");
        arrayList.add("aba");

        arrayList = palindrome(arrayList);

        System.out.println("Palindrome Strings are :-");
        for(String str : arrayList)
            System.out.println(str);
    }

    static List<String> palindrome(List<String> list)
    {
        List<String> arrayList=new ArrayList<String>();
        for(String i : list)
        {String str = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0, str.length()/2).noneMatch(j -> str.charAt(j)!= str.charAt(str.length()-j-1)))
                arrayList.add(i);}
        return arrayList;
    }
}