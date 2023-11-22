package org.example;

public class Producto {
   int productID;
   String productName;
   int supplierID;
   int CategoryID;
   String quantityPerUnit;
   float unitPrice;
   int unitsInStock;
   int unitsOnOrder;
   int reorderLevel;
   int disconinued;

    public Producto(int productID, String productName, int supplierID, int categoryID, String quantityPerUnit, float unitPrice, int unitsInStock, int unitsOnOrder, int reorderLevel, int disconinued) {
        this.productID = productID;
        this.productName = productName;
        this.supplierID = supplierID;
        CategoryID = categoryID;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.disconinued = disconinued;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", supplierID=" + supplierID +
                ", CategoryID=" + CategoryID +
                ", quantityPerUnit='" + quantityPerUnit + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitsInStock=" + unitsInStock +
                ", unitsOnOrder=" + unitsOnOrder +
                ", reorderLevel=" + reorderLevel +
                ", disconinued=" + disconinued +
                '}';
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public int getDisconinued() {
        return disconinued;
    }
}
