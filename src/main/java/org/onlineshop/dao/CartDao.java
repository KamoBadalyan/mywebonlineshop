package org.onlineshop.dao;import org.springframework.data.repository.CrudRepository;import org.springframework.stereotype.Repository;import org.onlineshop.model.Cart;@Repositorypublic interface CartDao extends CrudRepository<Cart, Long> {    Cart findUserBycartId(long cartId);}