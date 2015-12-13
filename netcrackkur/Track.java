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
    private String ispoln;
    private String album;
    private int time;
    private Janr janrick;

    /**
     * @return the name
     */
     public Track()
     {
     
     }
     
     public Track(String name,String ispoln,String album, int time,Janr janrick )
     {
         this.name=name;
         this.ispoln=ispoln;
         this.album=album;
         this.time=time;
         this.janrick = janrick;
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
     * @return the Ispoln
     */
    public String getIspoln() {
        return ispoln;
    }

    /**
     * @param Ispoln the Ispoln to set
     */
    public void setIspoln(String Ispoln) {
        this.ispoln = Ispoln;
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
    
    public void setJanr(Janr janrick)
    {
        this.janrick=janrick;
    }
    public Janr getJanr()
    {
        return(janrick);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.ispoln);
        hash = 29 * hash + Objects.hashCode(this.album);
        hash = 29 * hash + this.time;
        hash = 29 * hash + Objects.hashCode(this.janrick);
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
        if (!Objects.equals(this.ispoln, other.ispoln)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        if (!Objects.equals(this.janrick, other.janrick)) {
            return false;
        }
        return true;
    }
    
    
}
