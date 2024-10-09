package item.pedido.pedido_item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import item.pedido.pedido_item.dto.ItemPedidoDto;
import item.pedido.pedido_item.service.ItemPedidoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@Controller
@CrossOrigin
@RequestMapping("/item_pedido") 
public class ItemPedidoController {
    
    @Autowired
    private ItemPedidoService itemPedidoService;

    @PostMapping("/save")
    public ResponseEntity<ItemPedidoDto> saveItemPedido(@RequestBody ItemPedidoDto itemPedidoDto) {
        return ResponseEntity.ok(itemPedidoService.save(itemPedidoDto));
    }

    @GetMapping("/findById")
    public ResponseEntity<ItemPedidoDto> findById(@RequestParam Long id) {
        return ResponseEntity.ok(itemPedidoService.findById(id));
    }

    @GetMapping("/findAll")
    public List<ItemPedidoDto> findAllItemPedidos(){
        return itemPedidoService.findAll();
    }
   
    

    @DeleteMapping("/deleteById")
    public ResponseEntity<Void> deleteById(@RequestParam Long id) {
        itemPedidoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
