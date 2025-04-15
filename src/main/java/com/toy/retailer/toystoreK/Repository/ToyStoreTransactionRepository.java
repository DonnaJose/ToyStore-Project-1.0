package com.toy.retailer.toystoreK.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toy.retailer.toystoreK.Model.ToyStoreTransaction01;



@Repository
public interface ToyStoreTransactionRepository extends JpaRepository<ToyStoreTransaction01, Long>{

}
