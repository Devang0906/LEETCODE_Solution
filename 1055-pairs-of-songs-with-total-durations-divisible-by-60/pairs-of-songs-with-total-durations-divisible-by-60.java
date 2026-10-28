class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        //TLE 33 case passed

        // int count=0;
        // for(int i=0 ;i<time.length;i++ ){
        //     for(int j=i+1;j<time.length;j++){
        //         if(i<j && (time[i]+time[j])%60 == 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int n = time.length;
        if(n==0){  // empty
            return 0;
        }
        int[] rem=new int[60];

        for(int i=0;i<n;i++){
            rem[time[i]%60]++;
        }
        
         long pair = 0; 

        if(rem[0] > 0){
            pair += ((long) rem[0] * (rem[0] - 1)) / 2;
        }
        if(rem[30] > 0){
            pair += ((long) rem[30] * (rem[30] - 1)) / 2;
        }

        int i = 1; 
        int j = 59;
        while(i < j){
            pair += (long) rem[i] * rem[j]; // Pair remainders i and j
            i++;
            j--;
        }
        
        return (int)pair;
        
        
    }
}