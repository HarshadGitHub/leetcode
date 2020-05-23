class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x==0)
            return true;
        if(x<0 || x%10==0)
            return false;
        int p=0;
        while(x>p){
            p=(p*10) + x%10;
            x/=10;
        }
        return (x==p || x==p/10);
    }
}
