package OP;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOAutobuses;
import com.mycompany.models.Autobuses;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOAutobusesimpl extends Database implements DAOAutobuses {

    @Override
    public void registrar(Autobuses autobus) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO buses(marca, modelo, año_fabricacion, plazas_disponibles, placa, kilometraje) VALUES (?,?,?,?,?,?);");
            st.setString(1, autobus.getMarca());
            st.setString(2, autobus.getModelo());
            st.setString(3, autobus.getAño_fabricacion());
            st.setInt(4, autobus.getPlazas_disponibles());
            st.setString(5, autobus.getPlaca());
            st.setInt(6, autobus.getKilometraje());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Autobuses autobus) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE buses SET marca = ?, modelo = ?, año_fabricacion = ?, plazas_disponibles = ?, placa = ?, kilometraje = ?;");
            st.setString(1, autobus.getMarca());
            st.setString(2, autobus.getModelo());
            st.setString(3, autobus.getAño_fabricacion());
            st.setInt(4, autobus.getPlazas_disponibles());
            st.setString(5, autobus.getPlaca());
            st.setInt(6, autobus.getKilometraje());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int autobusId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM buses WHERE id = ?;");
            st.setInt(1, autobusId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Autobuses> listar(String buse) throws Exception {
        List<Autobuses> lista = null;
        try {
            this.Conectar();
            String Query = buse.isEmpty() ? "SELECT * FROM buses;" : "SELECT * FROM buses WHERE marca LIKE '%" + buse + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Autobuses autobuses = new Autobuses();
                autobuses.setID(rs.getInt("id"));
                autobuses.setMarca(rs.getString("marca"));
                autobuses.setModelo(rs.getString("modelo"));
                autobuses.setAño_fabricacion(rs.getString("año_fabricacion"));
                autobuses.setPlazas_disponibles(rs.getInt("plazas_disponibles"));
                autobuses.setPlaca(rs.getString("placa"));
                autobuses.setKilometraje(rs.getInt("kilometraje"));
                lista.add(autobuses);
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

    @Override
    public Autobuses getAutobusById(int autobusId) throws Exception {
        Autobuses autobus = new Autobuses();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM buses WHERE id = ? LIMIT 1;");
            st.setInt(1, autobusId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                //Autobuses autobuses = new Autobuses();
                autobus.setID(rs.getInt("id"));
                autobus.setMarca(rs.getString("marca"));
                autobus.setModelo(rs.getString("modelo"));
                autobus.setAño_fabricacion(rs.getString("año_fabricacion"));
                autobus.setPlazas_disponibles(rs.getInt("plazas_disponibles"));
                autobus.setPlaca(rs.getString("placa"));
                autobus.setKilometraje(rs.getInt("kilometraje"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return autobus;
    }

    @Override
    public Autobuses getAutobusByPlaca(String placa) throws Exception {
        Autobuses autobus = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM buses WHERE placa = ? LIMIT 1;");
            st.setString(1, placa);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                autobus = new Autobuses();
                autobus.setID(rs.getInt("id"));
                autobus.setMarca(rs.getString("marca"));
                autobus.setModelo(rs.getString("modelo"));
                autobus.setAño_fabricacion(rs.getString("año_fabricacion"));
                autobus.setPlazas_disponibles(rs.getInt("plazas_disponibles"));
                autobus.setPlaca(rs.getString("placa"));
                autobus.setKilometraje(rs.getInt("kilometraje"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return autobus;
    }
}
