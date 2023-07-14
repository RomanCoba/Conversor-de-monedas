import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	
	public static void main(String[] args){
		
		 String[] menu = {"Conversor de moneda", "Conversor de Temperatura"}; //tipos de conversion
		 String opcionConversion = null; //variable para guardar el tipo de conversion
		 //double cantidadDinero = 0.0; //variable para guardar la cantidad de dinero a convertir
		 String[] monedas = {"De Pesos a Dolar","De Pesos a Euros","De Pesos a Libras Esterlinas",
				 "De Pesos a Yen Japonés","De Pesos a Won sul-coreano","De Dolar a Pesos",
				 "De Euros a Pesos","De Libras Esterlinas a Pesos","De Yen Japonés a Pesos","De Won sul-coreano a Pesos"};
		 String opcionMoneda = null;
		// double conversion = 0.0; //variable para guardar la cantidad convertida
		 
		 BigDecimal cantidadDinero = new BigDecimal("0.0"); //variable para guardar la cantidad de dinero convertida
		 String dineroRecibido = null; //variable para guardar la cantidad de dinero recibida
	     //BigDecimal conversion = new BigDecimal("0.0");
	     BigDecimal dolar = new BigDecimal("0.059");
	     BigDecimal euro = new BigDecimal("0.053");
	     BigDecimal libra = new BigDecimal("0.045");
	     BigDecimal yen = new BigDecimal("8.2");
	     BigDecimal won = new BigDecimal("75.19");
	     
	     
	     
	 
		 
		 

		 //cuadro de dialogo para elegir la opcion de conversion
	    opcionConversion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
	    		"Menu",JOptionPane.QUESTION_MESSAGE, null,menu,menu[0]);
	    
	    //acciones para la opcion de conversion de monedas
	    if(opcionConversion == "Conversor de moneda") {
	    	
	    	//cuadro de dialogo para recbir cantidad de dinero
	    	dineroRecibido = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir:");
	    	
	    	//cantidadDinero(JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir:"));
	    	
	    	//validacion de solo numeros
	    	if(dineroRecibido.matches("[0-9]*")) {
	    		cantidadDinero = BigDecimal.valueOf(Double.parseDouble(dineroRecibido));
	    		
	    		//cuadro de dialogo para elegir el tipo de moneda a convertir
		    	opcionMoneda = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
			    		"Menu",JOptionPane.QUESTION_MESSAGE, null,monedas,monedas[0]);
		    	
		    	//switch para hacer la conversion a la moneda elegida
		    	switch (opcionMoneda) { 
		        case "De Pesos a Dolar":
		        	//conversion = Math.round(cantidadDinero * 0.059);
		        	cantidadDinero = cantidadDinero.multiply(dolar);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " dolares");
		         break;
		        case "De Pesos a Euros":
		        	cantidadDinero = cantidadDinero.multiply(euro);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " euros");
		         break;
		        case "De Pesos a Libras Esterlinas" :
		        	cantidadDinero = cantidadDinero.multiply(libra);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " libras esterlinas");;
		         break;
		        case "De Pesos a Yen Japonés":
		        	cantidadDinero = cantidadDinero.multiply(yen);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " yenes");
		         break;
		        case "De Pesos a Won sul-coreano":
		        	cantidadDinero = cantidadDinero.multiply(won);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " wones");
		         break;
		        case "De Dolar a Pesos" :
		        	cantidadDinero = cantidadDinero.divide(dolar,2, RoundingMode.HALF_EVEN);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " pesos");
		         break;
		        case "De Euros a Pesos" :
		        	cantidadDinero = cantidadDinero.divide(euro,2, RoundingMode.HALF_EVEN);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " pesos");
			         break;
		        case "De Libras Esterlinas a Pesos" :
		        	cantidadDinero = cantidadDinero.divide(libra,2, RoundingMode.HALF_EVEN);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " pesos");
		         break;
		        case "De Yen Japonés a Pesos":
		        	cantidadDinero = cantidadDinero.divide(yen,2, RoundingMode.HALF_EVEN);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " pesos");
		         break;
		        case "De Won sul-coreano a Pesos":
		        	cantidadDinero = cantidadDinero.divide(won,2, RoundingMode.HALF_EVEN);
		        	JOptionPane.showMessageDialog(null, "Tienes " + cantidadDinero + " pesos");
		         break;
		        default:
		        	JOptionPane.showMessageDialog(null, "ADIOS");
		      }
			}else {
				JOptionPane.showMessageDialog(null, "Valor no valido");
			}
	    	
	    	

	    	
	    	
	    }
	    
	    

	    // favoritePizza will be null if the user clicks Cancel
	    //System.out.printf("Conversion elegida es:  %s.\n", opcionConversion);
	    
	    System.exit(0);

    }

}
