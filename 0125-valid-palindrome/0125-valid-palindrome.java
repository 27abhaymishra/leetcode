class Solution {
    public boolean isPalindrome(String s) {
    
         int c =0;
        for(int i=0;i<s.length();i++){
            int n = (int)s.charAt(i);
            System.out.print(n+" ");
            if((n>=65&&n<=90)||(n>=97&&n<=122)||(n>=48&&n<=57)) c++;
        }
        System.out.println();
         System.out.println(c+" ");
        if(c==0) return true;
        int arr[] = new int[c];
        int j =0;
        for(int i=0;i<s.length();i++){
            int n = (int)s.charAt(i);
            if((n>=65&&n<=90)||(n>=97&&n<=122)||(n>=48&&n<=57)){
                if(n>=65&&n<=90) n+=32;
                arr[j++] = n;
            }
        }
        int p=0,q=c-1;
        while(p<q){
            if(arr[p]!=arr[q]) return false;
            p++;
            q--;
        }
        return true;
        
    }
}