package StriverDSA.src.LinearSearch;

class EvenDigits {
  public static void main(String[] args) {
    int[] nums = {12,345,22,6,7289};
  int temp=0;
      for (int num : nums) {
          int a = digitcheck(num);
          if (a % 2 == 0)
              temp++;
      }
    System.out.println(temp);
  }

    static int digitcheck(int n) {
        if(n<0)
            n=n*(-1);
        return (int)(Math.log10(n))+1;
    }



}
/*OR

static int digitcheck(int n) {
    int i = 0;
    while (n >0) {
      n = n / 10;
      i++;
    }
    return i;


 */