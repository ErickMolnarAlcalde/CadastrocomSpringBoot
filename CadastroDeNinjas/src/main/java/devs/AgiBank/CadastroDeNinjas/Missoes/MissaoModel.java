package devs.AgiBank.CadastroDeNinjas.Missoes;

import devs.AgiBank.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificludade;
    private double recompensa;
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas = new ArrayList<>();

    public MissaoModel() {
    }

    public MissaoModel(String nomeMissao, String dificludade, double recompensa, List<NinjaModel> ninjas) {
        this.nomeMissao = nomeMissao;
        this.dificludade = dificludade;
        this.recompensa = recompensa;
        this.ninjas = ninjas;
    }

    public String getDificludade() {
        return dificludade;
    }

    public void setDificludade(String dificludade) {
        this.dificludade = dificludade;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<NinjaModel> ninjas) {
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }



    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }
}
