package com.kainos.ea;

public class SalesEmployee extends Employee {
    private int totalSales;
    private double commissionRate;

    public SalesEmployee(){

    }

    public SalesEmployee(short employeeID, String newFName, String newLName,
                         String newCity, String newPostcode, String newStreetAddr,
                         String newSortCode, String newBan, String newNIN, String newDepartment,
                         int newSalary, int newTotalSales, double newCommissionRate) {
        super(employeeID, newFName, newLName,
                newCity, newPostcode, newStreetAddr,
                newSortCode, newBan, newNIN, newDepartment,
                newSalary);
        setTotalSales(newTotalSales);
        setCommissionRate(newCommissionRate);
    }

    @Override
    public int calcPay() {
        return (int) (super.calcPay() + calcCommission());
    }

    private int calcCommission(){
        return (int)(commissionRate * totalSales);
    }


    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        if(totalSales>0) this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate>0.00) this.commissionRate = commissionRate;
    }


}
