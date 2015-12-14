/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Elder
 */
public class Track implements Serializable {
    private String name;
    private String artist;
    private String album;
    private int time;
    private Genre genre;

    /**
     * @return the name
     */
     public Track()
     {
     
     }
     
     public Track(String name,String artist,String album, int time,Genre genre )
     {
         this.name=name;
         this.artist=artist;
         this.album=album;
         this.time=time;
         this.genre = genre;
     }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the artist
     */
    public String getartist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setartist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the Album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @param Album the Album to set
     */
    public void setAlbum(String Album) {
        this.album = Album;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }
    
    public void setGenre(Genre genre)
    {
        this.genre=genre;
    }
    public Genre getGenre()
    {
        return(genre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.artist);
        hash = 29 * hash + Objects.hashCode(this.album);
        hash = 29 * hash + this.time;
        hash = 29 * hash + Objects.hashCode(this.genre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Track other = (Track) obj;
        if (this.time != other.time) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        return true;
    }
    
    
}
