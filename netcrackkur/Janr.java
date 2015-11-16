/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur;
import java.io.Serializable;
/**
 *
 * @author Elder
 */
public class Janr implements Serializable {
    
    private String name;
    public Janr()
    {
        
    }
    
    public Janr(String name)
    {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
