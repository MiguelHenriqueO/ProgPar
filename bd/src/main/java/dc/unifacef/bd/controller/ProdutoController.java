package dc.unifacef.bd.controller;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // indica que ele recebe as requisições
@RequestMapping("/produtos")
public class ProdutoController {
   //vamos usar um objeto da classe ProdutoService - injeção de dependência
   // vamose usar o construtor pra isso

   private ProdutoService service;
   public ProdutoController(ProdutoService service){
       this.service = service;
   }

   //porque usar o ResponseEntity? para usar diferentes statusCode ao front
   @GetMapping
    public ResponseEntity<List<Produto>> listar(){
       return ResponseEntity.ok(service.listar()); //statusCode : 200
   }
}
