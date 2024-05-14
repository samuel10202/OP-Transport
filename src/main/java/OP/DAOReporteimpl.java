package OP;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOReporte;
import com.mycompany.models.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOReporteimpl extends Database implements DAOReporte {

    @Override
    public void registrar(Reporte reporte) throws Exception {

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO reporte (id_cond, id_autobus, fecha_salida) VALUES (?, ?, ?);");
            st.setInt(1, reporte.getCond_id());
            st.setInt(2, reporte.getAut_id());
            st.setString(3, reporte.getDate_out());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Reporte reporte) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE reporte SET id_cond = ?, id_autobus = ?, fecha_salida = ?, fecha_entrada = ? WHERE id = ?;");
            st.setInt(1, reporte.getCond_id());
            st.setInt(2, reporte.getAut_id());
            st.setString(3, reporte.getDate_out());
            st.setString(4, reporte.getDate_return());
            st.setInt(5, reporte.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public Reporte getReporte(Conductores conductor, Autobuses autobus) throws Exception {
        Reporte reporte = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM reporte WHERE id_cond = ? AND id_autobus = ? AND fecha_entrada IS NULL ORDER BY id DESC LIMIT 1;");
            st.setInt(1, conductor.getId());
            st.setInt(2, autobus.getID());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                reporte = new Reporte();
                reporte.setId(rs.getInt("id"));
                reporte.setCond_id(rs.getInt("id_cond"));
                reporte.setAut_id(rs.getInt("id_autobus"));
                reporte.setDate_out(rs.getString("fecha_salida"));
                reporte.setDate_return(rs.getString("fecha_entrada"));
            }
            st.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return reporte;
    }

    @Override
    public List<Reporte> listar() throws Exception {
        List<Reporte> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM reporte ORDER BY id DESC");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Reporte reporte = new Reporte();
                reporte.setId(rs.getInt("id"));
                reporte.setCond_id(rs.getInt("id_cond"));
                reporte.setAut_id(rs.getInt("id_autobus"));
                reporte.setDate_out(rs.getString("fecha_salida"));
                reporte.setDate_return(rs.getString("fecha_entrada"));
                lista.add(reporte);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

}
