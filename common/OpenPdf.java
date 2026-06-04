/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.io.File;
import javax.swing.JOptionPane;
import dao.pharmacyUtils;

/**
 *
 * @author Sarvesh Vishwakarma
 */
public class OpenPdf {
    
    public static void openById(String id ){
    
    try{
    if(new File(pharmacyUtils.billPath +id+".pdf").exists()){
        
        Process p=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+pharmacyUtils.billPath+""+id+".pdf");
        
    }   
    else{
        JOptionPane.showMessageDialog(null,"File is not exist");
    }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
}
