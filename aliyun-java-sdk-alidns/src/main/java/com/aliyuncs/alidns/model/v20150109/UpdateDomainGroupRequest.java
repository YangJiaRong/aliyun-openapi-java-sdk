/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateDomainGroupRequest extends RpcAcsRequest<UpdateDomainGroupResponse> {
	
	public UpdateDomainGroupRequest() {
		super("Alidns", "2015-01-09", "UpdateDomainGroup");
	}

	private String lang;

	private String userClientIp;

	private String groupId;

	private String groupName;

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		putQueryParameter("Lang", lang);
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		putQueryParameter("UserClientIp", userClientIp);
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		putQueryParameter("GroupName", groupName);
	}

	@Override
	public Class<UpdateDomainGroupResponse> getResponseClass() {
		return UpdateDomainGroupResponse.class;
	}

}
