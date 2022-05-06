/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.renamerfile;

import java.io.File;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 *
 * @author curie
 */
public class Renamerfile {
        public static void main(String[] args) 
    {
        String  sourcePath = "C:\\Users\\curie\\Desktop\\Nuevacarpeta\\pruebat.txt";   // source file path
        
        String destinationPath="C:\\Users\\curie\\Desktop\\Nuevacarpeta2\\";  // destination file path
        System.out.println(destinationPath);
        File sourceFile = new File(sourcePath);// Creating A Source File
        File destinationFile = new File(destinationPath+sourceFile.getName());   //Creating A Destination File. Name stays the same this way, referring to getName()
        String cvambios= "Prueba de cambio";
        String otravez = "Probando de nuevo a ver si cambia";
        
        System.out.println(sourceFile.toPath());
        try 
        {
        Files.copy(sourceFile.toPath(), destinationFile.toPath(),REPLACE_EXISTING);  
          // Static Methods To Copy Copy source path to destination path
        } catch(Exception e)
        {
             System.out.println(e);  // printing in case of error.
        }
    }

   /* public static void main(String[] args) {
        
        File prueba = new File("C:/Users/curie/Desktop/Renamerfile");
        
        File[] archivos = prueba.listFiles();
       
        String ruta1 = archivos[1].getAbsolutePath();
        System.out.println(ruta1);
        
        File ArchivProbar = new File(ruta1);
        ArchivProbar.renameTo(new File (ArchivProbar.getParent()+"\\"+"Nombre2"));
        
        //ruta1.renameTo(new File("PruebaRenombre"));
       // System.out.println("El nuevo nombre es..."+ruta1);
//archivos[1].renameTo(new File("Prueba de renombre"));
        
       /* for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
            
        }*/
        
    
        //System.out.println(prueba.exists());
    //}*/
}
