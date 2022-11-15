/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modem;

import java.io.*;
import Edificios.EmpresaAcopio;

/**
 *
 * @author Kevin
 */
public class Fichero {
    
    static String ruta="database.data";

    
    public static EmpresaAcopio loadEmpresa() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File database=new File(ruta);
        FileInputStream entradaDatos = new FileInputStream(database);
        ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
        
        EmpresaAcopio empresa=(EmpresaAcopio)entradaObjetos.readObject();
        
        entradaDatos.close();
        
        return empresa;
    }
    
    public static void saveEmpresa(EmpresaAcopio empresa) throws FileNotFoundException, IOException{
        File database=new File(ruta);
        if(!(database.exists())){
            database.mkdirs();
        }
            
        FileOutputStream salidaDatos = new FileOutputStream(database);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        salidaObjetos.writeObject(empresa);
        
        salidaDatos.flush();
        salidaDatos.close();
    }
}
