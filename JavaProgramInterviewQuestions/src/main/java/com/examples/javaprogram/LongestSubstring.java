package com.examples.javaprogram;

public class LongestSubstring {


    public static String findLongestSubstring(String str1, String str2) {
        int maxLength = 0;
        String longestSubstring = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String subStr = str1.substring(i, j);
                if (str2.contains(subStr) && subStr.length() > maxLength) {
                    maxLength = subStr.length();
                    longestSubstring = subStr;
                }
            }
        }

        return longestSubstring;
    }
    public static void main(String[] args) {
        String str1 = "abcdefgh";
        String str2 = "xyzefabcd";

       // String str1= "ijklmadc";
      //  String  str2="adcdeijklm"; -->Longest substring is "ijklm"
        String result = findLongestSubstring(str1, str2);
        System.out.println("Longest Substring: " + result);
    }
}
