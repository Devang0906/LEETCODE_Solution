class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int , int > mp;
        int currsum=0;
        int result=0;
        mp.insert({0,1});
        for(int i=0;i<nums.size();i++){
            currsum += nums[i];
            if(mp.find(currsum-k)!= mp.end())
            {
                result+=mp[currsum - k];
            }
            mp[currsum]++;

        }
        return result;
    }
};