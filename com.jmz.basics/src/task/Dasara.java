package task;

public class Dasara {
	static int height = 5;
	static int width = (2 * height) - 1;

	public static void main(String[] args) {
		printH();
	}

	static void printH() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((j == height - 1) || (i == height / 2))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
		System.out.println();
		printA();
	}

	static void printA() {
		int n = width / 2, i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			n--;
		}
		System.out.println();
		printP();
	}

	static void printP() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height / 2) && j < height - 1)
					System.out.printf("*");
				else if (i < height / 2 && j == height - 1 && i != 0)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
		System.out.println();
		printP1();
	}

	static void printP1() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height / 2) && j < height - 1)
					System.out.printf("*");
				else if (i < height / 2 && j == height - 1 && i != 0)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
		System.out.println();
		printY();
	}

	static void printY() {
		int i, j, counter = 0;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= height; j++) {
				if (j == counter || j == height - counter && i <= height / 2)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			if (i < height / 2)
				counter++;
		}
		System.out.println();
		printD();
	}

	static void printD() {
		int i, j;
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height - 1) && j < height - 1)
					System.out.printf("*");
				else if (j == height - 1 && i != 0 && i != height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
		System.out.println();
		printA1();
	}

	static void printA1() {
		int n = width / 2, i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			n--;
		}
		System.out.println();
		printS();
	}

	static void printS() {
		int i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j < height; j++) {
				if ((i == 0 || i == height / 2 || i == height - 1))
					System.out.printf("*");
				else if (i < height / 2 && j == 0)
					System.out.printf("*");
				else if (i > height / 2 && j == height - 1)
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
		System.out.println();
		printA2();
	}

	static void printA2() {
		int n = width / 2, i, j;
		for (i = 0; i < height; i++) {
			for (j = 0; j <= width; j++) {
				if (j == n || j == (width - n) || (i == height / 2 && j > n && j < (width - n)))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
			n--;
		}
		System.out.println();
		printR();
	}

	static void printR() {
		int i, j, half = (height / 2);
		for (i = 0; i < height; i++) {
			System.out.printf("*");
			for (j = 0; j < width; j++) {
				if ((i == 0 || i == half) && j < (width - 2))
					System.out.printf("*");
				else if (j == (width - 2) && !(i == 0 || i == half))
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
		System.out.println();
		printA3();
	}

	static void printA3()
	{
	    int n = width / 2, i, j;
	    for (i = 0; i < height; i++)
	    {
	        for (j = 0; j <= width; j++)
	        {
	            if (j == n || j == (width - n)
	                || (i == height / 2 && j > n
	                    && j < (width - n)))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	        n--;
	    }
	    System.out.println();
	}

}
