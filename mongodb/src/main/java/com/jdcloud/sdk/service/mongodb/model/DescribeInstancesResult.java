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
 * instance相关接口
 * API related to MONGODB instances
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mongodb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.mongodb.model.DBInstance;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询实例信息
 */
public class DescribeInstancesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dbInstances
     */
    private List<DBInstance> dbInstances;

    /**
     * totalCount
     */
    private Integer totalCount;

    /**
     * pageNumber
     */
    private Integer pageNumber;


    /**
     * get dbInstances
     *
     * @return
     */
    public List<DBInstance> getDbInstances() {
        return dbInstances;
    }

    /**
     * set dbInstances
     *
     * @param dbInstances
     */
    public void setDbInstances(List<DBInstance> dbInstances) {
        this.dbInstances = dbInstances;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get pageNumber
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set pageNumber
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * set dbInstances
     *
     * @param dbInstances
     */
    public DescribeInstancesResult dbInstances(List<DBInstance> dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeInstancesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set pageNumber
     *
     * @param pageNumber
     */
    public DescribeInstancesResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * add item to dbInstances
     *
     * @param dbInstance
     */
    public void addDbInstance(DBInstance dbInstance) {
        if (this.dbInstances == null) {
            this.dbInstances = new ArrayList<>();
        }
        this.dbInstances.add(dbInstance);
    }

}