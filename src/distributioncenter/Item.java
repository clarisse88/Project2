
package distributioncenter;


public class Item{
    
    private String itemCategory,itemDescription,itemBarcode;
    private int itemQty,itemCostPrice;
    
    public Item(String itemCategory,String itemDescription,String itemBarcode,int itemQty,int itemCostPrice){
        this.itemCategory = itemCategory;
        this.itemDescription= itemDescription;
        this.itemBarcode = itemBarcode;
        this.itemQty = itemQty;
        this.itemCostPrice = itemCostPrice;
    }
    
    public static String saveItem(Item item){
        StringBuilder buf = new StringBuilder ();
        buf.append(item.itemCategory).append(",").append(item.itemDescription).append(",").append(item.itemBarcode).append(",").append(item.itemQty).append(",").append(item.itemCostPrice);
        return buf.toString ();
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public int getItemCostPrice() {
        return itemCostPrice;
    }

    public void setItemCostPrice(int itemCostPrice) {
        this.itemCostPrice = itemCostPrice;
    }
    
    
}
