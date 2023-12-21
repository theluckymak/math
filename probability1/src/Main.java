import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for n and r
        System.out.print("Enter value for n: ");
        int n = scanner.nextInt();
        System.out.print("Enter value for r: ");
        int r = scanner.nextInt();

        // Calculate and display permutations without repetition
        System.out.println("Permutation without repetition (nPr): " + PermutationCombination.permutation(n, r));

        // Calculate and display permutations with repetition
        System.out.println("Permutation with repetition (n^r): " + PermutationCombination.permutationWithRepetition(n, r));

        // Calculate and display combinations without repetition
        System.out.println("Combination without repetition (nCr): " + PermutationCombination.combination(n, r));

        // Calculate and display combinations with repetition
        System.out.println("Combination with repetition ((n+r-1)C(r)): " + PermutationCombination.combinationWithRepetition(n, r));

        scanner.close();
    }
}