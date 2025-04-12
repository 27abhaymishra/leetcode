class Solution {
    public int countCharacters(String[] words, String chars) {
         HashMap<Character,Integer> m = new HashMap<>();
        HashMap<Character,Integer> n = new HashMap<>();
        for(int i =0;i<chars.length();i++){
            m.put(chars.charAt(i),m.getOrDefault(chars.charAt(i),0)+1);
            //System.out.print(m.get(chars.charAt(i)));
        }
        int sum = 0;
        for(int i =0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                 n.put(words[i].charAt(j),n.getOrDefault(words[i].charAt(j),0)+1);
                 System.out.print(n.get(words[i].charAt(j))+" ");
            }
            int count =0;
            for(char c:m.keySet()){
            if(n.containsKey(c)){
                if(n.get(c)<=m.get(c)){
                    count+=n.get(c);
                }
            }
            n.remove(c);
            } 
            if(count==words[i].length()) sum+=words[i].length();
        }
        return sum;
    }
}