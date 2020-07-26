package Interview_Questions.Numbers__START;

public class PrimeNumber {

   public static boolean PrimeNumber(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber(17));
    }
}

