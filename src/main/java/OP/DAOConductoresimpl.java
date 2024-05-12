package OP;

import com.mycompany.db.Database;
import com.mycompany.models.Conductores;
import java.sql.PreparedStatement;
import java.util.List;
import com.mycompany.interfaces.DAOConductores;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOConductoresimpl extends Database implements DAOConductores {

    @Override
    public void registrar(Conductores conductores) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO conductores(cc, nombre, apellido, fecha_nacimiento, telefono, direccion, genero, licencia, lic_expe, lic_venc) VALUES (?,?,?,?,?,?,?,?,?,?);");
            st.setInt(1, conductores.getCc());
            st.setString(2, conductores.getNombres());
            st.setString(3, conductores.getApellidos());
            st.setString(4, conductores.getFecha_nacimiento());
            st.setInt(5, conductores.getTelefono());
            st.setString(6, conductores.getDireccion());
            st.setString(7, conductores.getGenero());
            st.setInt(8, conductores.getLicencia());
            st.setString(9, conductores.getFecha_expeLicen());
            st.setString(10, conductores.getFecha_vencLicen());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Conductores conductor) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE conductores SET cc = ?, nombre = ?, apellido = ?, fecha_nacimiento = ?, telefono = ?, direccion = ?, genero = ?, licencia = ?, lic_expe = ?, lic_venc = ?;");
            st.setInt(1, conductor.getCc());
            st.setString(2, conductor.getNombres());
            st.setString(3, conductor.getApellidos());
            st.setString(4, conductor.getFecha_nacimiento());
            st.setInt(5, conductor.getTelefono());
            st.setString(6, conductor.getDireccion());
            st.setString(7, conductor.getGenero());
            st.setInt(8, conductor.getLicencia());
            st.setString(9, conductor.getFecha_expeLicen());
            st.setString(10, conductor.getFecha_vencLicen());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int conductorId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM conductores WHERE id = ?;");
            st.setInt(1, conductorId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Conductores> listar(String nombre) throws Exception {
        List<Conductores> lista = null;
        try {
            this.Conectar();
            String Query  = nombre.isEmpty() ? "SELECT * FROM conductores;" : "SELECT * FROM conductores WHERE nombre LIKE '%" + nombre + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Conductores conductor = new Conductores();
                conductor.setId(rs.getInt("id"));
                conductor.setCc(rs.getInt("cc"));
                conductor.setNombres(rs.getString("nombre"));
                conductor.setApellidos(rs.getString("apellido"));
                conductor.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                conductor.setTelefono(rs.getInt("telefono"));
                conductor.setDireccion(rs.getString("direccion"));
                conductor.setGenero(rs.getString("genero"));
                conductor.setLicencia(rs.getInt("licencia"));
                conductor.setFecha_expeLicen(rs.getString("lic_expe"));
                conductor.setFecha_vencLicen(rs.getString("lic_venc"));
                lista.add(conductor);
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
    public Conductores getConductorById(int conductorId) throws Exception {
        Conductores conductor = new Conductores();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM conductores WHERE id = ? LIMIT 1;");
            st.setInt(1, conductorId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                conductor.setId(rs.getInt("id"));
                conductor.setNombres(rs.getString("nombre"));
                conductor.setApellidos(rs.getString("apellido"));
                conductor.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                conductor.setTelefono(rs.getInt("telefono"));
                conductor.setDireccion(rs.getString("direccion"));
                conductor.setGenero(rs.getString("genero"));
                conductor.setLicencia(rs.getInt("licencia"));
                conductor.setFecha_expeLicen(rs.getString("lic_expe"));
                conductor.setFecha_vencLicen(rs.getString("lic_venc"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return conductor;
    }

}
