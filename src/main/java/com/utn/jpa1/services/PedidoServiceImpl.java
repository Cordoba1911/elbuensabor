package com.utn.jpa1.services;

import com.utn.jpa1.entities.Pedido;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {
    @Autowired
    private final PedidoRepositorio pedidoRepositorio;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepositorio pedidoRepositorio){
        super(baseRepository);
        this.pedidoRepositorio = pedidoRepositorio;
    }
}
