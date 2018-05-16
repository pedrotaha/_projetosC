package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import model.UsuarioModel;

public class UsuarioData {

    public ArrayList<UsuarioModel> pesquisar() throws Exception {
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String sql = "Select * from usuario";
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            UsuarioModel obj = new UsuarioModel(rs.getString("nome"), rs.getFloat("salario"), rs.getInt("numeros"));
            dados.add(obj);
        }
        return dados;
    }

    public boolean editar(ArrayList<UsuarioModel> obj, int pos) throws Exception {
        Conexao c = new Conexao();
        String sql = "Update usuario set nome=?, numeros=?, salario=? where id=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, obj.get(pos).getNome());
        ps.setInt(2, obj.get(pos).getNumero());
        ps.setFloat(3, obj.get(pos).getSalario());
        ps.setInt(4, (pos + 1));
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            throw new Exception("Não foi possível atualizar.");
        }
    }

    public void randomizando() throws Exception {
        Conexao c = new Conexao();
        Random gerador = new Random(19700621);
        String sql1 = "truncate table usuario; ALTER SEQUENCE usuario_id_seq RESTART WITH 1;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.executeUpdate();
        for (int i = 0; i < 15; i++) {
            UsuarioModel objVet = new UsuarioModel();
            objVet.setNumero(gerador.nextInt(900));//Random Int
            String caracteresSalgados = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";//Random String
            StringBuilder sao = new StringBuilder();
            Random geradorS = new Random();
            while (sao.length() < 18) { // tamanho da String aleatória
                int index = (int) (geradorS.nextFloat() * caracteresSalgados.length());
                sao.append(caracteresSalgados.charAt(index));
            }
            String stringSalgada = sao.toString();
            Random rand = new Random(19700621);//Random float
            float result = ((10 + rand.nextInt(30)) + (rand.nextFloat())) * objVet.getNumero();
            c = new Conexao();//Inserindo os resultados aleatórios no banco
            String sql2 = "Insert into usuario (nome, numeros, salario) values (?,?,?)";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setString(1, stringSalgada);
            ps2.setInt(2, objVet.getNumero());
            ps2.setFloat(3, result);
            if (ps2.executeUpdate() > 0) {

            } else {
                throw new Exception("Não foi possível atualizar.");
            }
        }

    }
}
