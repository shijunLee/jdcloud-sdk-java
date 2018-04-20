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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询云主机列表
 */
public class DescribeInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * instanceId - 实例ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
imageId - 镜像ID，模糊匹配，支持单个

     */
    private List<Filter> filters;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get instanceId - 实例ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
imageId - 镜像ID，模糊匹配，支持单个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set instanceId - 实例ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
imageId - 镜像ID，模糊匹配，支持单个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
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
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set instanceId - 实例ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
imageId - 镜像ID，模糊匹配，支持单个

     *
     * @param filters
     */
    public DescribeInstancesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to instanceId - 实例ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
status - 云主机状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
imageId - 镜像ID，模糊匹配，支持单个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}