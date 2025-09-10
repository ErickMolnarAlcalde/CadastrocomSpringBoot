package devs.AgiBank.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping //colocar todas as rotas no mesmo lugar
public class Controller {

    /*
    @GetMapping - puxar informações
    @PostMapping - mandar informações
    @PutMapping - alterar informações
    @PatchMapping - alterar informações
    @DeleteMapping - deletar informações


     */


    @GetMapping("/boasVindas") //pegar informações
    public String boasVindas(){
        return "BOAS VINDAS!!!";
    }
}
