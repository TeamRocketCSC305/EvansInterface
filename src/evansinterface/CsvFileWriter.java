
package evansinterface;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author natehindman
 */
public class CsvFileWriter {
    public static void appendData(File file, String line) throws IOException{
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        buffer.append(line + "\n");
    } 
}   

