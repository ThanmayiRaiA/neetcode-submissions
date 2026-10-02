class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        HashMap<Character,Integer>h=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
       for(char ch:t.toCharArray()){
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        if(hm.equals(h)){
            return true;
        }return false;
    }
}
