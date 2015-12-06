/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Elder
 */
public class IzmenenieTabl {
    public TrackList getTrListik(TableModel myModel)
    {
        
        TrackList returnTr = new TrackList();
        for (int i=0; i<myModel.getRowCount(); i++)
        {            
                    
           returnTr.addTrackN(i, new Track((((myModel.getValueAt(i, 1)).toString())),(myModel.getValueAt(i, 2)).toString(),(myModel.getValueAt(i, 3)).toString(), Integer.parseInt((myModel.getValueAt(i, 4)).toString()), new Janr((myModel.getValueAt(i, 0)).toString())));
        }
        return returnTr;
    }
}
