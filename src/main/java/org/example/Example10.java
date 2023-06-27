package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Aytac");
        list.add("zamina");
        list.add("qorxmaz");
        list.add("Nuray");
        list.add("Nurane");
      List<String> nameList= list.stream().filter(name->name.length()>5).collect(Collectors.toList());
        System.out.println(nameList);
    }


}
