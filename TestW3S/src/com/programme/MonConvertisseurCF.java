/**
 * 
 */
package com.programme;
import com.w3schools.xml.TempConvert;
import com.w3schools.xml.TempConvertSoap;

/**
 * @author Camille
 *
 */
public class MonConvertisseurCF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//j'instancie un nouvel objet de type TempConvert
		TempConvert monImageObjet = new TempConvert() ;
		
		//Je fais appel a une m�thode de cet objet pour avoir une image de mon interface disposant des m�thodes de conversions
		TempConvertSoap convertisseur = monImageObjet.getTempConvertSoap() ;
		
		//Je d�clare et initialise 2 variables pour faire des test, une en C, une en F
		String temperatureC = "40" ;
		String temperatureF = "104" ;
		
		//Je fais appel aux m�thodes de conversion et j'affiche le r�sultat
		System.out.println(temperatureC +"�C = " +convertisseur.celsiusToFahrenheit(temperatureC) +" �F" );
		System.out.println(temperatureF +"�F = " +convertisseur.fahrenheitToCelsius(temperatureF) +" �C" );
		

	}

}
