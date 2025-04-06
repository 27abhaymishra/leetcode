class Solution {
    public int bestClosingTime(String customers) {
               int n = customers.length(), pre = 0, suf = 0;
        int prefix[] = new int[n];
        int suffix[] = new int[n + 1];
        int ans[] = new int[n];
        int ind = 0, min = 0;

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (customers.charAt(i) == 'N') {
                pre++;

            }
            prefix[i] = pre;

            if (customers.charAt(j) == 'Y') {
                suf++;

            }
            suffix[j] = suf;

        }
            min = suffix[0];
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] + suffix[i + 1];
            if (min > ans[i]) {
                ind = i + 1;
                min = ans[i];
            }
            System.out.print(prefix[i] + " " + suffix[i] + " " + ans[i] + " ");
        }
        return ind;
    }
}