public class PermutationCombination {


    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static long permutation(int n, int r) {
        if (n < r) {
            return 0;
        }
        return factorial(n) / factorial(n - r);
    }


    public static long permutationWithRepetition(int n, int r) {
        return (long) Math.pow(n, r);
    }


    public static long combination(int n, int r) {
        if (n < r) {
            return 0;
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long combinationWithRepetition(int n, int r) {
        return factorial(n + r - 1) / (factorial(r) * factorial(n - 1));
    }}