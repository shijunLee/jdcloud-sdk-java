/*
 * Copyright 2018 JDCLOUD.COM
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

package com.jdcloud.sdk.service.function.model;


/**
 * code
 */
public class Code  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码压缩文件，base64编码
     */
    private String zipFile;

    /**
     * 在线编辑代码
     */
    private String onlineCode;

    /**
     * 代码所在对象存储的bucket名称
     */
    private String bucketName;

    /**
     * 代码所在对象存储的object名称
     */
    private String objectName;


    /**
     * get 代码压缩文件，base64编码
     *
     * @return
     */
    public String getZipFile() {
        return zipFile;
    }

    /**
     * set 代码压缩文件，base64编码
     *
     * @param zipFile
     */
    public void setZipFile(String zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * get 在线编辑代码
     *
     * @return
     */
    public String getOnlineCode() {
        return onlineCode;
    }

    /**
     * set 在线编辑代码
     *
     * @param onlineCode
     */
    public void setOnlineCode(String onlineCode) {
        this.onlineCode = onlineCode;
    }

    /**
     * get 代码所在对象存储的bucket名称
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set 代码所在对象存储的bucket名称
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * get 代码所在对象存储的object名称
     *
     * @return
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * set 代码所在对象存储的object名称
     *
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }


    /**
     * set 代码压缩文件，base64编码
     *
     * @param zipFile
     */
    public Code zipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    /**
     * set 在线编辑代码
     *
     * @param onlineCode
     */
    public Code onlineCode(String onlineCode) {
        this.onlineCode = onlineCode;
        return this;
    }

    /**
     * set 代码所在对象存储的bucket名称
     *
     * @param bucketName
     */
    public Code bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * set 代码所在对象存储的object名称
     *
     * @param objectName
     */
    public Code objectName(String objectName) {
        this.objectName = objectName;
        return this;
    }


}