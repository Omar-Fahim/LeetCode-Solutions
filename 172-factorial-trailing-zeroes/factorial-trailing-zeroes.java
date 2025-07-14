class Solution {

    public int trailingZeroes(int n) {

        int last_digit = n % 10;
        int first_digits = n/10;
        int number = (5-last_digit > 0) ?  first_digits*10:first_digits*10+5;
        int result = 0;
        while(number > 0){
            result += (number/5);
            number /= 5;
        }
        return result;        
    }
}