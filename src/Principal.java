import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args){
		
		 String[] menu = {"Conversor de moneda", "Conversor de Temperatura"}; //tipos de conversion
		 String opcionConversion = null; //variable para guardar el tipo de conversion
		 double cantidadDinero = 0.0; //variable para guardar la cantidad de dinero a convertir
		 String[] monedas = {"De Pesos a Dolar","De Pesos a Euros","De Pesos a Libras Esterlinas",
				 "De Pesos a Yen Japonés","De Pesos a Won sul-coreano","De Dolar a Pesos",
				 "De Euros a Pesos","De Libras Esterlinas a Pesos","De Yen Japonés a Pesos","De Won sul-coreano a Pesos"};
		 String opcionMoneda = null;
		 double conversion = 0.0; //variable para guardar la cantidad convertida
		 

		 //cuadro de dialogo para elegir la opcion de conversion
	    opcionConversion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
	    		"Menu",JOptionPane.QUESTION_MESSAGE, null,menu,menu[0]);
	    
	    //acciones para la opcion de conversion de monedas
	    if(opcionConversion == "Conversor de moneda") {
	    	
	    	//cuadro de dialogo para recbir cantidad de dinero
	    	cantidadDinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir:"));
	    	//cuadro de dialogo para elegir el tipo de moneda a convertir
	    	opcionMoneda = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
		    		"Menu",JOptionPane.QUESTION_MESSAGE, null,monedas,monedas[0]);
	    	
	    	//switch para hacer la conversion a la moneda elegida
	    	switch (opcionMoneda) { 
	        case "De Pesos a Dolar":
	        	conversion = Math.round(cantidadDinero * 0.059);
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Pesos a Euros":
	        	conversion = cantidadDinero * 0.059;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Pesos a Libras Esterlinas" :
	        	conversion = cantidadDinero * 0.045;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Pesos a Yen Japonés":
	        	conversion = cantidadDinero * 8.19;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Pesos a Won sul-coreano":
	        	conversion = cantidadDinero * 75.1;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Dolar a Pesos" :
	        	conversion = cantidadDinero * 16.87;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Euros a Pesos" :
	        	conversion = cantidadDinero * 18.91;
	        	JOptionPane.showMessageDialog(null, conversion);
		         break;
	        case "De Libras Esterlinas a Pesos" :
	        	conversion = cantidadDinero * 22.13;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Yen Japonés a Pesos":
	        	conversion = cantidadDinero * 0.12;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        case "De Won sul-coreano a Pesos":
	        	conversion = cantidadDinero * 0.013;
	        	JOptionPane.showMessageDialog(null, conversion);
	         break;
	        default:
	        	JOptionPane.showMessageDialog(null, "ADIOS");
	      }

	    	
	    	
	    }
	    
	    

	    // favoritePizza will be null if the user clicks Cancel
	    //System.out.printf("Conversion elegida es:  %s.\n", opcionConversion);
	    
	    System.exit(0);

    }
}
