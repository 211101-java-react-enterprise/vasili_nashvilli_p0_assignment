package com.revature.vasili_nashvilli_p0_assignment.main.util;

public interface List<T> extends Collection<T> {
    T get(int index);


    default void defaultMethodExample(){
        System.out.println("This is a default method in an interface, it can be overridden by implementing classes");
    }

    static void staticMethodExample(){
        System.out.println("This is a static method in an interface, it cannot be overridden - but it can be shadowed.");
    }
}