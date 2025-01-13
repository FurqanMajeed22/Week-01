import java.util.HashSet;

public class OTP_Checker {

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        boolean areUnique = checkUniqueOTPs(otps);
        System.out.println("Are all OTPs unique? " + areUnique);
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check if all OTPs are unique
    public static boolean checkUniqueOTPs(int[] otps) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < otps.length; i++) {
            uniqueSet.add(otps[i]);
        }

        return uniqueSet.size() == otps.length;
    }
}
