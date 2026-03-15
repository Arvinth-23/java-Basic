/* This program is used to calculate the richest customers in the array. First for loop is to add the array elements
then next for to add next array and if statement is to check the first row and second array elements and 
find the max value */


class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i =0;i<accounts.length;i++){
            int rowsum = 0;
            for (int j = 0;j<accounts[i].length;j++){
                rowsum += accounts[i][j];
            }
            if (rowsum >max){
                max = rowsum;
            }
        }
        return max;
    }
}