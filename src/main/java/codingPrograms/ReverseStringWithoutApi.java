package codingPrograms;/** * Write Java program to reverse String in Java without using API functions? * */public class ReverseStringWithoutApi {    public static void main(String...args){        System.out.println("Reverse of siba "+reverseString("siba"));        System.out.println("Reverse of Prasad "+reverseString("Prasad"));        System.out.println("Reverse of Mohanty "+reverseString("Mohanty"));        System.out.println("Reverse of abcd "+reverseString("abcd"));        System.out.println("Reverse of dcba "+reverseString("dcba"));    }    private static String reverseString(String n){        StringBuffer reverseString = new StringBuffer();        for (int i = n.length() -1; i >=0; i--){            reverseString.append(n.charAt(i));        }        return reverseString.toString();    }}