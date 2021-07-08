
public class Country {
	String name; 
	int area, population, popDensity;
	public Country(String name, int area, int population)
	{
		this.name = name;
		this.area = area;
		this.population = population;
		popDensity = population/area;
	}
	
	public void getLargestArea(Country country1, Country country2 )
	{
		if(country2.area > this.area & country2.area > country1.area)
			System.out.println("Name: "+country2.name +" Area:"+ country2.area +" Popoulation: "+ country2.population);
		else if(country1.area > this.area & country1.area > country2.area)
			System.out.println("Name: "+country1.name +" Area:"+ country1.area +" Popoulation: "+ country1.population);
		else if(this.area > country2.area & this.area > country1.area)
			System.out.println("Name: "+this.name +" Area:"+ this.area +" Popoulation: "+ this.population);
	}
	
	public void getLargestPopulation(Country country1, Country country2 )
	{
		if(country2.population > this.population & country2.population > country1.population)
			System.out.println("Name: "+country2.name +" Area:"+ country2.area +" Popoulation: "+ country2.population);
		else if(country1.population > this.population & country1.population > country2.population)
			System.out.println("Name: "+country1.name +" Area:"+ country1.area +" Popoulation: "+ country1.population);
		else if(this.population > country2.population & this.population > country1.population)
			System.out.println("Name: "+this.name +" Area:"+ this.area +" Popoulation: "+ this.population);
	}
	
	public void getLargestPopDensity(Country country1, Country country2 )
	{
		if(country2.popDensity > this.popDensity & country2.popDensity > country1.popDensity)
			System.out.println("Name: "+country2.name +" Area:"+ country2.area +" Popoulation: "+ country2.population);
		else if(country1.popDensity > this.popDensity & country1.popDensity > country2.popDensity)
			System.out.println("Name: "+country1.name +" Area:"+ country1.area +" Popoulation: "+ country1.population);
		else if(this.popDensity > country2.popDensity & this.popDensity > country1.popDensity)
			System.out.println("Name: "+this.name +" Area:"+ this.area +" Popoulation: "+ this.population);
	}
}
