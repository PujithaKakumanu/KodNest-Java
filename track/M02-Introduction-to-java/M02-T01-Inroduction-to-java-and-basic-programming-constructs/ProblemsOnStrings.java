public class ProblemsOnStrings {
    public static void main(String[] args){
        // reverse a string
        String s = "Hello";
        String reversed = "";
        for(int i = s.length()-1; i>=0; i--){   
            reversed += s.charAt(i);
        }
        //for(int i = 0; i < s.length(); i++){
        //    reversed = s.charAt(i) + reversed;
        //}

        
        System.out.println(reversed);

        // check if a string is palindrome
        String s2 = "madam";
        String reversed2 = "";
        for(int i = s2.length() - 1; i >= 0; i--){
            reversed2 += s2.charAt(i);
        }
        if(reversed2.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

        // find the number of vowels and consonants in a string
        String s3 = "Hello";
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < s3.length(); i++){
            char c = s3.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // count the number of words in a string
        String s4 = "Hello World";
        int words = 1;
        for(int i = 0; i < s4.length(); i++){
            char c = s4.charAt(i);
            if(c == ' '){
                words++;
            }
        }
        System.out.println("Words: " + words);

        // convert a string to uppercase and lowercase
        String s5 = "Hello";
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
       
    }

    
}
