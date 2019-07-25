package com.attunity.java8;

/**
 * @author Evgeny Borisov
 */
public interface Father {
   default void talk(){
       System.out.println("Son, come to me");
   }
}
