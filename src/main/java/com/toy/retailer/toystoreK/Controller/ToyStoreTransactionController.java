package com.toy.retailer.toystoreK.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toy.retailer.toystoreK.Model.ToyStoreTransaction01;
import com.toy.retailer.toystoreK.Service.ToyStoreTransactionService;



@RestController
@RequestMapping("/toystore")
public class ToyStoreTransactionController {
	
	 @Autowired
	    private ToyStoreTransactionService toyStoreTransactionService;
	 	
	 	@GetMapping("/welcome")
	    public String welcomePage() {
	        return "Welcome To The Toyshop";
	    }
	    @GetMapping("/pos/transaction")
	    public List<ToyStoreTransaction01> getAllTransactions() {
	        return toyStoreTransactionService.getAllTransactions();
	    }

	    @PostMapping("/pos/transaction")
	    public ToyStoreTransaction01 saveTransaction(@RequestBody ToyStoreTransaction01 toyStoreTransaction) {
	        return toyStoreTransactionService.saveTransaction(toyStoreTransaction);
	    }
	    
	    @PostMapping("/publishUserData")
		public void sendUserObjData(@RequestBody ToyStoreTransaction01 toyStoreTransaction) {
	    	toyStoreTransactionService.sendUserObjData(toyStoreTransaction);
		}

}
