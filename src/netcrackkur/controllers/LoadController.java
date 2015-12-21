/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur.controllers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import netcrackkur.Track;
import java.util.Map;
import java.util.HashMap;
import netcrackkur.DuplicateSubjectException;
/**
 *
 * @author Demi
 */
public class LoadController implements IController{

    public Object execute(Object obj, HashMap<String,String> params) throws IOException, DuplicateSubjectException, ClassNotFoundException{
        String str=params.get("0");
        FileInputStream fis = new FileInputStream(str);
        ObjectInputStream ois =  new ObjectInputStream(fis);
        List<Track> list =  (List<Track>) ois.readObject();
        return list;
    }    
}
