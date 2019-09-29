/*
[HackerRank] : Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.
*/

// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int sLen = s.length();
        int countOfA = 0; 
        long res = 0;
        for ( int i = 0; i < sLen; i++){
            if( s.charAt(i) == 'a'){
                countOfA++;
            }
        }
        res += countOfA * ( n / sLen);
        long rem = (n % sLen) ;
        for ( int i = 0; i < rem ; i++){
            if ( s.charAt(i) == 'a'){
                res++;
            }
        }
        return res;
    }
