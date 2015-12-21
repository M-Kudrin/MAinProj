/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur.controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import netcrackkur.DuplicateSubjectException;
import netcrackkur.Track;

/**
 *
 * @author Demi
 */
public class SaveController implements IController{
    public Object execute(Object obj, HashMap<String,String> params) throws IOException, DuplicateSubjectException, ClassNotFoundException{
        String str=params.get("0");
        FileOutputStream fos = new FileOutputStream(str);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject((List<Track>)obj);
        oos.flush();
        oos.close();
        return null;
    }  
}
