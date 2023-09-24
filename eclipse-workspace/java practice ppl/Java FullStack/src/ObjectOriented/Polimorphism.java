package ObjectOriented;


class Phone
{
	private String model;
	 
	public Phone(String model)
	{
		this.model=model;
	}
	public void feature()
	{
		System.out.println("this is the feature phone");
	}
	public String getModel() {
		return model;
	}
	
}
class Samsung extends Phone
{
	private String model;

	public Samsung(String model) {
		super(model);
		this.model=model;
	}
	public void feature()
	{
		System.out.println("Smart phone");
	}
	public String getModel() {
		return model;
	}
	
}
class Nokia extends Phone
{

	public Nokia(String model) {
		super(model);
	}
	
}
public class Polimorphism {

	public static void main(String[] args) {
		Phone samsung = new Samsung("Samsung note 8");
		System.out.println(samsung.getModel());
		samsung.feature();
		
		Phone nokia = new Nokia("Nokia 115");
		System.out.println(nokia.getModel());
		nokia.feature();

	}

}
