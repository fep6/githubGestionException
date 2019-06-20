package PackageGestionException;

public class Main {
	// https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/22107-gerez-les-exceptions#/id/r-2181836
	public static void main(String[] args) {
		
		int i=0 , j=20;
		
		try {
			System.out.println(" =>" +(j/i));
		} catch (ArithmeticException e){
			System.out.println("Division par zéro!  " + e.getMessage());
		} finally {
			System.out.println("Action faite systématiquement");
		}

	}

}
//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/22107-gerez-les-exceptions#/id/r-2181880