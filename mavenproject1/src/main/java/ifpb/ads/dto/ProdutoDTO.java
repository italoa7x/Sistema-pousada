package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class ProdutoDTO {
    private String name;
    private int amount;
    private double value;
    private int id;
    private ArrayList<ProdutoDTO> allProdutos;

    public ArrayList<ProdutoDTO> getAllProdutos() {
        return allProdutos;
    }

    public void setAllProdutos(ArrayList<ProdutoDTO> allProdutos) {
        this.allProdutos = allProdutos;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
