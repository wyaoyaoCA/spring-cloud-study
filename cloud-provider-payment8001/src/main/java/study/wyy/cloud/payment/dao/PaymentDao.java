package study.wyy.cloud.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import study.wyy.cloud.api.model.Payment;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 9:00 下午
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment findById(@Param("id") Long id);

}
