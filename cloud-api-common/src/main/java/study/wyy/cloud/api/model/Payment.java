package study.wyy.cloud.api.model;

import lombok.Data;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 8:57 下午
 */
@Data
public class Payment {

    private Long id;

    /*****
     * 流水号
     */
    private String serial;
}
