/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import netcrackkur.DuplicateSubjectException;

import netcrackkur.Track;

public class CreateController implements IController{
    List<Track> cache;
    @Override
    public Object execute(Object obj, Map<String, String> params){
        int numOfTrack = cache.indexOf(obj);
        cache.add(numOfTrack, (Track) obj);
        return cache.get(cache.size()-1);
    }
    
}
