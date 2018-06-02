package proyectoredneuronal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daayt
 */
public class dataset {
 private List <String> listaCaracter ;
    private String ruta;

    public dataset(String ruta) {
        this.ruta = ruta;
         this.listaCaracter = new ArrayList<>();
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void lee() {
        BufferedReader br = null;
        // List <Accidente> listaAccidentes = new ArrayList<>();
        try {
            File miArchivoDatos = new File(ruta);
            br = new BufferedReader(new FileReader(miArchivoDatos));
            //br.readLine(); // Salto la primera línea

            String linea = "";
            String linea2 = "";
            String linea3 = "";
            String r ="";
             String[] linea4 = new String[200];
            char[][] matriz = new char[200][200];
            
            while ((linea = br.readLine()) != null) {
          //      linea3 += linea+"\n";
                listaCaracter.add(linea+"\n");
 
          
              //  linea2 += linea.replace("#", "1").replace(".", "-1").replace("@", "1").replace("o", "-1")+"\n";
//                linea2 = linea.replace(".", "-1");
              //  linea3 = linea.replace("@", "1").replace("o", "-1");
//                linea2 = linea.replace("o", "-1");
             //   System.out.println(linea2);
            //    System.out.println(linea3);
//                System.out.println(linea);
//                String[] elementos = linea.split(",");
//                String cFecha = elementos[0];
//                int edad = 0;
//                if(!elementos[2].equalsIgnoreCase("sin dato")) {
//                    edad = Integer.parseInt(elementos[2]);
//                }
//                String sexo = elementos[3];
//                String dia = cFecha.substring(0, 2);
//                String mes = cFecha.substring(3, 5);
//                String a = cFecha.substring(6, 10);
//                String hora = cFecha.substring(11, 13);
//                String minuto = cFecha.substring(14, 16);
                //        System.out.println(dia);
//        System.out.println(mes);
//        System.out.println(a);
//        System.out.println(hora);
//        System.out.println(minuto);

//                Date d = new Date(Integer.parseInt(a), Integer.parseInt(mes), Integer.parseInt(dia), Integer.parseInt(hora), Integer.parseInt(minuto));
//          // Fin de conversión de línea a objeto
//                
//                Accidente ac = new Accidente(d, edad, sexo);
//                
//                // Agrego un accidente a la lista
//               listaAccidentes.add(ac);
//             
            }
          //    System.out.print(listaCaracter);
             
              for (int i = 0; i < listaCaracter.size(); i++) {
                  for (int j = 0; j < 7; j++) {
                      
                    //    r = listaCaracter.get(i).substring(j);
                 //     System.out.print(listaCaracter.get(i));
//                        String[] c += listaCaracter;
//                .substring(c);
//                  r += Acci+"\n";
              
                  }
             // r+="\n";
            }
              System.out.print(listaCaracter);
          //  char c[]=  linea3.toCharArray();
            char d[] =new char[200];
            int cont=0;
            String cad="";
            String f[]= new String[200];
         //   char g[]=hola.toCharArray();
//            for (int i = 0; i < linea3.length(); i++) {
//                if (linea.!=null) {
//                   
//                    
//                    
//                }
//            }
//            for (int i = 0; i < 189; i++) {
////               if (cont<=7) {
////                         matriz[i][cont]=c[cont]; 
////                         cont++;
////                    }
////                    cont=1;
//                    if (i<=50) {
//                     d[i] = c[i]; 
////                         cont++;
//                }
////                for (int j = 0; j < 7; j++) {
////                    
////                  
////                }
//            }
//          
//            System.out.println("------\n");
//            System.out.println(d);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dataset.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(dataset.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(dataset.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
