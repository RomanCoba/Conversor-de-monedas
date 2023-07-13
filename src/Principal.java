import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args){
		
		 String[] menu = {"Conversor de moneda", "Conversor de Temperatura"}; //tipos de conversion
		 String opcionConversion = null; //variable para guardar el tipo de conversion
		 double cantidadDinero = 0; //variable para guardar la cantidad de dinero a convertir
		 String[] monedas = {"De Pesos a Dolar","De Pesos a Euros","De Pesos a Libras Esterlinas",
				 "De Pesos a Yen Japonés","De Pesos a Won sul-coreano","De Dolar a Pesos",
				 "De Euros a Pesos","De Libras Esterlinas a Pesos","De Yen Japonés a Pesos","De Won sul-coreano a Pesos"};
		 String opcionMoneda = null;
		 

		 //cuadro de dialogo para elegir la opcion de conversion
	    opcionConversion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
	    		"Menu",JOptionPane.QUESTION_MESSAGE, null,menu,menu[0]);
	    
	    //acciones para la opcion de conversion de monedas
	    if(opcionConversion == "Conversor de moneda") {
	    	
	    	cantidadDinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir:"));
	    	opcionMoneda = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
		    		"Menu",JOptionPane.QUESTION_MESSAGE, null,monedas,monedas[0]);
	    	
	    }
	    
	    

	    // favoritePizza will be null if the user clicks Cancel
	    //System.out.printf("Conversion elegida es:  %s.\n", opcionConversion);
	    
	    System.exit(0);

    }
}
