package com.cts.stock.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.cts.stock.model.Stock;

public class StockDaoImpl implements StockDao {

	List<Stock> stockList=new ArrayList<>();
	
	public StockDaoImpl() {
		stockList.add(new Stock(001, "LCD",30000.00, 10.00,new Date(2020-01-01)));
		stockList.add(new Stock(002, "LED", 4000.00, 50.00,new Date(2020-02-02)));
		stockList.add(new Stock(003, "Mobile",10000.00, 50.00,new Date(2020-03-03)));
		stockList.add(new Stock(001, "LCD",50000.00, 50.00,new Date(2020-04-01)));
		stockList.add(new Stock(002, "LED", 5000.00, 100.00,new Date(2020-05-05)));
		stockList.add(new Stock(003, "Mobile",15000.00, 60.00,new Date(2020-06-06)));
	}
	
	@Override
	public List<Stock> getAllStock() {
		return stockList;
	}
	
	
	@Override
	public Stock getStockById(int stock_id) {
		
		for(Stock stock:stockList) {
			if(stock.getStock_id()==stock_id) {
				
				return stock;	
			}
		}
		
		return null;
	}
    @Override
	public Stock getStockByName(String stock_name) {
		for(Stock stock:stockList) {
			if(stock.getStock_name()==stock_name) {
				
				return stock;	
			}
		}
		
		return null;
	}

	@Override
	public Iterable<Stock> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock findById(int stock_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock findByName(String stock_name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
