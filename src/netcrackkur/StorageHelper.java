/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import static netcrackkur.ConstantContainer.NIL;

/**
 *
 * @author Demi
 */
public class StorageHelper {
    public List loadTracklist(String filepath){
        try{
        FileInputStream fis = new FileInputStream(filepath);
        ObjectInputStream ois =  new ObjectInputStream(fis);
        List<Track> list =  (List<Track>) ois.readObject();
        return list;
        } catch(IOException|ClassNotFoundException e){ throw new RuntimeException();}
    }
    public List saveTracklist(Object obj,String filepath){
        try{
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject((List<Track>)obj);
            oos.flush();
            oos.close();
            return null;
        } catch(IOException e){ throw new RuntimeException();}
    }
}
