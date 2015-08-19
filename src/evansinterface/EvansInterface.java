
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evansinterface;

import java.io.FileNotFoundException;

/**
 *
 * @author natehindman
 */
 class EvansInterface {
    

    public EvansInterface(){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        
        mainWindow frame = new mainWindow();
        frame.setVisible(true);
        frame.setResizable(false);
    
 
}
    }

