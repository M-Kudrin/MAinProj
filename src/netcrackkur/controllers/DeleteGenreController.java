/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackkur.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import netcrackkur.DuplicateSubjectException;
import netcrackkur.Genre;

/**
 *
 * @author Elder
 */
public class DeleteGenreController implements IController{
    List<Genre> cache;
    @Override
    public Object execute(Object obj, Map<String, String> params) {
        cache.remove((Genre) obj);
        return null;
    }
}
