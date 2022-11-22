class Solution {
    public int reverse(int x) {
        long ans = x ;
        String str = "";
        String sans = "" ;
        char temp ;
        if ( ans >= 0 ) {
            str = Long.toString(ans);
            for (int j = str.length()-1;j >= 0 ; j--) {
                sans += str.charAt(j) ;
            }
            ans = Long.valueOf(sans); 
        }
        else {
            ans *= -1  ;
            str = Long.toString(ans);
            for (int j = str.length()-1;j >= 0 ; j--) {
                sans += str.charAt(j) ;
            }
            ans = Long.valueOf(sans); 
            ans *= -1 ;
        }
        if ( ans > 2147483647 || ans < -2147483648)return 0 ;
        return (int) ans ;
    }
}
