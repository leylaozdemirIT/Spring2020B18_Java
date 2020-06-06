package day45_Exceptions;

import org.omg.SendingContext.RunTime;

import java.io.IOException;
import java.util.NoSuchElementException;
// chrome, firefox, opera...
public class ThrowKeyword {

    public static void main(String[] args) {

        NoSuchElementException obj = new NoSuchElementException();

        // throw obj;

        //throw new NoSuchElementException();

        //System.out.println();


        /*
        boolean breakTime = true;
        if(breakTime){
            throw new RuntimeException("It's break time, we should take a break");
        }
         */

        // throw new IOException(); //we use this for unchecked exceptions

        int[] arr = {5,6,7};

        //System.out.println(arr[100]);
        //System.out.println(9/0);

        //throw new RuntimeException();
        // System.out.println ();

        try{
            throw new RuntimeException();
        }catch(Exception e){

        }
        // System.out.println();

        }
}
