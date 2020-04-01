//package com.test.mypaypal;
//
//import com.paypal.api.payments.*;
//import com.paypal.base.rest.APIContext;
//import com.paypal.base.rest.PayPalRESTException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ViaService {
//
//    @Autowired
//    APIContext apiContext;
//
//    public Payment createPayment(Double total, String currency, String paymentMethod) throws PayPalRESTException {
//        Amount amount = new Amount();
//        amount.setCurrency("USD");
//        amount.setTotal(String.format("%.2f", total));
//
//        Transaction transaction = new Transaction();
//        transaction.setAmount(amount);
//        List<Transaction> transactions = new ArrayList<Transaction>();
//        transactions.add(transaction);
//
//        Payer payer = new Payer();
//        payer.setPaymentMethod("PAYPAL");
//
//        Payment payment = new Payment();
//        payment.setPayer(payer);
//        payment.setTransactions(transactions);
//
//        RedirectUrls redirectUrls = new RedirectUrls();
//        redirectUrls.setCancelUrl("https://example.com/cancel");
//        redirectUrls.setReturnUrl("https://example.com/return");
//        payment.setRedirectUrls(redirectUrls);
//
//        return payment.create(apiContext);
//
////        public Payment executePayment(){
////
////            PaymentExecution paymentExecute = new PaymentExecution();
////            return payment.execute(apiContext, paymentExecute);
////        }
//
//    }
//
//    public Payment executePayment(String paymentId, String payerId) throws PayPalRESTException {
//        Payment payment = new Payment();
//        payment.setId(paymentId);
//        PaymentExecution paymentExecute = new PaymentExecution();
//        paymentExecute.setPayerId(payerId);
//        return payment.execute(apiContext, paymentExecute);
//    }
//}
