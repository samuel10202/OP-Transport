package com.mycompany.interfaces;

import com.mycompany.models.Autobuses;
import java.util.List;

public interface DAOAutobuses {
    public void registrar(Autobuses autobus) throws Exception;
    public void modificar(Autobuses autobus) throws Exception;
    public void eliminar(int autobusId) throws Exception;
    public List<Autobuses> listar(String buse)throws Exception;
    public Autobuses getAutobusById(int autobusId)throws Exception;
}
