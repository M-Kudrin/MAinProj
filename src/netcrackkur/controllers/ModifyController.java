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
import java.util.Map;
import netcrackkur.Track;
import netcrackkur.Genre;
import static netcrackkur.ConstantContainer.*;

public class ModifyController implements IController{
    List<Track> cache;
    List<Genre> genreCache;
    @Override
    public Object execute(Object obj, Map<String, String> params){
        int numOfTrack= cache.indexOf((Track) obj);
        Track track=cache.get(numOfTrack);
        if (params.get(ALBUM)!=null){
            track.setAlbum(params.get(ALBUM));
        }
        if (params.get(ARTIST)!=null){
            track.setartist(params.get(ARTIST));
        }
        if (params.get(NAME)!=null){
            track.setName(params.get(NAME));
        }
        if (params.get(LENGTH)!=null){
            track.setTime(Integer.parseInt(params.get(LENGTH)));
        }
        if (params.get(GENRE)!=null){
            int numOfGenre= genreCache.indexOf((Genre) obj);
            Genre genre=genreCache.get(numOfTrack);
            if (params.get(NAME)!=null){
                genre.setName(params.get(NAME));
            }
            return genre;
            //track.setGenre(new Genre(params.get(GENRE)));
        }
        return track;
    }
    
}
