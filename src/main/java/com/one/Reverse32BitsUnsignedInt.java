package com.one;

/**
 * do this for 32 bit
 *
 * 0000 - 0000 - 0000 - 0011
 * 1100 - 0000 - 0000 - 0000
 */
public class Reverse32BitsUnsignedInt {
  public static void main(String[] args){
    int output = reverseBits(17);

    System.out.println(Integer.toBinaryString(output));
  }


  public static int reverseBits(int n) {
    if (n == 0) return 0;

    int result = 0;
    for (int i = 0; i < 32; i++) {
      result <<= 1;
      if ((n & 1) == 1) result++;
      n >>= 1;
    }
    return result;
  }
}
