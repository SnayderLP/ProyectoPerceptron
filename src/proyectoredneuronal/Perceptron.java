package proyectoredneuronal;

/**
 *
 * @author daayt
 */
public class Perceptron {
    //atributos
//    private int[][] Funcion_OR = {{1, 0, 0},
//    {1, 0, 1},
//    {1, 1, 0},
//    {1, 1, 1}};

    //private int[][] Funcion_OR;
    private int[] Funcion_OR;
    private dataset2 Dataset;
    private int[] Xi;
    private int[] Wi;
    private int[] d;
    private double Net;
    private int y;
    private int[] IncrementoW;
     private int[] IncrementoW2;
    private final int umbral = 1;
    private int tasaAprendizaje;
    private int cont = 0;
    public Perceptron() {
        String ruta = "C:\\Users\\daayt\\Documents\\Maestria MCA1\\3er cuatrimestre\\Computo inteligente\\TRAIN.txt";
        Dataset = new dataset2(ruta);
        Funcion_OR = new int[1698];
        Wi = new int[64];
        IncrementoW = new int[64];
         IncrementoW2 = new int[64];
        y = 0;
        Wi = llenaPesos();
        Xi = new int[64];
        d = new int[21];
    }
    //gettersand setters
    public int getTasaAprendizaje() {
        return tasaAprendizaje;
    }

    public void setTasaAprendizaje(int tasaAprendizaje) {
        this.tasaAprendizaje = tasaAprendizaje;
    }

    public int[] getWi() {
        return Wi;
    }

    public void setWi(int[] Wi) {
        this.Wi = Wi;
    }
    
    
    //metodos
    public int[] creaNeurona(String name) {
        int[] d= new int[21];
        switch (name) {
            case "A":
                for (int i = 0; i < d.length; i++) {
                    if (i==0 || i==7 || i==14) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dA = {1, -1, -1, -1, -1, -1, -1,//A1
//                    1, -1, -1, -1, -1, -1, -1,//A2
//                    1, -1, -1, -1, -1, -1, -1};//A3
                break;

            case "B":
                 for (int i = 0; i < d.length; i++) {
                    if (i==1 || i==8 || i==15) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dB = {-1, 1, -1, -1, -1, -1, -1,//B1
//                    -1, 1, -1, -1, -1, -1, -1,//B2
//                    -1, 1, -1, -1, -1, -1, -1};//B3
                break;
            case "C":
                 for (int i = 0; i < d.length; i++) {
                    if (i==2 || i==9 || i==16) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dC = {-1, -1, 1, -1, -1, -1, -1,//C1
//                    -1, -1, 1, -1, -1, -1, -1,//C2
//                    -1, -1, 1, -1, -1, -1, -1};//C3
                break;
            case "D":
                 for (int i = 0; i < d.length; i++) {
                    if (i==3 || i==10 || i==17) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dD = {-1, -1, -1, 1, -1, -1, -1,//D1
//                    -1, -1, -1, 1, -1, -1, -1,//D2
//                    -1, -1, -1, 1, -1, -1, -1};//D3
//                break;
            case "E":
                 for (int i = 0; i < d.length; i++) {
                    if (i==4 || i==11 || i==18) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dE = {-1, -1, -1, -1, 1, -1, -1,//E1
//                    -1, -1, -1, -1, 1, -1, -1,//E2
//                    -1, -1, -1, -1, 1, -1, -1};//E3
                break;
            case "J":
                 for (int i = 0; i < d.length; i++) {
                    if (i==5 || i==12 || i==19) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dJ = {-1, -1, -1, -1, -1, 1, -1,//J1
//                    -1, -1, -1, -1, -1, 1, -1,//J2
//                    -1, -1, -1, -1, -1, 1, -1};//J3
                break;
            case "K":
                 for (int i = 0; i < d.length; i++) {
                    if (i==6 || i==13 || i==20) {
                        d[i]=1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }else{
                        d[i]=-1;
                        System.out.println("SALIDA_desaeada: "+d[i]);
                    }
                }
//                int[] dK = {1, -1, -1, -1, -1, -1, 1,//K1
//                    -1, -1, -1, -1, -1, -1, 1,//K2
//                    -1, -1, -1, -1, -1, -1, 1};//K3
                break;
            default:
                throw new AssertionError();
        }
        return d;
    }
    public void entrenamiento2(){//para la neurona A
        Funcion_OR = Dataset.readTxt2();
        for (int x = 0; x < 21; x++) {
            for (int i = 0; i < Wi.length; i++) {
                Xi[i] = Funcion_OR[i];
                Net += Xi[i] * Wi[i];
            }
            
            y = funcion_escalon(Net);
            System.out.println("Y: "+y);
            d = creaNeurona("A");
            
            IncrementoW2 = getIncrementos(1, d, y);
            Wi = nuevosPesos(IncrementoW2);
        }
    
//    public void entrenamiento() {//[1698][8], aqui debe recibir el umbral
//        Funcion_OR = Dataset.readTxt();
//        for (int i = 0; i < 1698; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (cont < 64) {
//                    if (cont==0) {
//                        Xi[cont]=umbral;//asigno el umbral antes de iniciar el arreglo
//                        Net += Xi[cont]*Wi[cont];
//                        cont++;
//                    }else{
//                     
//                    Xi[cont] = Funcion_OR[i][j];
//                    Net += Funcion_OR[i][j] * Wi[cont];   
//                    cont++;
//                    }
//                }
//                if (cont ==63) {
//                    cont=0;
//                }
//                
//                y[j] = funcion_escalon(Net);//salida obtenida
//           
//            }
//                 getIncrementos(y);//ver si esto va aqui o quitar
//        }
    }
//    
    //devuelve un arreglo con los incrementos para cada neurona
    public int[] getIncrementos(int alfa, int[] d, int y){
        tasaAprendizaje = alfa;
        for (int i = 0; i < IncrementoW.length; i++) {
          
                 IncrementoW[i] = tasaAprendizaje * (d[i] - y) * Xi[i];
//                IncrementoW[1] = tasaAprendizaje * (d[i] - y) * Xi[1];
//                IncrementoW[2] = tasaAprendizaje * (d[i] - y) * Xi[2];
                System.out.println("Incrementos: "+IncrementoW);
           
        }
      return IncrementoW;     
    }
    
    //predice con el test.txt
    public void prediccion(){
        
    }
    //devuelve un arreglo con los pesos actualizados
    public int[] nuevosPesos(int[] incrementos){
           //se ajustan nuevos pesos
            int[] NWi = new int[64];
           for (int i = 0; i < incrementos.length; i++) {
                  NWi[i] = Wi[i] + incrementos[i];
                  System.out.println("N Pesos: "+NWi);
//                Wi[1] = Wi[1] + IncrementoW[1];
//                Wi[2] = Wi[2] + IncrementoW[2];
        }
            return NWi;
    }
    //llena pesos con ceros
    public int[] llenaPesos() {//OJO: AY Q DECLARAR LOS PESOS COMO ENTEROS DESPUES
        int w[] = new int[64];
        for (int i = 0; i < w.length; i++) {
            w[i] = 0;
        }
        return w;
    }

    //obtiene la y, que es la salida deseada
    public int funcion_escalon(double Net) {
        if (Net > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
