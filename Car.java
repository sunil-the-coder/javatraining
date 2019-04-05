public class Car
{
	private int model;
	private String name;

	public Car(int model, String name) {
		this.name = name;
		this.model = model;
	}

	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj != null && obj instanceof Car) {
			//content comparison
			Car c2 = (Car)obj;
			//if(this.model == c2.model)
		
			if(this.name.equals(c2.name))
				return true;
		}

		return false;
	}

	public static void  main(String[] args)
	{
		Car c1 = new Car(10,"BMW");
		Car c2 = new Car(10,"Swift");

		System.out.println(c1.equals(c2));
	}
}

