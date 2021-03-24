package comhttps.github.PauloMiron.smartstock.resource;


import comhttps.github.PauloMiron.smartstock.model.Product;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")

public class ProductResource {

    @GetMapping
    public String getAllProducts(){
        System.out.println("Entrou no metodo get");
        return "um produto qualquer";
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") long id){
        System.out.println(id);
        Product p = new Product(1L,"Mouse","Mouse Game",75.00F);
        return p;
    }
    @DeleteMapping({"/id"})
    public String deleteProduct(@PathVariable("id") long id){
        System.out.println(id);
        return "Excluir";
    }
}
