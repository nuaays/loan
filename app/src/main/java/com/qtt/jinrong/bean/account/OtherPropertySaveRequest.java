package com.qtt.jinrong.bean.account;

import com.qtt.jinrong.bean.IRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanxin on 16/3/8.
 */
public class OtherPropertySaveRequest implements IRequest {

    private String userId;

    private String assetName;

    private float assetAge;

    private String assetDetail;

    private float assetPrice;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public float getAssetAge() {
        return assetAge;
    }

    public void setAssetAge(float assetAge) {
        this.assetAge = assetAge;
    }

    public String getAssetDetail() {
        return assetDetail;
    }

    public void setAssetDetail(String assetDetail) {
        this.assetDetail = assetDetail;
    }

    public float getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(float assetPrice) {
        this.assetPrice = assetPrice;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> map = new HashMap<>();
        map.put("userId",userId);
        map.put("assetName",assetName);
        map.put("assetAge",assetAge);
        map.put("assetDetail",assetDetail);
        map.put("assetPrice",assetPrice);
        return map;
    }
}