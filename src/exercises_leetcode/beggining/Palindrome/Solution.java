package exercises_leetcode.beggining.Palindrome;

class Solution {
    public boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        String revaersedNumberString = invertNumber(number);
        if(revaersedNumberString.equals(numberString)){
            return true;
        }
        else{
            return false;
        }

    }

    private String invertNumber(int number){
        String reversedNumberString = new StringBuilder(String.valueOf(number)).reverse().toString();
        return reversedNumberString;
    }

}