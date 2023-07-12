import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args){
		
		 String[] menu = {"Conversor de moneda", "Conversor de Temperatura"};

		 //cuadro de dialogo para elegir la opcion de conversion
	    String opcionConversion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión","Menu",JOptionPane.QUESTION_MESSAGE, null,menu,menu[0]);

	    // favoritePizza will be null if the user clicks Cancel
	    System.out.printf("Conversion elegida es:  %s.\n", opcionConversion);
	    System.exit(0);

    }
}
