package exercises_leetcode.beggining.NumberOfStepsToReduceANumberToZero;

class Solution {
    public int numberOfSteps(int num) {
        // numberofstepts.legnht + 1 step(diuvede to 2) + 1 step()reduce 1 = 2 steps
        int listNumberOfSteps = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num /2;
                listNumberOfSteps += 1;
            }
            if (num % 2 ==1 ){
                num = num - 1;
                listNumberOfSteps += 1;
            }


        }
        return listNumberOfSteps;
    }
}