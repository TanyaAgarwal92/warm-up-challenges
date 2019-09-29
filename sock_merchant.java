/*
[HackerRank] : John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
*/

// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Hashtable<Integer, Integer> unique = new Hashtable();
        int pairs = 0;
        for ( int i =0; i < n; i++){
            int color = ar[i];
            if ( unique.containsKey(color)){
                int count = unique.get(color);
                if (count % 2 != 0){
                    pairs++;
                }
                unique.put(color, count + 1);
            }
            else{
                unique.put(color, 1);
            }
        }
        return pairs;
    }
