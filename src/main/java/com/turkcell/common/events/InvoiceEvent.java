package com.turkcell.common.events;
import java.util.Map;
public class InvoiceEvent {
    private int customerId;
    private int accountId;
    private int serviceAddress;
    private Map<Integer, Integer> productIds;
    private float totalAmount;
    public InvoiceEvent(int customerId, int accountId, int serviceAddress, Map<Integer, Integer> productIds, float totalAmount) {
        this.customerId = customerId;
        this.accountId = accountId;
        this.serviceAddress = serviceAddress;
        this.productIds = productIds;
        this.totalAmount = totalAmount;
    }
    public InvoiceEvent(){

    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getServiceAddress() {
        return serviceAddress;
    }
    public void setServiceAddress(int serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
    public Map<Integer, Integer> getProductIds() {
        return productIds;
    }
    public void setProductIds(Map<Integer, Integer> productIds) {
        this.productIds = productIds;
    }
    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
}
