
public class Program5 {
	public static void main(String args[])
	{
		//String name, int area, int population
		Country china = new Country("china", 3705407, 1373541278);
		Country canada = new Country("canada", 3855100, 35151728);
		Country bahrain = new Country("bahrain", 295, 1378000);
		
		china.getLargestArea(canada, bahrain);
		china.getLargestPopulation(canada, bahrain);
		china.getLargestPopDensity(canada, bahrain);
	}

}
