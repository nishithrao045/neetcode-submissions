class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int  [] count=new int[26];
        int [] windowCount=new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            windowCount[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count,windowCount)){
            return true;
        }
          for (int right = s1.length(); right < s2.length(); right++) {

            windowCount[s2.charAt(right) - 'a']++;

            windowCount[s2.charAt(right - s1.length()) - 'a']--;

            if (Arrays.equals(count, windowCount)) {
                return true;
            }
        }

        return false;
    }
}