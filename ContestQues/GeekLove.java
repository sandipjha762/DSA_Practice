package ContestQues;

public class GeekLove {
    public static void main(String[] args) {
        int price[] = {2, 4, 1, 5, 10, 6};
        int seqeunce[] = {-1, 1, 0, 1, -1, 0};
        int n = 6;
        int k = 4; // Given k will always be even
        /*  we need to take k size subarray of sequence array and 
            change first half elements with 0 and 
            rest with 1 then calculate the sum (price[i]*sequence[i]) 
        */

        int maxProfit = maximizeProfit(n, k, price, seqeunce);
        System.out.println(maxProfit);


    } 

    static int maximizeProfit(int n, int k, int[] price, int[] sequence) {
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int[] modifiedSequence = sequence.clone();
            for (int j = i; j < i + k; j++) {
                if (j < i + k / 2) {
                    modifiedSequence[j] = 0; 
                } else {
                    System.out.println(j);
                    modifiedSequence[j] = 1; 
                }
            }
            int profit = calculateProfit(price, modifiedSequence);
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    private static int calculateProfit(int[] price, int[] sequence) {
        int profit = 0;
        int buyingPrice = 0;

        for (int i = 0; i < price.length; i++) {
            if (sequence[i] == -1) {
                buyingPrice += price[i];
            } else if (sequence[i] == 1) {
                profit += price[i] - buyingPrice;
                buyingPrice = 0;
            }
        }

        return profit;
}
}