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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.common.model;


/**
 * quota
 */
public class Quota  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配额项的名称
     */
    private String name;

    /**
     * 配额
     */
    private Integer max;

    /**
     * 已使用的数目
     */
    private Integer used;


    /**
     * get 配额项的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 配额项的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 配额
     *
     * @return
     */
    public Integer getMax() {
        return max;
    }

    /**
     * set 配额
     *
     * @param max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * get 已使用的数目
     *
     * @return
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * set 已使用的数目
     *
     * @param used
     */
    public void setUsed(Integer used) {
        this.used = used;
    }


    /**
     * set 配额项的名称
     *
     * @param name
     */
    public Quota name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 配额
     *
     * @param max
     */
    public Quota max(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * set 已使用的数目
     *
     * @param used
     */
    public Quota used(Integer used) {
        this.used = used;
        return this;
    }


}