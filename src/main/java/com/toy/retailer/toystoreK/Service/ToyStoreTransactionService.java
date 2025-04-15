package com.toy.retailer.toystoreK.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.toy.retailer.toystoreK.Model.ToyStoreTransaction01;
import com.toy.retailer.toystoreK.Repository.ToyStoreTransactionRepository;




@Service
public class ToyStoreTransactionService {
	@Autowired
    private ToyStoreTransactionRepository toyStoreTransactionRepository;
	
	@Autowired
	private KafkaTemplate<Long, ToyStoreTransaction01> kafkaObjTemplate;

    public List<ToyStoreTransaction01> getAllTransactions() {
        return toyStoreTransactionRepository.findAll();
    }

    public ToyStoreTransaction01 saveTransaction(ToyStoreTransaction01 toyStoreTransaction) {
    	//kafkaObjTemplate.send("user-topic-1", toyStoreTransaction.getId(), toyStoreTransaction);
    	return toyStoreTransactionRepository.save(toyStoreTransaction);
    }
    public void sendUserObjData(ToyStoreTransaction01 toyStoreTransaction) {
		kafkaObjTemplate.send("user-topic-1", toyStoreTransaction.getId(), toyStoreTransaction);

	}

}