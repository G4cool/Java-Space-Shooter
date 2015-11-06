import javax.swing.JOptionPane;

public class VirtualPetEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet myPet = new Pet();
		 
        JOptionPane.showMessageDialog(null, "My pet's name is " + myPet.name);
        JOptionPane.showMessageDialog(null, "My pet is a " + myPet.type);
        JOptionPane.showMessageDialog(null, "My Pet's hair color is " + myPet.color);
        
        JOptionPane.showMessageDialog(null, "Calories before running: " + myPet.calories);
        
        myPet.run();
         
        JOptionPane.showMessageDialog(null, "Calories after running: " + myPet.calories);
         
        myPet.eat(800);
         
        JOptionPane.showMessageDialog(null, "Calories after eating: " + myPet.calories);
		
	}

}
