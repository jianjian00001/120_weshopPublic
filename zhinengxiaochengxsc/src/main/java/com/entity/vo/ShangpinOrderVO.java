package com.entity.vo;

import com.entity.ShangpinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shangpin_order")
public class ShangpinOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "shangpin_order_uuid_number")
    private String shangpinOrderUuidNumber;


    /**
     * 收货地址
     */

    @TableField(value = "address_id")
    private Integer addressId;


    /**
     * 商品
     */

    @TableField(value = "shangpin_id")
    private Integer shangpinId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "shangpin_order_true_price")
    private Double shangpinOrderTruePrice;


    /**
     * 快递公司
     */

    @TableField(value = "shangpin_order_courier_name")
    private String shangpinOrderCourierName;


    /**
     * 订单快递单号
     */

    @TableField(value = "shangpin_order_courier_number")
    private String shangpinOrderCourierNumber;


    /**
     * 订单类型
     */

    @TableField(value = "shangpin_order_types")
    private Integer shangpinOrderTypes;


    /**
     * 支付类型
     */

    @TableField(value = "shangpin_order_payment_types")
    private Integer shangpinOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getShangpinOrderUuidNumber() {
        return shangpinOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setShangpinOrderUuidNumber(String shangpinOrderUuidNumber) {
        this.shangpinOrderUuidNumber = shangpinOrderUuidNumber;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 获取：收货地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：商品
	 */
    public Integer getShangpinId() {
        return shangpinId;
    }


    /**
	 * 获取：商品
	 */

    public void setShangpinId(Integer shangpinId) {
        this.shangpinId = shangpinId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getShangpinOrderTruePrice() {
        return shangpinOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setShangpinOrderTruePrice(Double shangpinOrderTruePrice) {
        this.shangpinOrderTruePrice = shangpinOrderTruePrice;
    }
    /**
	 * 设置：快递公司
	 */
    public String getShangpinOrderCourierName() {
        return shangpinOrderCourierName;
    }


    /**
	 * 获取：快递公司
	 */

    public void setShangpinOrderCourierName(String shangpinOrderCourierName) {
        this.shangpinOrderCourierName = shangpinOrderCourierName;
    }
    /**
	 * 设置：订单快递单号
	 */
    public String getShangpinOrderCourierNumber() {
        return shangpinOrderCourierNumber;
    }


    /**
	 * 获取：订单快递单号
	 */

    public void setShangpinOrderCourierNumber(String shangpinOrderCourierNumber) {
        this.shangpinOrderCourierNumber = shangpinOrderCourierNumber;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getShangpinOrderTypes() {
        return shangpinOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setShangpinOrderTypes(Integer shangpinOrderTypes) {
        this.shangpinOrderTypes = shangpinOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getShangpinOrderPaymentTypes() {
        return shangpinOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setShangpinOrderPaymentTypes(Integer shangpinOrderPaymentTypes) {
        this.shangpinOrderPaymentTypes = shangpinOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
