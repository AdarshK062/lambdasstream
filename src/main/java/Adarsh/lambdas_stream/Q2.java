package Adarsh.lambdas_stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        list.add("pqrs");
        list.add("pqqrstu");
        list.add("pqr");
        list.add("ppp");

        list = findStrings(list);

        for(Object str : list)
            System.out.println(str);
    }

    static List<String> findStrings(List<String> list)
    {
        return list.stream().filter(str -> ((String) str).startsWith("p")).filter(str -> ((String) str).length()==3).collect(Collectors.toList());
    }
}