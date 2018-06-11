package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import model.NumerosModel;

public class NumerosData {

    public ArrayList<NumerosModel> pesquisar() throws Exception {
        ArrayList<NumerosModel> dados = new ArrayList<>();
        String sql = "Select * from numeros";
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            NumerosModel obj = new NumerosModel(rs.getInt("num"));
            dados.add(obj);
        }
        c.getConexao().close();
        ps.close();
        rs.close();
        return dados;
    }

    public boolean editar(ArrayList<NumerosModel> obj, int pos) throws Exception {
        Conexao c = new Conexao();
        String sql = "Update numeros set num=? where id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, obj.get(pos).getVetor());
        ps.setInt(2, (pos + 1));
        if (ps.executeUpdate() > 0) {
            ps.close();
            c.getConexao().close();
            return true;
        } else {
            ps.close();
            c.getConexao().close();
            throw new Exception("Não foi possível atualizar.");
        }
    }

    public void randomizando() throws Exception {
        Conexao c = new Conexao();
        Random gerador = new Random(19700621);
        String sql1 = "truncate table numeros; ALTER SEQUENCE numeros_id_seq RESTART WITH 1;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.executeUpdate();
        for (int i = 0; i < 15; i++) {
            NumerosModel objVet = new NumerosModel();
            objVet.setVetor(gerador.nextInt(900));
            c = new Conexao();
            String sql2 = "Insert into numeros (num) values (?)";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setInt(1, objVet.getVetor());
            if (ps2.executeUpdate() > 0) {
                ps1.close();
                ps2.close();
                c.getConexao().close();
            } else {
                throw new Exception("Não foi possível atualizar.");
            }
        }

    }

}
