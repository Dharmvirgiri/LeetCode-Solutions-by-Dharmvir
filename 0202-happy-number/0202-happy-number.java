class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> num = new HashSet<>();
        while(n!=1 && !num.contains(n)){
            num.add(n);
            n = Getnext(n);
        }
        return n==1;
        
    }
    private int Getnext(int n){
            int sum = 0 ;
            while(n>0){
                int d = n%10;
                n /= 10;
                sum += d*d;
            }
            return sum;
        }
}