import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args){
		
		 String[] menu = {"Conversor de moneda", "Conversor de Temperatura"}; //tipos de conversion
		 String opcionConversion = null; //variable para guardar el tipo de conversion
		 double cantidadDinero = 0; //variable para guardar la cantidad de dinero a convertir
		 String[] opcionMonedas = {};
		 String moneda = null;
		 

		 //cuadro de dialogo para elegir la opcion de conversion
	    opcionConversion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
	    		"Menu",JOptionPane.QUESTION_MESSAGE, null,menu,menu[0]);
	    
	    //acciones para la opcion de conversion de monedas
	    if(opcionConversion == "Conversor de moneda") {
	    	
	    	cantidadDinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir:"));
	    	moneda = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
		    		"Menu",JOptionPane.QUESTION_MESSAGE, null,menu,menu[0]);
	    }
	    
	    

	    // favoritePizza will be null if the user clicks Cancel
	    //System.out.printf("Conversion elegida es:  %s.\n", opcionConversion);
	    
	    System.exit(0);

    }
}
