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
 * 网站转发配置相关接口
 * 网站转发配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.ipanti.model.ModifyWebRuleResponse;

/**
 * 更新某条网站类规则
 */
class ModifyWebRuleExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PATCH";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}/webRules/{webRuleId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ModifyWebRuleResponse.class;
    }
}