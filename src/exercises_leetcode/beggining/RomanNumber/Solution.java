package exercises_leetcode.beggining.RomanNumber;

class Solution {
    public int romanToInt(String romanNumber) {
        int realNumberResult = 0;
        char lastChar = '\0';

        for(int i = 0; i < romanNumber.length(); i ++){

            char actualRomanNumber = romanNumber.charAt(i);
            if(actualRomanNumber == 'V' && lastChar == 'I'){
                realNumberResult += 3;
                continue;
            }
            if(actualRomanNumber == 'X' && lastChar == 'I'){
                realNumberResult += 8;
                continue;
            }
            if(actualRomanNumber == 'L' && lastChar == 'X'){
                realNumberResult += 30;
                continue;
            }
            if(actualRomanNumber == 'C' && lastChar == 'X'){
                realNumberResult += 80;
                continue;
            }
            if(actualRomanNumber == 'D' && lastChar == 'C'){
                realNumberResult += 300;
                continue;
            }
            if(actualRomanNumber == 'M' && lastChar =='C'){
                realNumberResult += 800;
                continue;
            }

            if(actualRomanNumber == 'I') realNumberResult += 1;
            if(actualRomanNumber == 'V') realNumberResult += 5;
            if(actualRomanNumber == 'X') realNumberResult += 10;
            if(actualRomanNumber == 'L') realNumberResult += 50;
            if(actualRomanNumber == 'C') realNumberResult += 100;
            if(actualRomanNumber == 'D') realNumberResult += 500;
            if(actualRomanNumber == 'M') realNumberResult += 1000;

            lastChar = actualRomanNumber;

        }   return realNumberResult;
    }}