package com.mycompany.interfaces;

import com.mycompany.models.Conductores;
import java.util.List;

public interface DAOConductores {

    public void registrar(Conductores conductor) throws Exception;

    public void modificar(Conductores conductor) throws Exception;

    public void eliminar(int conductorId) throws Exception;

    public List<Conductores> listar(String name) throws Exception;

    public Conductores getConductorById(int conductorId) throws Exception;

    public Conductores getConductorByCC(int CC) throws Exception;

}
