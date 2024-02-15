package org.example;

public class Main {
    public static void main(String[] args) {
        int kDecimal = 3009;
        String kBinary = Integer.toBinaryString(kDecimal);
        String kHex = Integer.toHexString(kDecimal);

        String lHex = "2AB";
        int lDecimal = Integer.parseInt(lHex, 16);
        String lBinary = Integer.toBinaryString(lDecimal);

        String mBinary = "001101100000";
        int mDecimal = Integer.parseInt(mBinary, 2);
        String mHex = Integer.toHexString(mDecimal);

        System.out.println("K (dec) = " + kDecimal + ", (bin) = " + kBinary + ", (hex) = " + kHex);
        System.out.println("L (hex) = " + lHex + ", (bin) = " + lBinary + ", (dec) = " + lDecimal);
        System.out.println("M (bin) = " + mBinary + ", (hex) = " + mHex + ", (dec) = " + mDecimal);

        String kPlusL = addBinary(kBinary, lBinary);
        String  kPlusM = addBinary(kBinary, mBinary);
        String  lPlusM = addBinary(lBinary, mBinary);

        System.out.println("K + L = " + kPlusL);
        System.out.println("K + M = " + kPlusM);
        System.out.println("L + M = " + lPlusM);

        int negative10314 = -10314;
        int negative22 = -22;
        int negative12345678 = -12345678;

        System.out.println("Binary representation of -10314: " + Integer.toBinaryString(negative10314));
        System.out.println("Binary representation of -22: " + Integer.toBinaryString(negative22));
        System.out.println("Binary representation of -12345678: " + Integer.toBinaryString(negative12345678));
    }


    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = binary1.length() - 1, j = binary2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int bit1 = i >= 0 ? binary1.charAt(i) - '0' : 0;
            int bit2 = j >= 0 ? binary2.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}
