/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur.controllers;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import netcrackkur.DuplicateSubjectException;
/**
 *
 * @author Demi
 */
public class ServiceController {
    private static final ServiceController INSTANCE = new ServiceController();
    private HashMap <OPERATION,IController> controllerMap;
    private ServiceController(){        
        controllerMap = new HashMap<>();
        
        LoadController loadController=new LoadController();
        controllerMap.put(OPERATION.LOAD, loadController);
        
        SaveController saveController=new SaveController();
        controllerMap.put(OPERATION.SAVE, saveController);
        
        CreateController createController=new CreateController();
        controllerMap.put(OPERATION.CREATE, createController);
        
        DeleteController deleteController=new DeleteController();
        controllerMap.put(OPERATION.DELETE, deleteController);
        
        ModifyController modifyController=new ModifyController();
        controllerMap.put(OPERATION.MODIFY, modifyController);
    }
    public static ServiceController getInstance(){
        return INSTANCE;
    }
    public enum OPERATION{
        LOAD,
        SAVE,
        CREATE,
        DELETE,
        MODIFY        
    }
    public Object callController(OPERATION operation, Object track, HashMap<String,String> params)throws IOException, DuplicateSubjectException, ClassNotFoundException{
        IController controller = controllerMap.get(operation);
        return controller.execute(track, params);
    }
}
