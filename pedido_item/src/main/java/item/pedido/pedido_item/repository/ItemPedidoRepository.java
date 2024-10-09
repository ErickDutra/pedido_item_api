package item.pedido.pedido_item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import item.pedido.pedido_item.model.ItemPedido;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    
}
