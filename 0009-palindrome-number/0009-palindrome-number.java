class Solution {
    public boolean isPalindrome(int x) {
        int index = 0;
        if(x<0)
            return false;
        int temp = x;
        
        int rev = 0 ;
        while(x!=0){
            index = x % 10;
            rev = rev*10 + index;
            x = x/10;
        }
        
        if(temp==rev)
            return true;
        else
            return false;
        
    }
}