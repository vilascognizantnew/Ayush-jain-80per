package com.cts.stock.service;

import com.cts.stock.model.Stock;

public interface StockService {
	
	public Iterable<Stock> getAllStock();
	public Stock getStockById(int stock_id);
	public Stock getStockByName(String stock_name);

}
