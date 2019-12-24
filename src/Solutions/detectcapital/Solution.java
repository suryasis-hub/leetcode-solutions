package Solutions.detectcapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        boolean check1 = true;
        boolean check2 = true;
        for(int i = 0 ; i < word.length() ;++i) {
            if(!Character.isUpperCase(word.charAt(i)))
                check1 = false;
            if(!Character.isLowerCase(word.charAt(i)))
                check2 = false;
        }
        if(check1 || check2) {
            return true;
        }
        else {
         boolean check3 = true;
          for(int j = 1 ; j < word.length() ; ++j) {
              if(!Character.isLowerCase(word.charAt(j))) {
                  check3 = false;
              }
          }
           return (Character.isUpperCase(word.charAt(0)) && check3);
        }
    }
}
