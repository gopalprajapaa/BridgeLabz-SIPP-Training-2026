import java.util.Arrays;

public class OTPGenerator {

    public static int generateOTP() {

        return (int) (Math.random() * 900000)
                + 100000;
    }

    public static boolean areUnique(int[] otpArray) {

        for (int i = 0; i < otpArray.length; i++) {

            for (int j = i + 1;
                 j < otpArray.length;
                 j++) {

                if (otpArray[i] == otpArray[j])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {

            otps[i] = generateOTP();
        }

        System.out.println(
                Arrays.toString(otps));

        if (areUnique(otps))
            System.out.println(
                    "All OTPs are Unique");
        else
            System.out.println(
                    "Duplicate OTP Found");
    }
}
