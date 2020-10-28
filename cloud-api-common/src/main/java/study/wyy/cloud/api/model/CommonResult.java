package study.wyy.cloud.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 8:59 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /*****
     * 错误码
     */
    private Integer code;

    /*****
     * 错误信息
     */
    private String message;
    /*****
     * 数据
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
