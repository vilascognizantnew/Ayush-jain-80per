package com.cts.stock.dao;

import java.util.List;

import com.cts.stock.model.Stock;

public interface StockDao {

	public List<Stock> getAllStock();
	public Stock getStockById(int stock_id);
	public Stock getStockByName(String stock_name);
	public Iterable<Stock> findAll();
	public Stock findById(int stock_id);
	public Stock findByName(String stock_name);
}
