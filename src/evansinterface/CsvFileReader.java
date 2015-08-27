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
    
    public CsvFileReader(File fileIn){
        file = fileIn;
        lines = new String[100];
    }

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
                case ANODE:
                    arraySelected = 0;
                    break;
                case CATHODE:
                    arraySelected = 1;
                    break;
                case TANTALUM:
                    arraySelected = 2;
                    break;
                default:
                    arraySelected = 0;
                    break;
            }
            return values[arraySelected];
        }
        
       
   
        private static String[] readString() throws FileNotFoundException{
        
            values = new String[3][];
            int line = 0;
            for(int i = 0; i < values.length; i++){
                values[i] = new String[]{"-----"};
            }
            try (Scanner inputStream = new Scanner(file)) {
                 
                String data;
                boolean done = false;
                 
                while(inputStream.hasNext() && !done){
                    
                    data = inputStream.nextLine();
                    System.out.println(data);
                    
                    if (data.contains("Serial #")){
                        while(inputStream.hasNext() && !done){
                        data = inputStream.nextLine();
                        System.out.println(data);
                        if(data.contains("Entered")){
                            System.out.println("Done Import");
                            done = true;
                        }
                        if(!done){
                        rowArray = new String[]{"","","","","","","","","","","","","","","","","","","","","","","","","","",
                            "","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
                            "","","","","","","","","","","","","","","","","","",""};
                        for(int i = 0; i < data.split(",").length; i++){
                            rowArray[i] = data.split(",")[i];
                        }
                        System.out.print("\n");
                        checkDubsAndAdd(10, 0);
                        System.out.println("Checked value for ANODE");
                        checkDubsAndAdd(15, 1);
                        System.out.println("Checked value for CATHODE");
                        checkDubsAndAdd(17, 2);
                        System.out.println("Checked value for TANTALUM");
                        
                        line++;
                        System.out.println(String.valueOf(line));
                        }
                        }
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
                   private static File file;
                   private String[] lines;
    }
    

