package Array;

public class canPlaceFlowers {

public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	int length = flowerbed.length;
    int count = 0;

    for (int i = 0; i < length; i++) {
        if (flowerbed[i] == 0) {
            boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
            boolean emptyRight = (i == length - 1 || flowerbed[i + 1] == 0);

            if (emptyLeft && emptyRight) {
                flowerbed[i] = 1; // plant flower
                count++;
                if (count >= n) return true;
            }
        }
    }

    return count >= n;
	}
	public static void main(String[] args) {
		int[] fl= {1,0,0,0,0,0,1};
		int n=3;
		System.out.println(canPlaceFlowers(fl, n));

	}

}
