class Solution {
public:
    int numPairsDivisibleBy60(vector<int>& time) {
        int n= time.size();
        vector<int>rem(60,0);
        for(int i=0 ;i<n;i++){
            rem[time[i]%60]++;
        }
        long long pair=0;

        if(rem[0]>0){
            pair+=(1LL*rem[0]*(rem[0]-1))/2;
        }
         if(rem[30]>0){
            pair+=(1LL*rem[30]*(rem[30]-1))/2;
        }

        int i=1 ;int  j =59;
        while(i<j){
            pair +=rem[i]*rem[j];
            i++;
            j--;
        }
        return pair;
    
    }
};