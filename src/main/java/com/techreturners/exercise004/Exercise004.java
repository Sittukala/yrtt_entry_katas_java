package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {

        // Add your code here

        StringBuilder builder= new StringBuilder();
        int i=0;
        int size=str.length();
        for(int j=0;j<=size;j++){
            char literal = j<str.length() ? str.charAt(j) : '\0';
            if(Character.isLetterOrDigit(literal)){
                continue;
            }
            if(i<j){
                builder.append(str.substring(i+1,j));
                builder.append(str.charAt(i));
                builder.append("ay");
            }
            if(literal!='\0'){
                builder.append(literal);
            }
            i=j+1;
        }
    System.out.println("final  " + builder.toString());
    return builder.toString();
    }
}
