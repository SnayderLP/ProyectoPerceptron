
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
//        ds.pasaDatos();
        //----------------------
       
     //   ds.readTxt2();
//      //  ds.res();
//      Perceptron NA = new Perceptron();
//      NA.entrenamiento2();
        
        Perceptron A= new Perceptron("A");
//        A.entrenamiento2();
           A.creaNeurona();
         Perceptron B= new Perceptron("B");
//        B.entrenamiento2();
        B.creaNeurona();
        Perceptron C= new Perceptron("C");
//        C.entrenamiento2();
        C.creaNeurona();
        Perceptron D= new Perceptron("D");
//        D.entrenamiento2();
        D.creaNeurona();
        Perceptron E= new Perceptron("E");
//        E.entrenamiento2();
        E.creaNeurona();
        Perceptron J= new Perceptron("J");
//        J.entrenamiento2();
        J.creaNeurona();
        Perceptron K= new Perceptron("K");
//        K.entrenamiento2();
        K.creaNeurona();
    }
    
}
