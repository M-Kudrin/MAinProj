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
import static netcrackkur.ConstantContainer.*;

public interface IController {
    Object execute(Object obj, Map<String,String> params);
}
