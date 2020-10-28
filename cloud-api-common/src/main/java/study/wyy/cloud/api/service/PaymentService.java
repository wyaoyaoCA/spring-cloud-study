package study.wyy.cloud.api.service;


import study.wyy.cloud.api.model.Payment;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 9:12 下午
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment findById( Long id);
}
