package FacadeDesignPattern2;

public class OrderFacade {
    Invoice invoice;
    Payment payment;
    ProductDAO productDAO;
    SendNotification sendNotification;


    OrderFacade()
    {
        invoice=new Invoice();
        payment=new Payment();
        productDAO=new ProductDAO();
        sendNotification=new SendNotification();
    }

    public void createOrder()
    {
        String product = productDAO.getProduct("test");
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();

        // order creation successfull
    }
}
