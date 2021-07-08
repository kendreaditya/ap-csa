import java.util.*;
public class Program3 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), i = n%20000, x = 0;
		double sum =0;
		System.out.println(n%20000);

		while (x<i)
		{
			sum+=20000*(x/10.0);
			n-=20000;
			System.out.println(x/10.0);
			x++;
		}
		System.out.println(sum);
		System.out.println((n*.3)-sum);
	}

}

/*

It elucidates nature, literally, by picturing trees - on the left side of the image, and simultaneously explicates modern life by visualizing a city topped with glass buildings, and skyscrapers - on the right of the image. This connects the theme of the aphorism, nature and a person’s troubles in modern life; such as air pollution, acid rain (which is represented by the rain coming from the air pollution clouds above the city).

*/