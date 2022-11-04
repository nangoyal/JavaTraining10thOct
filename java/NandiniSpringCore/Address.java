package NandiniSpringCore;

public class Address {
//	fields
	private int addrId;
	private String city;
	private String state;
	
//	Constructors::
	public Address() {}
	public Address(int addrId, String city, String state) {
		super();
		this.addrId = addrId;
		this.city = city;
		this.state = state;
	}

//	Getters and Setters
	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
////		to print Address information use toString() method::
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
