package edu.mum.cs544;

public class InventoryService implements IInventoryService  {
    @Override
    public int getNumberInStock(int productNumber) {
        return productNumber-200;
    }
}
