package com.cts.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.stock.dao.StockDao;
import com.cts.stock.model.Stock;
@Service
public  class StockServiceImpl  implements StockService {
 
	@Autowired
	StockDao sdao;
	
	@Override
	public Iterable<Stock> getAllStock() {
		return sdao.findAll();
	}

	@Override
	public Stock getStockById(int stock_id) {
		return sdao.findById(stock_id).get();
	}

	@Override
	public Stock getStockByName(String stock_name) {
		return sdao.findByName(stock_name).get();
	}

}
