package in.elc;

import in.blc.ProductDetails;

public class InitializeInstanceVariable {
	public static void main(String[] args) {
		new ProductDetails().setProductData(01, "LCD", 15000);
		new ProductDetails().getProductInfo();
	}
}