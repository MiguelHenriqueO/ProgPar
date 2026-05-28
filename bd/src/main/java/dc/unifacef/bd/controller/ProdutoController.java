package dc.unifacef.bd.controller;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

   @GetMapping("/{id}")
   public ResponseEntity<Optional<Produto>> buscarPorId(@PathVariable Long id){
       Optional<Produto> prod = service.buscarPorId(id);
       if(prod.isEmpty()){
           return ResponseEntity.notFound().build(); // produto não existe statusCode 404
       }
       return ResponseEntity.ok(prod); //statusCode 200
   }

   @PostMapping
    public ResponseEntity<Produto> salva(@RequestBody Produto produto){
       Produto novo = service.salva(produto);
       if(novo != null){
           //vamos montar uma URI
           URI uri = URI.create("/produtos/" + novo.getId());
           return ResponseEntity.created(uri).body(novo); // status code 201

       }

       return ResponseEntity.noContent().build(); // status code 204
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> remove(@PathVariable Long id){
       if(service.remove(id)){
           return ResponseEntity.noContent().build(); //204
       }

       return ResponseEntity.notFound().build(); // 404
   }

   @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualiza(@PathVariable Long id, @RequestBody Produto alterado){
       Produto resposta = service.atualiza(id, alterado);
       if(resposta != null){
           return ResponseEntity.ok(resposta);
       }

       return ResponseEntity.notFound().build();
   }


}
