package com.utn.jpa1.services;

import com.utn.jpa1.DTOs.DTOCrearPedido;
import com.utn.jpa1.entities.Pedido;
import com.utn.jpa1.entities.Usuario;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.PedidoRepositorio;
import com.utn.jpa1.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {
    @Autowired
    private final PedidoRepositorio pedidoRepositorio;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepositorio pedidoRepositorio){
        super(baseRepository);
        this.pedidoRepositorio = pedidoRepositorio;
    }

    @Override
    public Page<Pedido> buscarCliente(Long idCliente, Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public List<Pedido> buscarCliente(Long idCliente) throws Exception {
        return null;
    }

    //@Transactional
    //public Pedido savePedido(DTOCrearPedido dtoPedido) throws Exception {
    //    try {
    //        Calendar calendar = Calendar.getInstance();
    //        Pedido pedido = new Pedido();
    //        Usuario usuario = (Usuario) usuarioRepository.search(dtoPedido.getUsername());
    //        pedido.setCliente(usuario.getCliente());
    //    } catch (Exception e){
    //
    //    }
    //}
}
