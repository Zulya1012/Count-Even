public class Foreach3 {
  public static void main(String[] arg) {
    int[] m = {
      5,
      8,
      9,
      12,
      13,
      16
    };
    int counteven = 0;
    for (int i: m) {
      if (i % 2 == 0) {
        System.out.println(i);

        counteven = counteven + 1;

      }
    }
    System.out.println();
    System.out.println(counteven);

  }
}
