package gna;

import static java.lang.Math.log;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import java.util.Random;

/**
 *
 * @author Mauricio
 */
public class Distribuicoes {
    
    public static double exponencial(double valor_medio){
        Random random = new Random();
        return -valor_medio * Math.log(random.nextDouble());
    }
    
    public static double normal(double media, double variancia){
        Random random = new Random();
        double z = sqrt(-2 * log(random.nextDouble())) * sin( 2 * Math.PI * random.nextDouble());
        return media + (variancia * z);
    }
    
    public static double triangular(double valor_min,double valor_max, double moda){
        Random random = new Random();
        double r = random.nextDouble();
        if (r < ((moda - valor_min)/valor_max-valor_min)) 
        {
            return (valor_min + sqrt(r * (moda - valor_min)*(valor_max - valor_min)));
        }
        return (valor_max - sqrt((1 - r)*(valor_max - moda)*(valor_max - valor_min)));
    }
    
    public static double uniforme(double a,double b){
        Random random = new Random();
        return a + ((b - a)*random.nextDouble());
    }
    
}
