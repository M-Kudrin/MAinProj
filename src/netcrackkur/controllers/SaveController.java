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
import java.util.Map;
import java.util.List;
import netcrackkur.DuplicateSubjectException;
import netcrackkur.Track;
import netcrackkur.StorageHelper;
import static netcrackkur.ConstantContainer.*;

/**
 *
 * @author Demi
 */
public class SaveController implements IController{
    public Object execute(Object obj, Map<String,String> params){
        String str=params.get(NIL);
        return new StorageHelper().saveTracklist(obj, str);
    }  
}
