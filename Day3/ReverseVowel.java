class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] c=s.toCharArray();
        while(left<right){
            if (!(c[left] == 'a' || c[left] == 'e' || c[left] == 'i' || c[left] == 'o' || c[left] == 'u' || c[left] == 'A' || c[left] == 'E' || c[left] == 'I' || c[left] == 'O' || c[left] == 'U')) {

                left++;
            }
            else if (!(c[right] == 'a' || c[right] == 'e' || c[right] == 'i' || c[right] == 'o' || c[right] == 'u' || c[right] == 'A' || c[right] == 'E' || c[right] == 'I' || c[right] == 'O' || c[right] == 'U')) {

                right--;
            }
            else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;

                left++;
                right--;
            }
        }
        return new String(c);
    }
}