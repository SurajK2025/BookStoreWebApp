package com.dao;

import java.util.List;
import com.model.PurchaseSlip;

public interface PurchaseHistoryDao {
	public List<PurchaseSlip> getPurchaseHistory(int userid);
	
	public void insertPurchaseHistory(PurchaseSlip purchaseSlip);
}