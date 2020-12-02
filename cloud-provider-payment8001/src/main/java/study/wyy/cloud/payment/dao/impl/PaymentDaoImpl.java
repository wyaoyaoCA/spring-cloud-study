package study.wyy.cloud.payment.dao.impl;

import org.springframework.stereotype.Component;
import study.wyy.cloud.api.model.Payment;
import study.wyy.cloud.payment.dao.PaymentDao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wyaoyao
 * @data 2020-12-02 23:17
 */
@Component
public class PaymentDaoImpl implements PaymentDao {

    private Map<Long,Payment> map = new HashMap<>();

    private Long id = 1L;
    @Override
    public int create(Payment payment) {
        payment.setId(id);
        map.put(id,payment);
        id++;
        return 1;
    }

    @Override
    public Payment findById(Long id) {
        return map.get(id);
    }
}
