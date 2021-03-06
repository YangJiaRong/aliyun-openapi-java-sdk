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

package com.aliyuncs.cloudesl.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteItemBySkuIdRequest extends RpcAcsRequest<DeleteItemBySkuIdResponse> {
	
	public DeleteItemBySkuIdRequest() {
		super("cloudesl", "2018-08-01", "DeleteItemBySkuId");
	}

	private String storeId;

	private String skuId;

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putQueryParameter("StoreId", storeId);
		}
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
		if(skuId != null){
			putQueryParameter("SkuId", skuId);
		}
	}

	@Override
	public Class<DeleteItemBySkuIdResponse> getResponseClass() {
		return DeleteItemBySkuIdResponse.class;
	}

}
