/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur;

/**
 *
 * @author Elder
 */
public class SingleTone {
    private static final SingleTone INSTANCE = new SingleTone();
    
    public static SingleTone getInstance()
    {
        return INSTANCE;
    }
    
    private SingleTone()
    {}
    
    
    
}
