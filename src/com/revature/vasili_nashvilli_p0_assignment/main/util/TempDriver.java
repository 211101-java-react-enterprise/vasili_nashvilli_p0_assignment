package com.revature.vasili_nashvilli_p0_assignment.main.util;

public class TempDriver {

    public static void main(String[] args){
        List.staticMethodExample();
        LinkedList.staticMethodExample();
        List<String> myStringList = new LinkedList<>();
        myStringList.defaultMethodExample();

        myStringList.add("test-1");
        myStringList.add(("test-2"));
        myStringList.add("test-3");
        System.out.println(myStringList.contains("test-1")); // true
        System.out.println(myStringList.contains("test-2")); // true
        System.out.println(myStringList.contains("test-3")); // true
        System.out.println(myStringList.contains("test-123")); // false

    }
}
