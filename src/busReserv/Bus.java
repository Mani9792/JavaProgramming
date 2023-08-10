package busReserv;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int busNo,boolean ac,int capacity)
	{
		this.busNo =  busNo;
		this.ac = ac;
		this.capacity = capacity;
	}

	//getters and setters methods to access the variables from Main method
	
	public int getBusNo()   //accessor method
	{
		return busNo;
	}
	
	
	public int getCapacity()   //accessor method
	{
		return capacity;
	}
	
	public void setCapacity(int capacity) //mutator method
	{
		this.capacity = capacity;
	}
	
	public boolean isAc()
	{
		return ac;
	}
	
	public void setAc(boolean ac)
	{
		this.ac = ac;
	}
	
	//To display the Bus Info

	public void displayBusInfo()
	{
		System.out.println("Bus No: "+busNo+ " AC: "+ac+ " Capacity: "+capacity);
	}
	
}
