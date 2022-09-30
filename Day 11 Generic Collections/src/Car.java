

public class Car {
	String modelNo;
	int id;
	Car(String modelNo, int id){
		this.modelNo=modelNo;
		this.id = id;
	}
	public String toString() {
		return modelNo + " " + id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Car c = (Car) obj;
		return this.id==c.id && this.modelNo.equals(c.modelNo);
	}

}