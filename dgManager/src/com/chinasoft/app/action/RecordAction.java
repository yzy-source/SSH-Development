package com.chinasoft.app.action;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.RecordPage;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.StorePage;
import com.chinasoft.app.domain.Warehouse;
import com.chinasoft.app.service.ProductService;
import com.chinasoft.app.service.RecordService;
import com.chinasoft.app.service.StoreService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RecordAction extends ActionSupport implements ModelDriven<Recordlist>{
	private Recordlist recordlist=new Recordlist();
	private int currentPage=1;
	private int pageSize=5;
	private StoreService storeService;
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public RecordService getRecordService() {
		return recordService;
	}
	private RecordService recordService;
	public String showrecord()
	{
		RecordPage recordPage = recordService.findall(currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("recordPage", recordPage);
		return SUCCESS;
	}
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}
	public String send_in()
	{
		ServletActionContext.getRequest().setAttribute("recordlist", recordlist);
		recordlist.setOperationType("进货");
		Warehouse warehouse=recordlist.getWarehouse();
		int n=warehouse.getWId();
		warehouse.setWId(n);
		recordlist.setWarehouse(warehouse);
		storeService.add(recordlist);
		
		storeService.updatein(recordlist.getChangeNumber(),recordlist.getProducts().getProductId(),recordlist.getWarehouse().getWId());
		ServletActionContext.getRequest().setAttribute("recordlist", recordlist);
		return "product_sent_in";
	}
	public String send_out()
	{
		recordlist.setOperationType("出货");
		Warehouse warehouse=recordlist.getWarehouse();
		int n=warehouse.getWId();
		warehouse.setWId(n);
		recordlist.setWarehouse(warehouse);
		storeService.add(recordlist);
		ServletActionContext.getRequest().setAttribute("recordlist", recordlist);
		storeService.updateout(recordlist.getChangeNumber(),recordlist.getProducts().getProductId(),recordlist.getWarehouse().getWId());
		
		 Products product=productService.findProductById(recordlist.getProducts().getProductId());
		 product.setSellAmount(product.getSellAmount()+recordlist.getChangeNumber());
		 productService.update(product);
		return "product_sent_out";
	}
	public Recordlist getRecordlist() {
		return recordlist;
	}
	public void setRecordlist(Recordlist recordlist) {
		this.recordlist = recordlist;
	}
	public StoreService getStoreService() {
		return storeService;
	}
	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}
	@Override
	public Recordlist getModel() {
		// TODO Auto-generated method stub
		return recordlist;
	}
}
