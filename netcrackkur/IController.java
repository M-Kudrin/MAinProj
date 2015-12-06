package netcrackkur.controllers;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import netcrackkur.DuplicateSubjectException;

public interface IController {
    Object execute(Object obj, HashMap<String,String> params);
}
