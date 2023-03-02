import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, K, M;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        M = scanner.nextInt();

        if (M > K) {
            System.out.println(0);
            return;
        }

        int countOfResources = N;
        int countOfBars;
        int countOfDetails = 0;

        while(countOfResources >= K) {
            countOfBars = countOfResources / K;
            countOfResources = countOfResources % K;
            countOfDetails += K / M * countOfBars;

            countOfResources += (K % M) * countOfBars;
        }

        System.out.println(countOfDetails);

    }
}

