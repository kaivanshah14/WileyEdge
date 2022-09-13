import java.util.Objects;

public class Day5 {
	
    private String name;
    private int age;
	
	@Override
	public int hashCode() {
		return age+1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Day5 other = (Day5) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public Day5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Day5 [name=" + name + ", age=" + age + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args) {
		Day5 d = new Day5("Kaivan", 21);
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.hashCode());
		
		Day5 d2 = new Day5("Kaivan",20);
		System.out.println(d2.equals(d));
	}

}
