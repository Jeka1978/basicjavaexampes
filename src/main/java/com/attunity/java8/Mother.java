package com.attunity.java8;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
   default void talk(){
       System.out.println("SON, COME TO ME!!!!!!!");
   }
}
