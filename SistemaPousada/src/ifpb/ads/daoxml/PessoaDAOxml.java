package ifpb.ads.daoxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import ifpb.ads.dto.HospedeDTO;

public class PessoaDAOxml {

    private final String NOME_XML = "pessoas.xml";
    private ArrayList<String[]> registro;

    private File arquivo = new File(NOME_XML);
    private XStream xstream = new XStream(new DomDriver());

    // ÁREA RESPONS�VEL POR MEXER NO XML
    private boolean salvarXml() {
        if (registro != null) {
            try {
                String arquivoXml = xstream.toXML(registro);
                File arquivo = new File(NOME_XML);
                arquivo.createNewFile();
                PrintWriter salvar = new PrintWriter(arquivo);
                salvar.print(arquivoXml);
                salvar.close();
                return true;
            } catch (Exception e) {
                throw new RuntimeException("Erro ao salvar hospede. " + e.getMessage());
            }

        }
        return false;
    }

    private ArrayList<String[]> recuperarXml() {
        File arquivo = new File(NOME_XML);
        try {
            if (arquivo.exists()) {
                FileInputStream fis = new FileInputStream(arquivo);
                registro = (ArrayList<String[]>) xstream.fromXML(fis);

            } else {
                registro = new ArrayList<String[]>();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return registro;
    }

    //ÁREA DO DAO.
    public boolean salvar(HospedeDTO novo) {
        ArrayList<String[]> retorno = recuperarXml();
        String[] dadosPessoa = {novo.getId() + "", novo.getName(), novo.getCpf(), novo.getEmail(), novo.getTelephone()};
        retorno.add(dadosPessoa);
        if(this.salvarXml()){
            return true;
        }
        return false;
    }

    public ArrayList<String[]> listar() {
        return this.recuperarXml();
    }

    public int IncrementaID() {
        int id = 0;
        ArrayList<String[]> retorno = recuperarXml();
        if (retorno.size() > 0) {
            for (int i = 0; i < retorno.size(); i++) {
                String[] indice = retorno.get(i);
                id += Integer.parseInt(indice[0]);
            }
            return id + 1;
        } else {
            return 1;
        }

    }

}
