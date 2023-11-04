package com.utn.jpa1.services;

import com.utn.jpa1.entities.ArticuloInsumo;
import com.utn.jpa1.repositories.ArticuloInsumoRepository;
import com.utn.jpa1.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService {
    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;


    public ArticuloInsumoServiceImpl(BaseRepository<ArticuloInsumo, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<ArticuloInsumo> search(String string) throws Exception {
        return null;
    }

    @Override
    public Page<ArticuloInsumo> search(String string, Pageable pageable) throws Exception {
        return null;
    }

    public Object verStock(Pageable pageable) throws Exception {
        try{
            Page<ArticuloInsumo> articuloInsumos = articuloInsumoRepository.searchStock(pageable);
            return articuloInsumos;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //public Object ingresoStock(DTOCompraInsumo dtoCompraInsumo) throws Exception {
    //    try{
    //        List<DTOInsumoDetalle> detalles = dtoCompraInsumo.getDetalles();
    //        for (int i = 0; i < detalles.size(); i++) {
    //            ArticuloInsumo articuloInsumo = articuloInsumoRepository.getById(detalles.get(i).getArticuloInsumoId());
    //            BigDecimal stockPrevio = articuloInsumo.getStockActual();
    //            articuloInsumo.setStockActual(stockPrevio.add(BigDecimal.valueOf(detalles.get(i).getCantidad())));
    //            articuloInsumoRepository.save(articuloInsumo);
    //        }
    //        return null;
    //    }catch (Exception e) {
    //        throw new Exception(e.getMessage());
    //    }
    //}
}
