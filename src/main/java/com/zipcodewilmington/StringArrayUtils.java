package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String i : array) {
            if (value == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if (array[0] != array[array.length - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String i : array) {
            if (value == i) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(valueToRemove)) {
                arr.add(array[i]);
            }
        }
        String[] x = arr.toArray(new String[0]);
        return x;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String placeHolder = "";
        for (int i = 1; i < array.length-1; i++) {
            if (!array[i].equals(array[i + 1])) {
                placeHolder += (array[i] + " ");
            }//[3,4,4,5,5,4,3,6] --> String "4 5" (2) --> array[4 5] --> array[1]
            //preArray += (array[1]) --> "[4 5, ]"
        }
        placeHolder += (array[array.length-1]); //Adding the final index to the string
        String[] newStringArray = placeHolder.split(" "); //splitting the array
        return newStringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String similarValues = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                similarValues += (array[i]);
            } else similarValues += (" " + array[i]);
        }
        String[] stringArray = similarValues.split(" ");
        return stringArray;
        //You start at 1 because in the if statement, you're looking at the value at index one to the element prior (i-1)
        //and you compared the value at array[1] and array[0]
        //if they are the same, you group them at array[i]
        //else grouping += " " + array[i] meaning they are in their own grouping in the array

    }
}
