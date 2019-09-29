/*
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
*/

// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        Stack<Character> mountain = new Stack();
        Stack<Character> valley = new Stack();
        int valleys = 0; 
        for ( int i = 0; i < n ; i++){
            char ch = s.charAt(i);
            if ( ch == 'U' && valley.size() == 0){
                mountain.push(ch);
            }
            else if ( ch == 'D' && mountain.size() != 0){
                mountain.pop();
            }
            else if ( ch == 'D' && mountain.size() == 0){
                valley.push(ch);
            }
            else if ( ch == 'U' && valley.size() != 0){
                valley.pop();
                if ( valley.size() == 0){
                    valleys++;
                }
            }
        }
        return valleys;
    }
