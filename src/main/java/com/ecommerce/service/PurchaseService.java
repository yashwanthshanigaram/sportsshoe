package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Purchase;


public interface PurchaseService {

public Purchase addPurchase(Purchase purchase);
	
	public Purchase updatePurchase(Purchase purchase);
	
	public Purchase getPurchaseById(int id);
	public void deletePurchaseById(int id);
	
	public List<Purchase> getAllPurchases();
	public List<Purchase> getAllPurchasesByDateofPurchase();

}
