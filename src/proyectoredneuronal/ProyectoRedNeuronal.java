
package proyectoredneuronal;

/**
 *
 * @author daayt
 */
public class ProyectoRedNeuronal {

    public static void main(String[] args) {
        // TODO code application logic here
        String ruta="C:\\Users\\daayt\\Documents\\Maestria MCA1\\3er cuatrimestre\\Computo inteligente\\TRAIN.txt";
        dataset2 ds = new dataset2(ruta);
       // ds.lee();
      // ds.MiDataset();
      //ds.enteros();
        //System.out.println("n: "+ds.enteros());
        
        //----------------------
       
     //   ds.readTxt2();
      //  ds.res();
      Perceptron NA = new Perceptron();
      NA.entrenamiento2();
      
    }
    
}
