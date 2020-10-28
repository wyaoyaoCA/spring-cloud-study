package study.wyy.cloud.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.wyy.cloud.api.model.Payment;
import study.wyy.cloud.api.service.PaymentService;
import study.wyy.cloud.payment.dao.PaymentDao;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 9:13 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentDao paymentDao;

    @Autowired
    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
