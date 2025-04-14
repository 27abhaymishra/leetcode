class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> m= new HashMap<>();
        HashMap<Character,Integer> n= new HashMap<>();

        for(int i=0;i<words[0].length();i++){
            char c = words[0].charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
            //System.out.print(m.get(c)+" ");
        }
        //System.out.println();
        for(int i=1;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char c = words[i].charAt(j);
                n.put(c,n.getOrDefault(c,0)+1);
                //System.out.print(n.get(c)+" ");
            }
            //System.out.println();
            for(char c : m.keySet()){
                
                if(n.containsKey(c)){if(m.get(c)>n.get(c)) m.put(c,n.get(c));}
                else m.put(c,0);
                n.remove(c);
                System.out.print(c+" "+m.get(c)+" "+n.get(c)+" ");
            }
            System.out.println();
        }
        ArrayList<String> p = new ArrayList<>();
        for(char c:m.keySet()){
            if(m.get(c)!=0){
                int count =  m.get(c);
               
                while(count>0){
                String str = "";
                str = str + c;
                p.add(str);
                count--;
                }
                
            }
        }
        return p;
    }
}