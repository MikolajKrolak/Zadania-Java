public class Invoice {
    private String product_number, prodcut_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String prodcut_description, int quantity, double pricePerItem){
        this.product_number = product_number;
        this.prodcut_description = prodcut_description;

        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProduct_number() {
        return product_number;
    }
    public String getProdcut_description() {
        return prodcut_description;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }
    public void setProdcut_description(String prodcut_description) {
        this.prodcut_description = prodcut_description;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double Amount(){
        if (pricePerItem <= 0 || quantity <= 0) {
            return 0;
        } else {
            return quantity * pricePerItem;
        }
    }

}
