/* 
[HackerRank] : Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
*/

// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0; 
        int start = 0; 
        int end = c.length -1;
        while ( start < end ){
            if ( start + 2 <= end){
                if ( c[start + 2] == 0){
                    jumps++;
                    start += 2;
                }
                else if ( c[start + 1] == 0){
                    jumps++;
                    start += 1;
                }
            }
            else if ( start + 1 <= end){
                if ( c[start + 1] == 0){
                    jumps++;
                    start += 1;
                }
            }
        }
        return jumps;
    }
