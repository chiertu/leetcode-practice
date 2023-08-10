public class Array_Survey_274 {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n+1];
//        // replace larger int with n
//        for (int i=0; i<n; i++){
//            if(citations[i] > n) citations[i] = n;
//        }
//        // count occurrence
//        for (int i=0; i<n; i++){
//            citations[citations[i]-1]++;
//        }
        for (int i=0; i<n; i++){
            counts[Math.min(citations[i],n)]++;
        }

        int k=n;
        int count = counts[k];
        while (count<k){
            k--;
            count+=counts[k];
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{5, 5, 5, 2, 1})); // return 3
        System.out.println(hIndex(new int[]{0, 0})); // return 0
    }
}
