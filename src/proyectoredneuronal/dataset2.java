package proyectoredneuronal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daayt
 */
public class dataset2 {

    private List<String> listaCaracter;
    private String ruta;
    private int filas;
    private int columnas;
    private String vector = "";

    public dataset2(String ruta) {
        this.ruta = ruta;
        this.listaCaracter = new ArrayList<>();
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String[][] lee() {
        String[][] m = new String[1698][8];
        String[][] r = new String[1698][8];
        int[][] r2 = new int[1698][8];
        int t = 0;
        FileReader fr = null;
        try {

            //  char[][] m=new char[2000][7];
            File miArchivo = new File(ruta);
            fr = new FileReader(miArchivo);
            //  System.out.println("\n");
            int c = 0, i = 0, k = 0;
            int f = 0;
            //s.useDelimiter("[;\n]");
            //  char c2= ' ';
            while (c != -1) {
                // do {

                // char c2= (char)c;
                //   System.out.print(c2);
                if (i < 7) {
                    c = fr.read();
                    //  System.out.println("entre "+f);
                    m[f][i] = Character.toString((char) c);
                    //  System.out.print(""+m[f][i]);
                    if (m[f][i].equals("#") || m[f][i].equals(".") || m[f][i].equals("@") || m[f][i].equals("o")) {
                        //  System.out.println("------------------------------------");
                        r[f][i] = m[f][i].replace("#", "1").replace(".", "-1").replace("@", "1").replace("o", "-1");
                        //   r[f][i] = m[f][i].replace("#", "1").replace(".", "1").replace("@", "1").replace("o", "1");
                        //  System.out.println("------");
                        // r2[f][i]= Integer.parseInt(r[f][i]);

                        //      System.out.println("------");
                        r2[f][i] = Integer.parseInt(r[f][i]);
                        System.out.print(r2[f][i]);
                        t++;
                    }
                    //111-1-111

                    i++;
                    if (k == 1698) {//1698 caracteres tiene el dataset
                        break;
                    }
                    k++;

                } else {
                    System.out.println("");
                    i = 0;
                    t = 0;
                    f++;

                }

                // System.out.print(m);
            }// while (c != -1);

            System.out.println("\nel total es: " + t);
        } catch (FileNotFoundException ex) {//si no encuentra el archivo
            Logger.getLogger(dataset2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {//si no se puede leer el alchivo
            Logger.getLogger(dataset2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("se acabo el archivo");
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(dataset2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;

    }
//
//    public int[][] MiDataset() {
//        int[][] dataset = new int[2000][7];
//        String[][] dataset2 = new String[2000][7];
//        dataset2 = lee();
//        for (int i = 0; i < 189; i++) {
//            for (int j = 0; j < 7; j++) {
////                  dataset2[i][j]= m[i][j];
////                dataset[i][j]= Integer.parseInt(m[i][j]);
//                //  dataset[i][j] = Integer.parseInt(dataset2[i][j].trim());
//                if (dataset2[i][j].equals(" ") && dataset2[i][j].equals("\n")) {
//                    System.out.println("entre -----");
//                }
//                System.out.print(dataset2[i][j]);
//            }
//        }
//        return dataset;
//    }

    public BufferedReader getBuffered(String link) {

        FileReader lector = null;
        BufferedReader br = null;
        try {
            File Arch = new File(link);
            if (!Arch.exists()) {
                System.out.println("No existe el archivo");
            } else {
                lector = new FileReader(link);
                br = new BufferedReader(lector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return br;
    }

    public int[][] readTxt() {
        int[][] r2 = new int[1698][8];
        try {
            //ruta de tu archivo
            String ruta = "C:\\Users\\daayt\\Documents\\Maestria MCA1\\3er cuatrimestre\\Computo inteligente\\TRAIN.txt";
            BufferedReader br = getBuffered(ruta);
            //leemos la primera linea
            String linea = br.readLine();
            //String linea = "";
            //creamos la matriz vacia
            char[][] cad = new char[1698][8];

            //contador
            int contador = 0;
            while (linea != null) {
                char[] values = linea.toCharArray();
                //String[] values = linea.split(",");
                //recorremos el arrar de string
                for (int i = 0; i < values.length; i++) {
                    //se obtiene el primer caracter de el arreglo de strings
                    if (values[i] == '#' || values[i] == '@') {
                        //1
                        values[i] = '1';
                        cad[contador][i] = values[i];
                        r2[contador][i] = Integer.parseInt(Character.toString(cad[contador][i]));
                        System.out.print("" + r2[contador][i]);
                    } else {
                        //.replace("#", "1").replace(".", "-1").replace("@", "1").replace("o", "-1")
                        // values[i]='-1';
                        cad[contador][i] = values[i];
                        String c = "-1";
                        r2[contador][i] = Integer.parseInt(c);
                        System.out.print("" + r2[contador][i]);
                    }
                    //   cad[contador][i] = values[i];
                    // System.out.print(""+ cad[contador][i]);
                }
                System.out.println("");
                contador++;
                linea = br.readLine();
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return r2;
    }

    public int[] readTxt2() {
        String linea2 = "";
        int[] r3 = new int[1698];
        try {
            //ruta de tu archivo
            String ruta = "C:\\Users\\daayt\\Documents\\Maestria MCA1\\3er cuatrimestre\\Computo inteligente\\TRAIN.txt";
            BufferedReader br = getBuffered(ruta);
            //leemos la primera linea
            String linea = br.readLine();
            //String linea = "";
            //creamos la matriz vacia
            char[][] cad = new char[1698][8];

            //contador     
            int contador = 0;
            while (linea != null) {
                linea2 += linea;
                linea = br.readLine();
            }

            //   System.out.println(linea2);
            char[] v2 = new char[1698];
            char[] v = linea2.toCharArray();
            int j = 0;
            for (int i = 0; i < v.length; i++) {
                v2[i] = v[i];
                j = i;
                // System.out.print(v2[i]);
                if (v[i] == '#' || v[i] == '@') {
                    v[i] = '1';
                    r3[i] = Integer.parseInt(Character.toString(v[i]));
                    //System.out.print(""+r3[i]);
                    System.out.print("" + r3[i]);
//                  

                } else {
                    String c = "-1";
                    r3[i] = Integer.parseInt(c);
                    //  System.out.print(""+ r3[i]);
                    System.out.print("" + r3[i]);

                }

            }
            System.out.println("\n\ntoel: " + j);
            System.out.println("\n\ntoel: " + v.length);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return r3;
        //  return linea2;
    }

//    public int[] res() {
//        //    vector= readTxt2();
//        System.out.println("---- " + vector.length());
//        int[] r3 = new int[1698];
//        char[][] cad = new char[1698][8];
//        String linea2 = "";
//        //contador     
//        int contador = 0;
//        char[] v = vector.toCharArray();
//        for (int i = 0; i < v.length; i++) {
//            if (v[i] == '#' || v[i] == '@') {
//                v[i] = '1';
//                r3[i] = Integer.parseInt(Character.toString(v[i]));
//                System.out.print("" + v[i]);
//                contador++;
//                if (contador == 6) {
//                    System.out.println("");
//                    contador = 0;
//                }
//            } else {
//                String c = "-1";
//                r3[i] = Integer.parseInt(c);
//                System.out.print("" + r3[i]);
//                contador++;
//                if (contador == 6) {
//                    System.out.println("");
//                    contador = 0;
//                }
//            }
//
//        }
//        return r3;
//    }

//    public void pasaDatos(){
//        int[] a=new int[5];
//        int[] b=new int[5];
//        
//        for (int i = 0; i < a.length; i++) {
//            a[i]=i*2;
//        }
//        b=a;
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
//    }
    public void enteros() {
        String[][] a = {{"1", "2", "3", "-5"}, {"-6", "7", "-8", "9"}};
        int[][] b = new int[2][8];
        // System.out.println("--"+a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = Integer.parseInt(a[i][j].replace("1", "10").replace("2", "20").replace("-6", "60").replace("-8", "80"));
                System.out.println(b[i][j]);
            }

        }

    }
}
