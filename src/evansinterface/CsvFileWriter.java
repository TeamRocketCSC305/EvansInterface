
package evansinterface;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
/**
 *
 * @author natehindman
 */
public class CsvFileWriter {
   public static void lol(String[] args) throws IOException{
       //try{ 
       String stringthing = "category path = Root\\Kit Serial Numbers";
       String cantu = "MIGUEL CANTU";
       String hoagland ="CHRIS HOAGLAND";
       String rucker = "CHRIS RUCKER(QUALITY)";
       String Serial = "Serial number";
       String part = "part in series";
       String assembly = "Assembly Lot,";
       String anode ="anode lot";
       String cathode = "cathode lot";
       String header = "Header Glassing";
       String tantalum = "tantalum lot number";
       String Cap = "Capacitence";
       String ESR = "ESR";
       String Leakage= "leakage";
       String Assemblylotselected = "Assembly lot selected";
       String Anode1 = "anode 1";
       String Anode2 = "anode 2";
       String Anode3 = "anode 3";
       String Anode4 = "anode 4";
       String Anode5 = "anode 5";
       String Cathodelot = "Cathode Lot#";
       String TeflonSpacer1="Teflon Spacer 1";
       String TeflonSpacer2 = "Teflon Spacer 2";
       String TeflonSpacer3 = "Teflon Spacer 3";
       String HeaderGlass = " Header Glassing Lot";
       String Tantalumlot = "Tantalum lot";
       String Teflon = "Teflon Spacer Lot";
       
       
    //  File happyFile = new File(evansinterface.mainWindow.jComboBox2.getSelectedItem().toString());
   //         FileWriter  fileWriter = new FileWriter(happyFile, true);
     //       BufferedWriter buffer = new BufferedWriter(fileWriter);
      //      PrintWriter printWriter = new PrintWriter(fileWriter);
      //      printWriter.printf( "%s\n,%s,,%s,,,,%s\n,%s,%s,%s,%s,,%s,%s,%s,%s,%s,,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",stringthing,cantu,hoagland,rucker,Serial,part,assembly,anode,cathode,header,tantalum,Cap,ESR,Leakage,Assemblylotselected,Anode1,Anode2,Anode3,Anode4,Anode5,Cathodelot,TeflonSpacer1,TeflonSpacer2,TeflonSpacer3,HeaderGlass,Tantalumlot,Teflon);
                
//);
        //        printWriter.close();
    } 
  // System.out.println(evansinterface.mainWindow.jComboBox3);
    //catch(FileNotFoundException e){
   // System.out.printf("YOU MESSED UP");

    private static void getSelectedText(JComboBox jComboBox2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   

