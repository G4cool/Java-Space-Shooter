import javax.swing.JOptionPane;

public class VirtualPetEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Pet myPet = new Pet();
			
			myPet.name = "Spike";
	        myPet.type = "Dog";
	        myPet.color = "black";
	        
	        JOptionPane.showMessageDialog(null, "My pet's name is " + myPet.name);
	        JOptionPane.showMessageDialog(null, "My pet is a " + myPet.type);
	        JOptionPane.showMessageDialog(null, "My pet's hair color is " + myPet.color);
		
	}

}
