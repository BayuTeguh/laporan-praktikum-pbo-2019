package Polimorfisme;

public class ElectricityBill1841720207Bayu implements Payable1841720207Bayu{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720207Bayu(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwhBayu() {
        return mKwh;
    }

    public void setmKwhBayu(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategoryBayu() {
        return mCategory;
    }

    public void setmCategoryBayu(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmountBayu() {
        return mKwh*getBasePriceBayu();
    }
    
    public int getBasePriceBayu(){
        int bPrice = 0;
        switch(mCategory){
            case "R-1" : bPrice = 200;
            break;
            case "R-2" : bPrice = 100;
        }
        return bPrice;
    }

    public String getBillInfo(){
        return "Total Payment = "+getPaymentAmountBayu()+"\n"+
                "KWH = "+mKwh+"\n"+
                "Category = "+mCategory+"("+getBasePriceBayu()+" per KWH)\n";
    }
}
