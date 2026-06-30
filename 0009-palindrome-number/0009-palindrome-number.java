class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,digit;
        int number=x;
        while(x>0)
        {
            digit=x%10;
            x=x/10;
            rev=rev*10+digit;
        }
            if(rev==number)
            {
                return true;
            }
            else{
                return false;
            }
    }
}