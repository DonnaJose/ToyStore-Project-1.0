package com.toy.retailer.toystoreK.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToyStoreTransaction01 {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private String paymentMode;
	    
	    @Column(nullable = false)
	    private long price;
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPaymentMode() {
			return paymentMode;
		}

		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
		}

		public long getPrice() {
			return price;
		}

		public void setPrice(long price) {
			this.price = price;
		}

		public ToyStoreTransaction01(Long id, String name, String paymentMode, long price) {
			super();
			this.id = id;
			this.name = name;
			this.paymentMode = paymentMode;
			this.price = price;
		}

		public ToyStoreTransaction01() {
			super();
		}

		@Override
		public String toString() {
			return "ToyStoreTransaction [id=" + id + ", name=" + name + ", paymentMode=" + paymentMode + ", price="
					+ price + "]";
		}

		
	    

}
