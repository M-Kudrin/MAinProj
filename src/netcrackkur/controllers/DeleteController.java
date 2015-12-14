/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import netcrackkur.DuplicateSubjectException;
import netcrackkur.Track;

public class DeleteController implements IController{
    List<Track> cash;
    @Override
    public Object execute(Object obj, HashMap<String, String> params) throws IOException, DuplicateSubjectException, ClassNotFoundException {
        cash.remove((Track) obj);
        return null;
    }
    
}
