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
        allLines = new String[3][];
        allLines[0] = new String[17];
        allLines[1] = new String[100];
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
                case GLASSING: //here
                    arraySelected = 3;
                    break;
                default:
                    arraySelected = 0;
                    break;
            }
            return values[arraySelected];
        }
        
       
   
        private static void readString() throws FileNotFoundException{
            
            values = new String[4][];
            int line = 0;
            for(int i = 0; i < values.length; i++){
                values[i] = new String[]{"-----"};
            }
            try (Scanner inputStream = new Scanner(file)) {
                 
                String data;
                boolean done = false;
                 
                while(inputStream.hasNext() && !done){ //while reading file  and not done
                    
                    data = inputStream.nextLine();
                    System.out.println(data);
                    
                    if (data.contains("Serial #")){
                        while(inputStream.hasNext() && !done){ //while reading file and not done
                            
                        data = inputStream.nextLine(); //go to the next line
                        
                        if(data.contains("Entered")){ //stop at the line that reads "Entered"
                            System.out.println("Done Import");
                            done = true; //set done equal to true
                        }
                        if(!done){ // if not done
                         
                        rowArray = new String[]{"","","","","","","","","","","","","","","","","","","","","","","","","","",
                            "","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
                            "","","","","","","","","","","","","","","","","","",""};
                        for(int i = 0; i < data.split(",").length; i++){ //i = 0, while i<amount of splits by comma, add i in increments of 1
                            rowArray[i] = data.split(",")[i];
                        }
                        System.out.print("\n");
                        System.out.println("Checking value for ANODE");
                        checkDubsAndAdd(10, 0);
                        System.out.println("Checking value for CATHODE");
                        checkDubsAndAdd(15, 1);
                        System.out.println("Checking value for TANTALUM");
                        checkDubsAndAdd(17, 2);
                        System.out.println("Checking value for GLASSING");
                        checkDubsAndAdd(19, 3);
                        
                        line++;
                        System.out.println("Line " + String.valueOf(line) + " checked.");
                        }
                        }
                    }
                    
                    line++;
                    
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
        
        public String[][] getLines() throws FileNotFoundException{
          
        Scanner inputNew = new Scanner(file);
            String currentLine;
            int linePos = 0;
        
            for(int i = 0; i < allLines[0].length; i++){
                currentLine = inputNew.nextLine();
                allLines[0][i] = currentLine;
            }
            
            currentLine = inputNew.nextLine();
            
            while(currentLine.charAt(0) != ','){
                allLines[1][linePos++] = currentLine;
                currentLine = inputNew.nextLine();
            }
            
            allLines[2] = new String[50];
            linePos = 0;
            while(inputNew.hasNext()){
                if(linePos >= allLines[2].length){
                    String[] temp = new String[allLines[2].length + 1];
                    
                    for(int j = 0; j < allLines[2].length; j++){
                        temp[j] = allLines[2][j];
                    }
                    
                    allLines[2] = temp;
                }
                
                allLines[2][linePos] = currentLine;
                currentLine = inputNew.nextLine();
                
                linePos++;
                
            }
            
            if(linePos >= allLines[2].length){
                    String[] temp = new String[allLines[2].length + 1];
                    
                    for(int j = 0; j < allLines[2].length; j++){
                        temp[j] = allLines[2][j];
                    }
                    
                    allLines[2] = temp;
                }
                allLines[2][linePos] = currentLine;
            
            return allLines;
        }
        
                    
                   private static String[] rowArray;
                   private static String[][] values;
                   private static File file;
                   private String[][] allLines;
    }
    

