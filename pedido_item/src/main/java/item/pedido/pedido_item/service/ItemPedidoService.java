package item.pedido.pedido_item.service;
import java.util.List;

import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import item.pedido.pedido_item.dto.ItemPedidoDto;
import item.pedido.pedido_item.model.ItemPedido;
import item.pedido.pedido_item.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {

    private ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoDto save(ItemPedidoDto itemPedidoDto) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setId(itemPedidoDto.id());
        itemPedido.setId_pedido(itemPedidoDto.id_pedido());
        itemPedido.setId_produto(itemPedidoDto.id_produto());
        itemPedido.setData_criacao(itemPedidoDto.data_criacao());
        itemPedidoRepository.save(itemPedido);
        return new ItemPedidoDto(itemPedido.getId(), itemPedido.getId_pedido(), itemPedido.getId_produto(), itemPedido.getData_criacao());
    }

    public ItemPedidoDto findById(Long id) {
        ItemPedido itemPedido = itemPedidoRepository.findById(id).get();
        return new ItemPedidoDto(itemPedido.getId(), itemPedido.getId_pedido(), itemPedido.getId_produto(), itemPedido.getData_criacao());
    }

    public List<ItemPedidoDto> findAll() {
        return itemPedidoRepository.findAll().stream().map(itemPedido -> new ItemPedidoDto(itemPedido.getId(), itemPedido.getId_pedido(), itemPedido.getId_produto(), itemPedido.getData_criacao()))
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        itemPedidoRepository.deleteById(id);
    }

    public ItemPedidoDto update(ItemPedidoDto itemPedidoDto) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setId(itemPedidoDto.id());
        itemPedido.setId_pedido(itemPedidoDto.id_pedido());
        itemPedido.setId_produto(itemPedidoDto.id_produto());
        itemPedido.setData_criacao(itemPedidoDto.data_criacao());
        itemPedidoRepository.save(itemPedido);
        return new ItemPedidoDto(itemPedido.getId(), itemPedido.getId_pedido(), itemPedido.getId_produto(), itemPedido.getData_criacao());
    }
    
}
