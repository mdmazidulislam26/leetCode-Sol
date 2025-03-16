class Solution {
    public String customSortString(String order, String s) {
        int freq[] = new int[26];
        int n = s.length();
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : order.toCharArray()){
            while(freq[ch-'a'] > 0){
                    ans.append(ch);
                    freq[ch-'a']--;
            }
        }

        for(char ch : s.toCharArray()){
            if(freq[ch-'a']>0)
                ans.append(ch);
        }
        return ans.toString();
    }
}
