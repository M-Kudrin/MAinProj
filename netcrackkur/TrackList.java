/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur;
import java.awt.FileDialog;
import java.util.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Elder
 */
public class TrackList implements Serializable {
private List<Track> list = new LinkedList<Track>();

public TrackList()
{

}

public void addTrackN(int i, Track tracki)
{
    list.add(i, tracki);
}
    
public Track getTrackN(int n)
{
  return list.get(n);
}

public int getListSize()
{
    return list.size();
}

public void delTrack(int n)
{
    list.remove(n);
}

public void serializeIt(String str)throws IOException
{
    
            FileOutputStream fos = new FileOutputStream(str);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        }
public void deSerializeIt(String str) throws IOException, DuplicateSubjectException, ClassNotFoundException
{
 FileInputStream fis = new FileInputStream(str);
 ObjectInputStream ois =  new ObjectInputStream(fis);
 list =  (List<Track>) ois.readObject();
}

    
    
    
    
  
}

