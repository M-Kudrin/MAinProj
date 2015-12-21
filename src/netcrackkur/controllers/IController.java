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

public interface IController {
    Object execute(Object obj, HashMap<String,String> params) throws IOException, DuplicateSubjectException, ClassNotFoundException;
}
