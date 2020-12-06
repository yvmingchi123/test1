package cn.bdqn.bdqnproject.utils.common;

import com.google.common.collect.Sets;
import org.apache.commons.collections.FunctorException;

import java.util.Set;

/**
 * 常量类
 *
 * @author 27498
 */
public class Const {

    /**
     * 代表当前用户
     */
    public static final String CURRENT_USER = "currentUser";

    public interface ProductListOrderBy {
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc", "price_asc");
    }

    public interface Cart {
        /**
         * 购物车选中状态
         */
        int CHECKED = 1;
        /**
         * 购物车未选中状态
         */
        int UN_CHECKED = 0;

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
    }

    /**
     * 校验数据时 担任不动数据 Email
     */
    public static final String EMAIL = "email";

    /**
     * 校验数据时 担任不动数据 username
     */
    public static final String USERNAME = "username";

    /**
     * 对角色进行分组
     */
    public interface Role {
        /**
         * 普通用户
         */
        int ROLE_CUSTOMER = 0;

        /**
         * 管理员
         */
        int ROLE_ADMIN = 1;
    }

    public enum ProductStatusEnum {
        /**
         * 在线
         */
        ON_SALE(1, "在线");
        private String value;
        private int code;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }


    public enum OrderStatusEnum {
        /**
         * 订单状态
         * ///订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4:已点评）
         */
        TO_BE_PAID(0, "待支付"),
        CANCELLED(1, "已取消"),
        SUCCESSFUL_PAYMENT(2, "支付成功"),
        CONSUMED(3, "已消费"),
        ORDER_SUCCESS(4, "已点评");

        OrderStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        private String value;
        private Integer code;

        public String getValue() {
            return value;
        }

        public Integer getCode() {
            return code;
        }

        public static OrderStatusEnum codeOf(int code) {
            for (OrderStatusEnum orderStatusEnum : values()) {
                if (orderStatusEnum.getCode() == code) {
                    return orderStatusEnum;
                }
            }
            throw new FunctorException("没有找到对应的枚举");
        }
    }

    public interface AlipayCallback {
        String TRADE_STATUS_WAIT_BUYER_PAY = "WAIT_BUYER_PAY";
        String TRADE_STATUS_TRADE_SUCCESS = "TRADE_SUCCESS";

        String RESPONSE_SUCCESS = "success";
        String RESPONSE_FAILED = "failed";
    }

    public enum PayPlatformEnum {
        /**
         * 阿里支付
         */
        ALIPAY(1, "支付宝");

        PayPlatformEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }


    public enum PaymentTypeEnum {
        /**
         * 阿里支付
         */
        ALIPAY(1, "支付宝支付");


        /**
         * 支付方式 目前只支持在线支付
         */
        //ONLINE_PAY(2, "在线支付");

        PaymentTypeEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static PaymentTypeEnum codeOf(int code) {
            for (PaymentTypeEnum paymentTypeEnum : values()) {
                if (paymentTypeEnum.code == code) {
                    return paymentTypeEnum;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }

    /**
     * redis过期时间以及常用变量
     */
    public interface RedisConst {
        /**
         * 会话时间
         */
        public final static int SESSION_TIMEOUT = 2 * 60 * 60;//默认2h
        /**
         * 置换保护时间
         */
        public final static int REPLACEMENT_PROTECTION_TIMEOUT = 60 * 60;
        /**
         * 旧token延迟过期时间
         */
        public final static int REPLACEMENT_DELAY = 2 * 60;
    }

    public interface UserType {
        int SELF_REGISTRATION = 0;
        int WECHAT_LOGIN = 1;
        int QQ_LOGIN = 2;
        int WEIBO_LOGIN = 3;
    }

    /**
     * 商品信息状态
     */
    public interface GoodsStatus {

        /**
         * 锁定库存
         */
        Integer LUCK_STOCK = 0;
        /**
         * 支付成功
         */
         Integer PAY_SUCCESS = 1;
        /**
         * 支付超时
         */
        Integer PAY_TIME_OUT = 2;
    }
    public interface RedisKeyLib{
        String GOODS_STOCK = "goodsstock:";
        String USER_REDIS = "token:";
    }
}
