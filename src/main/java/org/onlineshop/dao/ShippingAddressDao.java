package org.onlineshop.dao;import org.springframework.data.repository.CrudRepository;import org.springframework.stereotype.Repository;import org.onlineshop.model.ShippingAddress;@Repositorypublic interface ShippingAddressDao extends CrudRepository<ShippingAddress, Long>{}