package exercises_leetcode.beggining.RichestCustomerWealth;

class Solution {
    public int maximumWealth(int[][] allBankAccounts) {
        //preciso iterar o array com varias contas
        // dentro de cada conta temos outro array com os valores
        // somar e jogar no mesmo array
        // encontrar o mais rico
        int maxWealth = 0;

        for (int i=0 ; i< allBankAccounts.length; i++){
            int[] custumerAccont = allBankAccounts[i];
            int sumAccount = 0;

            for(int num : custumerAccont) {
                sumAccount += num;
            }


            if (sumAccount > maxWealth) {
                maxWealth = sumAccount;
            }
        }
        
        return maxWealth;
    }
} 