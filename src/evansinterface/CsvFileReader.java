package evansinterface;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nate Hindman and Dakota Dolde
 */
public class CsvFileReader {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        readString();
       
    }
             
        public String[] getBoxItems(BoxItems item) throws FileNotFoundException{
            readString();
            int arraySelected;
            switch(item){
                case LOTNUM:
                    arraySelected = 0;
                    break;
                case ANODE:
                    arraySelected = 1;
                    break;
                case CATHODE:
                    arraySelected = 2;
                    break;
                case GLASSING:
                    arraySelected = 3;
                    break;
                case TANTALUM:
                    arraySelected = 4;
                    break;
                default:
                    arraySelected = 0;
                    break;
            }
            return values[arraySelected];
        }
        
       
   public static  String fileName = "Kit Serial Numbers TEMPLATE.csv";
   
        private static void readString() throws FileNotFoundException{
            
           
           
            File file = new File(fileName);
            
         if(file.exists() != true){
             try{
        Runtime runtime = Runtime.getRuntime();
        Process process =runtime.exec("cmd /c start Z:\\EvansInterface_Beta\\wat.vbs");
        System.exit(0);
             }  catch (IOException ex) {
                    Logger.getLogger(CsvFileReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                
            }
            values = new String[5][];
            int line = 0;
            for(int i = 0; i < values.length; i++){
                values[i] = new String[]{"-----"};
            }
             try (Scanner inputStream = new Scanner(file)) {
                 
                while(inputStream.hasNext()){
                    
                    String data = inputStream.next();
                    if (line > 44){
                        rowArray = new String[]{"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
                        for(int i = 0; i < data.split(",").length; i++){
                            rowArray[i] = data.split(",")[i];
                        }
//                        for(String str : rowArray){ 
//                            System.out.print(str + "|   ");
//                        }
                        System.out.print("\n");
                        checkDubsAndAdd(2, 0);
                        System.out.println("Added value for LOTNUM");
                        checkDubsAndAdd(4, 1);
                        System.out.println("Added value for ANODE");
                        checkDubsAndAdd(5, 2);
                        System.out.println("Added value for CATHODE");
                        checkDubsAndAdd(6, 3);
                        System.out.println("Added value for GLASSING");
                        checkDubsAndAdd(7, 4);
                        System.out.println("Added value for TANTALUM");
                    }
                    line++;
                    System.out.println(String.valueOf(line));
                    
                }
            }
             
             
        }
        
        private static void checkDubsAndAdd(int col, int arrayIn){
            if(!Arrays.asList(values[arrayIn]).contains(rowArray[col])
                    && rowArray[col] != null
                    && !rowArray[col].equals("")){
                String[] tArray = new String[values[arrayIn].length + 1];
                for(int i = 0; i < values[arrayIn].length; i++){
                    tArray[i] = values[arrayIn][i];
                }
                values[arrayIn] = tArray;
                values[arrayIn][values[arrayIn].length - 1] = rowArray[col];
                System.out.println("Added " + rowArray[col] + ".");
            }
        }
        
                   private static String[] rowArray;
                   private static String[][] values;
    }
    

