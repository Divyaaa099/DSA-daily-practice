class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()){
            return 0;
        }
        int sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }

        int num=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && digit > 7)) {

            if (sign == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
            num=num*10+digit;
            i++;  
        }
        return sign*num;
    }
}