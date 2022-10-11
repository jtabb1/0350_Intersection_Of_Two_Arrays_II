import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] in1 = new int[]{1,2,2,1};
    int[] in2 = new int[]{2,2};
    System.out.println("Hello world!");
    int[] inOut;
    Main obj = new Main();
    inOut = obj.intersect(in1, in2);
    System.out.println(Arrays.toString(inOut));
  }

    public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i = 0, j = 0, k = 0;
      while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
          ++i;
        } else if (nums1[i] > nums2[j]) {
          ++j;
        } else {
          nums1[k++] = nums1[i++];
        }
      }
      return Arrays.copyOfRange(nums1,0,k);
    }
}