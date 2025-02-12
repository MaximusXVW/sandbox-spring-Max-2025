package org.example.sandbox.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {
        // try-catch
        try {
            // do something
        } catch (Exception e){
            e.printStackTrace();
        }

        // do something else

        //try-catch-catch - order of catch blocks matters per hierarchy

        try{

        } catch (NullPointerException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{

        }catch (Exception e){
            e.printStackTrace();

        } finally {

        }

        try {

        } finally{

        }

        try{

        } catch(ArithmeticException | NullPointerException  | SecurityException e){
            e.printStackTrace();
        }

        try(Scanner scanner1 = new Scanner(System.in)){
            // do something
        } catch (Exception e){
            e.printStackTrace();
        }




    }
}
