class Loops{
	public int addArray(int arr[], String type) {
		int sum = 0, i=0;
		
		if(type=="for") {
			for(i=0; i<arr.length; i++) {
				sum+=arr[i];
				if(sum>5) break;
			}
		}
		
		else if(type=="while") {
			while(i<arr.length) {
				sum+=arr[i];
				if(sum==6) continue;
				i++;
			}
		}
		
		else {
			do {
				sum+=arr[i];
				i++;
			} while(i<arr.length);
		}
		
		return sum;
	}
	public void switch_case(int x) {
		System.out.println("Switch case Number="+x);
		switch(x) {
		case 1:
			System.out.println("First Number");
			break;
		case 2:
			System.out.println("Second number");
			break;
		
			default:
				System.out.println("Random number");
		}
		System.out.println();
	}

}

class Demo
{
    Demo(String name)
    {
        System.out.println("Constructor with one " +
                      "argument - String : " + name);
    }
 
    Demo(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
 
    }
    Demo(long id)
    {
        System.out.println("Constructor with one argument : " +
                                            "Long : " + id);
    }
}

public class Main {
	
	public static void main(String[] args) {
		
		Loops l = new Loops();
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(l.addArray(arr, "for"));
		System.out.println("----------");
		System.out.println(l.addArray(arr, "while"));
		System.out.println("----------");
		System.out.println(l.addArray(arr, "do while"));
		System.out.println("----------");
		l.switch_case(1);
		l.switch_case(2);
		l.switch_case(12);
		
        Demo demo2 = new Demo("Shikhar");
        Demo demo3 = new Demo("Dharmesh", 26);
        Demo demo4 = new Demo(325614567);
	}
	
}
