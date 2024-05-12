package com.mycompany.interfaces;

import com.mycompany.models.*;
import java.util.List;

public interface DAOReporte {

    public void registrar(Reporte reporte) throws Exception;
    public void modificar(Reporte reporte) throws Exception;
    public Reporte getReporte(Conductores conductor, Autobuses autobus,String ruta) throws Exception;
    //public void eliminar(Reporte reporte) throws Exception;
    public List<Reporte> listar() throws Exception;

}
