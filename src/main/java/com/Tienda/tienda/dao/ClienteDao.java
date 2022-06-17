
package com.Tienda.tienda.dao;

import com.Tienda.tienda.domain.cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<cliente, Long> {
    
}
