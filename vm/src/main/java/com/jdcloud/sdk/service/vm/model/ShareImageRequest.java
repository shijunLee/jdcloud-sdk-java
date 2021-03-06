/*
 * Copyright 2018-2025 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * &quot;共享镜像，最多可共享给20个帐户&quot;
&quot;打包镜像暂不支持共享&quot;
&quot;不能操作非私有镜像&quot;
&quot;不能共享给自己&quot;

 */
public class ShareImageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要共享的帐户
     */
    private List<String> pins;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Image ID
     * Required:true
     */
    @Required
    private String imageId;


    /**
     * get 需要共享的帐户
     *
     * @return
     */
    public List<String> getPins() {
        return pins;
    }

    /**
     * set 需要共享的帐户
     *
     * @param pins
     */
    public void setPins(List<String> pins) {
        this.pins = pins;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get Image ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set Image ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * set 需要共享的帐户
     *
     * @param pins
     */
    public ShareImageRequest pins(List<String> pins) {
        this.pins = pins;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ShareImageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set Image ID
     *
     * @param imageId
     */
    public ShareImageRequest imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * add item to 需要共享的帐户
     *
     * @param pin
     */
    public void addPin(String pin) {
        if (this.pins == null) {
            this.pins = new ArrayList<>();
        }
        this.pins.add(pin);
    }

}