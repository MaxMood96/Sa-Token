/*
 * Copyright 2020-2099 sa-token.cc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dev33.satoken.oauth2.data.model.loader;

import cn.dev33.satoken.oauth2.SaOAuth2Manager;
import cn.dev33.satoken.oauth2.config.SaOAuth2Config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Client应用信息 Model
 *
 * @author click33
 * @since 1.23.0
 */
public class SaClientModel implements Serializable {

	private static final long serialVersionUID = -6541180061782004705L;

	/**
	 * 应用id 
	 */
	public String clientId;
	
	/**
	 * 应用秘钥 
	 */
	public String clientSecret;

	/**
	 * 应用签约的所有权限
	 */
	public List<String> contractScopes;
	
	/**
	 * 应用允许授权的所有URL
	 */
	public List<String> allowUrls;

	/**
	 * 应用允许的所有 grant_type
	 */
	public List<String> allowGrantTypes = new ArrayList<>();

	/** 单独配置此Client：是否在每次 Refresh-Token 刷新 Access-Token 时，产生一个新的 Refresh-Token [默认取全局配置] */
	public Boolean isNewRefresh;

	/** 单独配置此Client：Access-Token 保存的时间(单位秒)  [默认取全局配置] */
	public long accessTokenTimeout;

	/** 单独配置此Client：Refresh-Token 保存的时间(单位秒) [默认取全局配置] */
	public long refreshTokenTimeout;

	/** 单独配置此Client：Client-Token 保存的时间(单位秒) [默认取全局配置] */
	public long clientTokenTimeout;

	/** 单独配置此Client：Past-Client-Token 保存的时间(单位：秒) [默认取全局配置] */
	public long pastClientTokenTimeout;

	
	public SaClientModel() {
		SaOAuth2Config config = SaOAuth2Manager.getConfig();
		this.isNewRefresh = config.getIsNewRefresh();
		this.accessTokenTimeout = config.getAccessTokenTimeout();
		this.refreshTokenTimeout = config.getRefreshTokenTimeout();
		this.clientTokenTimeout = config.getClientTokenTimeout();
		this.pastClientTokenTimeout = config.getPastClientTokenTimeout();
	}
	public SaClientModel(String clientId, String clientSecret, List<String> contractScopes, List<String> allowUrls) {
		super();
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.contractScopes = contractScopes;
		this.allowUrls = allowUrls;
	}

