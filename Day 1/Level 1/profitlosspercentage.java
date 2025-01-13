public class profitlosspercentage{
public static void main(String args[]){
int costprice=129;
int sellingprice=191;
//calculating profit
int profit=sellingprice-costprice;
double profitpercentage=((double)profit /(double) costprice) * 100;
System.out.println("The Cost Price is INR " +costprice + " and Selling Price is "+sellingprice+" \n"+"The Profit is INR "+ profit +" and the Profit Percentage is "+ profitpercentage);
}
}