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
import netcrackkur.Genre;

public class ModifyController implements IController{
    List<Track> cash;
    @Override
    public Object execute(Object obj, HashMap<String, String> params) throws IOException, DuplicateSubjectException, ClassNotFoundException {
        int numOfTrack= cash.indexOf((Track) obj);
        Track track=cash.get(numOfTrack);
        if (params.get("album")!=null){
            track.setAlbum(params.get("album"));
        }
        if (params.get("artist")!=null){
            track.setartist(params.get("artist"));
        }
        if (params.get("name")!=null){
            track.setName(params.get("name"));
        }
        if (params.get("length")!=null){
            track.setTime(Integer.parseInt(params.get("length")));
        }
        if (params.get("Genre")!=null){
            track.setGenre(new Genre(params.get("Genre")));
        }
        return track;
    }
    
}
