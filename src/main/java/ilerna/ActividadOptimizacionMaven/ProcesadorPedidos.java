package ilerna.ActividadOptimizacionMaven;

import java.util.ArrayList;


/**
 * Código inicial para la práctica de refactorización.
 * Criterios: Nombres genéricos, números mágicos y métodos con demasiadas responsabilidades.
 */
public class ProcesadorPedidos {
 
 
    private static final double GASTOS_ENVIO = 15.95;
	private static final double DESCUENTO = 0.10;
	private static final double IVA = 0.21;

	public double procesar(ArrayList<String> listaNombres, ArrayList<Double> precios) {
        double totalSinImpuestos = 0;
        
        // Sumar precios de la lista
        for (int i = 0; i < precios.size(); i++) {
            System.out.println("Añadiendo producto: " + listaNombres.get(i));
            totalSinImpuestos = totalSinImpuestos + precios.get(i);
        }
        
        // Lógica de descuento (Magic Number 100 y 0.10)
        if (totalSinImpuestos > 100) {
            System.out.println("Descuento aplicado.");
            totalSinImpuestos = totalSinImpuestos - (totalSinImpuestos * DESCUENTO); 
        }
        
        // Cálculo de impuestos (Magic Number 0.21)
        double totalConImpuestos = calcularIVA(totalSinImpuestos);
        
        // Gastos de envío (Magic Number 500 y 15.95)
        return calcularGastosEnvio(totalConImpuestos);
    }

	private double calcularGastosEnvio(double totalConImpuestos) {
		if (totalConImpuestos < 500) {
            totalConImpuestos = totalConImpuestos + GASTOS_ENVIO;
        }
        
        return totalConImpuestos;
	}

	private double calcularIVA(double totalSinImpuestos) {
		double totalConImpuestos = totalSinImpuestos + (totalSinImpuestos * IVA);
		return totalConImpuestos;
	}
}
