public class HelloWorld {

	public static void main(String[] args) {

		// print a message
		System.out.println("Hello World");

		// initiallize a String callled name
		String name = "Paul";

		// create an object of the StringBuidler class that we shall use to add to the
		// name String
		StringBuilder nameBuilder = new StringBuilder();

		// add Tunda to the name
		nameBuilder.append(name + " Tunda");

		// create a cobined String
		String fullName = nameBuilder.toString();

		// print the full name
		System.out.println(fullName);

		// extract the first name and last name from the fullname
		int indexOfSpace = fullName.indexOf(' ');
		String firstName = fullName.substring(0, indexOfSpace);
		String lastName = fullName.substring (indexOfSpace + 1);

		// print a message to the user
		System.out.printf("This order is for %s, %s", lastName, firstName);

	}

}
