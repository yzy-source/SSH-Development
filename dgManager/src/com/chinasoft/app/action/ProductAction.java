package com.chinasoft.app.action;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Brand;
import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.Store;
import com.chinasoft.app.service.BrandService;
import com.chinasoft.app.service.MessageService;
import com.chinasoft.app.service.ProductService;
import com.chinasoft.app.service.impl.BrandServiceImpl;
import com.chinasoft.app.util.BrandPage;
import com.chinasoft.app.util.ProductPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;




import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport implements
		ModelDriven<Products> {
	private Products product = new Products();
	private ProductService productService;
	private MessageService messageService;
	private int currentPage = 1;
	private int pageSize = 8;
	private String str;// 前台搜索信息
	private Integer messageID;// 留言ID
	
	
	 private static final long serialVersionUID = 1L;
	 private Image image;
	 private File file; //file控件名
	 private String fileContentType;//图片类型
	 private String fileFileName; //文件名
	 private Integer number;
	   
	 
	 
	 
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public Integer getMessageID() {
		return messageID;
	}

	public void setMessageID(Integer messageID) {
		this.messageID = messageID;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

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

	public String add() {
		// System.out.println("add方法执行");
		product.setSellAmount(0);
		productService.add(product);
		
		Integer pid=productService.findProductByName(product.getProductName(), currentPage, pageSize).getProductList().get(0).getProductId();
		System.out.println(pid);
		
		
		HttpServletRequest request = ServletActionContext.getRequest();
        @SuppressWarnings("deprecation")
		String root = request.getRealPath("images/productImage");//图片要上传到的服务器路径
        String names[]=fileFileName.split("\\.");
        System.out.println(root);
        System.out.println(fileFileName);
        String fileName="";
//        if(names.length>=1){
//            fileName=getRandomString(20)+"."+names[names.length-1];
//        }
        fileName=pid.toString()+"."+"jpg";
        File file1=new File("e:\\workspace\\dgManager\\WebContent\\images\\productImage");
        File file2=new File(root);
        try {
            FileUtils.copyFile(file, new File(file1,fileName));
            FileUtils.copyFile(file, new File(file2,fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
		return "product_search";
	}


   public String getRandomString(int length) { //length表示生成字符串的长度  
    String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
    Random random = new Random();     
    StringBuffer sb = new StringBuffer();     
    for (int i = 0; i < length; i++) {     
        int number = random.nextInt(base.length());     
        sb.append(base.charAt(number));     
    }     
    return sb.toString();     
    }    

	public String delete() {
		productService.delete(product.getProductId());
		return "product_search";

	}

	public String update() {
		Products newProduct = productService.findProductById(product
				.getProductId());
		// newProduct.setBrand(product.getBrand());
		newProduct.setDetailInfo(product.getDetailInfo());
		newProduct.setPrice(product.getPrice());
		newProduct.setPrimecost(product.getPrimecost());
		newProduct.setProductName(product.getProductName());
		newProduct.setSendAddr(product.getSendAddr());
		newProduct.setType(product.getType());
		newProduct.setVipPrice(product.getVipPrice());
		productService.update(newProduct);
		return "product_search";
	}

	public String search() {
		System.out.println("search");
		ProductPage productPage = productService.findAll(currentPage, pageSize);
		// System.out.println(productPage.getProductList().size());
		// System.out.println(productPage.getProductList().get(0).getProductName());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("productPage", productPage);
		return SUCCESS;
	}

	public String findById() {
		// System.out.println(product.getProductId());
		Products product1 = productService.findProductById(product
				.getProductId());
		ServletActionContext.getRequest().setAttribute("product", product1);
		// System.out.println(product1.getProductName());
		return "findById";
	}

	// 显示商品详细信息
	public String view() {
		// 根据ID获取商品对象
		Products product1 = productService.findProductById(product
				.getProductId());

		// 获得库存总量
		Iterator<Store> it = product1.getStores().iterator();
		int StoreNum = 0;
		while (it.hasNext()) {
			StoreNum += it.next().getStoreNum();
		}

		// 获得留言总量
		int messageNum = product1.getMessageboxes().size();
		// 将对象传到商品详情页面
		ServletActionContext.getRequest().setAttribute("product", product1);
		ServletActionContext.getRequest().setAttribute("storeNum", StoreNum);
		ServletActionContext.getRequest()
				.setAttribute("messageNum", messageNum);
		return "product_view";
	}

	public String doAdd() {
		BrandService brandService = new BrandServiceImpl();
		BrandPage brandPage = brandService.findAll(currentPage, pageSize);
		System.out.println(brandPage.getBrandList().size());
		ServletActionContext.getRequest().setAttribute("brandPage", brandPage);
		return "doAdd";
	}

	// 按照商品名称查询
	public String findByName() {
		// ProductPage
		// productList=productService.findProductByName(product.getProductName(),
		// currentPage, pageSize);
		// ServletActionContext.getRequest().setAttribute("productPage",
		// productList);
		// ProductPage productPage=productService.search(str, currentPage,
		// pageSize);

		System.out.println(str);
		ProductPage productPage = productService.search(
				product.getProductName(), currentPage, pageSize);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("productPage", productPage);
		return SUCCESS;
	}

	// 显示商品库存信息
	public String storeDetail() {
		Products product1 = productService.findProductById(product
				.getProductId());
		ServletActionContext.getRequest().setAttribute("product", product1);
		return "showStore";
	}

	// 显示商品的所有留言信息
	public String messageDetail() {
		System.out.println(product.getProductId());
		if (product.getProductId()==null) {
			product=(Products)ServletActionContext.getRequest().getAttribute(
					"product");
			Integer productId = Integer.valueOf(product.getProductId());
			Products product1 = productService.findProductById(productId
					);
			ServletActionContext.getRequest().setAttribute("product", product1);
			
		} else {
			Products product1 = productService.findProductById(product.getProductId());
			ServletActionContext.getRequest().setAttribute("product", product1);
		}
		//ServletActionContext.getRequest().setAttribute("product", product1);
		return "showMessage";
	}

	// 显示前台商品信息
	public String productPage() {
		ProductPage productPage = productService.findAll(currentPage, pageSize);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("productPage", productPage);
		return "productPage";
	}
	
	public String detailview(){
		//根据ID获取商品对象
		Integer pID;
		if(product.getProductId()==null){
			
			Messagebox message=(Messagebox)ServletActionContext.getRequest().getAttribute("message");
		    pID=message.getProducts().getProductId();
		}
		else{
		    pID=product.getProductId();
		}
		Products product1=productService.findProductById(pID);
		//获得库存总量
		Iterator<Store> it=product1.getStores().iterator();
		int StoreNum=0;
		while(it.hasNext()){  
			StoreNum+=it.next().getStoreNum();
		}

		// 获得留言总量
		int messageNum = product1.getMessageboxes().size();
		// 将对象传到商品详情页面
		ServletActionContext.getRequest().setAttribute("product", product1);
		ServletActionContext.getRequest().setAttribute("storeNum", StoreNum);
		ServletActionContext.getRequest()
				.setAttribute("messageNum", messageNum);
		return "product_detailview";
	}

	// 前台商品列表根据商品名称模糊查找
	public String frontSearch() {
		// System.out.println(str);
		ProductPage productPage = productService.search(str, currentPage,
				pageSize);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("productPage", productPage);
		// System.out.println(productPage.getProductList().size());
		return "productPage";
	}

	// 删除留言信息
	public String messDelete() {
		System.out.println(messageID);
		System.out.println(product.getProductId());
		ServletActionContext.getRequest().setAttribute("product",
				messageService.findMessById(messageID).getProducts());
		messageService.MessDelete(messageID);

		return "delete_mess_success";
	}

	@Override
	public Products getModel() {
		// TODO Auto-generated method stub
		return product;
	}

}
