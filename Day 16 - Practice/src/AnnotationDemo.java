// Java Program illustrating Use of Custom Annotation

// Importing input output classes
import java.io.*;

// Sample for marker annotation:
// Custom annotation declaration
@interface books_data
{
	// Multiple variable declaration
	String book_name();
	int book_price();
	String author();
}

// Using the custom Annotation
@books_data(book_name = "Effective Java", book_price = 30,
			author = "Joshua Bloch")

// Class 1
class book_store {
}

// Class 2
public class AnnotationDemo {

	// Main driver method
	public void main(String[] args)
	{
		// Print statement
		System.out.println(books_data.class);
		System.out.println();
		System.out.println("how to use the annotations");
	}
	
	public static void main(Object[] args) {
		System.out.println("2nd main");
	}
}
