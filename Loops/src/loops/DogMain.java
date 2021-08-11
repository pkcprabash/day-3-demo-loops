package loops;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] array = {new Dog(2,4,"black"), new Dog(3,4,"golden"), new Dog(1,4,"white"),
				new Dog(4,4, "black"), new Dog(5,4,"golden")};
		
		//For Loop
		System.out.println("Dogs in reverse order: ");
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		
		int index=0;
		System.out.println("\nDogs with black color: ");
		while(index<array.length) {
			if(array[index].getColor().equals("black")) System.out.println(array[index]);
			index++;
		}
	}

}