	/**
	 * @return 应用id
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId 应用id 
	 * @return 对象自身 
	 */
	public SaClientModel setClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}

	/**
	 * @return 应用秘钥 
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * @param clientSecret 应用秘钥 
	 * @return 对象自身 
	 */
	public SaClientModel setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
		return this;
	}

	/**
	 * @return 应用签约的所有权限
	 */
	public List<String> getContractScopes() {
		return contractScopes;
	}

	/**
	 * @param contractScopes 应用签约的所有权限
	 * @return 对象自身 
	 */
	public SaClientModel setContractScopes(List<String> contractScopes) {
		this.contractScopes = contractScopes;
		return this;
	}

	/**
	 * @return 应用允许授权的所有URL
	 */
	public List<String> getAllowUrls() {
		return allowUrls;
	}

	/**
	 * @param allowUrls 应用允许授权的所有URL
	 * @return 对象自身 
	 */
	public SaClientModel setAllowUrls(List<String> allowUrls) {
		this.allowUrls = allowUrls;
		return this;
	}

	/**
	 * @return 应用允许的所有 grant_type
	 */
	public List<String> getAllowGrantTypes() {
		return allowGrantTypes;
	}

	/**
	 * 应用允许的所有 grant_type
	 * @param allowGrantTypes /
	 * @return /
	 */
	public SaClientModel setAllowGrantTypes(List<String> allowGrantTypes) {
		this.allowGrantTypes = allowGrantTypes;
		return this;
	}

	/**
	 * @return 此Client：是否在每次 Refresh-Token 刷新 Access-Token 时，产生一个新的 Refresh-Token [默认取全局配置]
	 */
	public Boolean getIsNewRefresh() {
		return isNewRefresh;
	}
	
	/**
	 * @param isNewRefresh 单独配置此Client：是否在每次 Refresh-Token 刷新 Access-Token 时，产生一个新的 Refresh-Token [默认取全局配置]
	 * @return 对象自身 
	 */
	public SaClientModel setIsNewRefresh(Boolean isNewRefresh) {
		this.isNewRefresh = isNewRefresh;
		return this;
	}
	
	/**
	 * @return 此Client：Access-Token 保存的时间(单位秒)  [默认取全局配置]
	 */
	public long getAccessTokenTimeout() {
		return accessTokenTimeout;
	}
	
	/**
	 * @param accessTokenTimeout 单独配置此Client：Access-Token 保存的时间(单位秒)  [默认取全局配置]
	 * @return 对象自身 
	 */
	public SaClientModel setAccessTokenTimeout(long accessTokenTimeout) {
		this.accessTokenTimeout = accessTokenTimeout;
		return this;
	}
	
	/**
	 * @return 此Client：Refresh-Token 保存的时间(单位秒) [默认取全局配置]
	 */
	public long getRefreshTokenTimeout() {
		return refreshTokenTimeout;
	}
	
	/**
	 * @param refreshTokenTimeout 单独配置此Client：Refresh-Token 保存的时间(单位秒) [默认取全局配置]
	 * @return 对象自身 
	 */
	public SaClientModel setRefreshTokenTimeout(long refreshTokenTimeout) {
		this.refreshTokenTimeout = refreshTokenTimeout;
		return this;
	}
	
	/**
	 * @return 此Client：Client-Token 保存的时间(单位秒) [默认取全局配置]
	 */
	public long getClientTokenTimeout() {
		return clientTokenTimeout;
	}
	
	/**
	 * @param clientTokenTimeout 单独配置此Client：Client-Token 保存的时间(单位秒) [默认取全局配置]
	 * @return 对象自身 
	 */
	public SaClientModel setClientTokenTimeout(long clientTokenTimeout) {
		this.clientTokenTimeout = clientTokenTimeout;
		return this;
	}
	
	/**
	 * @return 此Client：Past-Client-Token 保存的时间(单位：秒) [默认取全局配置]
	 */
	public long getPastClientTokenTimeout() {
		return pastClientTokenTimeout;
	}
	
	/**
	 * @param pastClientTokenTimeout 单独配置此Client：Past-Client-Token 保存的时间(单位：秒) [默认取全局配置]
	 * @return 对象自身 
	 */
	public SaClientModel setPastClientTokenTimeout(long pastClientTokenTimeout) {
		this.pastClientTokenTimeout = pastClientTokenTimeout;
		return this;
	}
	
	//

	@Override
	public String toString() {
		return "SaClientModel{" +
				"clientId='" + clientId + '\'' +
				", clientSecret='" + clientSecret + '\'' +
				", contractScopes=" + contractScopes +
				", allowUrls=" + allowUrls +
				", allowGrantTypes=" + allowGrantTypes +
				", isNewRefresh=" + isNewRefresh +
				", accessTokenTimeout=" + accessTokenTimeout +
				", refreshTokenTimeout=" + refreshTokenTimeout +
				", clientTokenTimeout=" + clientTokenTimeout +
				", pastClientTokenTimeout=" + pastClientTokenTimeout +
				'}';
	}


	// 追加方法

	/**
	 * @param scopes 添加应用签约的所有权限
	 * @return 对象自身
	 */
	public SaClientModel addContractScopes(String... scopes) {
		if(this.contractScopes == null) {
			this.contractScopes = new ArrayList<>();
		}
		this.contractScopes.addAll(Arrays.asList(scopes));
		return this;
	}

	/**
	 * @param urls 添加应用允许授权的所有URL
	 * @return 对象自身
	 */
	public SaClientModel addAllowUrls(String... urls) {
		if(this.allowUrls == null) {
			this.allowUrls = new ArrayList<>();
		}
		this.allowUrls.addAll(Arrays.asList(urls));
		return this;
	}

	/**
	 * @param grantTypes 应用允许的所有 grant_type
	 * @return 对象自身
	 */
	public SaClientModel addAllowGrantTypes(String... grantTypes) {
		if(this.allowGrantTypes == null) {
			this.allowGrantTypes = new ArrayList<>();
		}
		this.allowGrantTypes.addAll(Arrays.asList(grantTypes));
		return this;
	}


}
