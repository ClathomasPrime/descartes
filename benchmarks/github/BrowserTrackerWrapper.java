/* ./liferay-liferay-portal-b66e4b4/portal-service/src/com/liferay/portal/model/BrowserTrackerWrapper.java */
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Validator;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BrowserTracker}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrowserTracker
 * @generated
 */
@ProviderType
public class BrowserTrackerWrapper implements BrowserTracker,
	ModelWrapper<BrowserTracker> {
	public BrowserTrackerWrapper(BrowserTracker browserTracker) {
		_browserTracker = browserTracker;
	}

	@Override
	public Class<?> getModelClass() {
		return BrowserTracker.class;
	}

	@Override
	public String getModelClassName() {
		return BrowserTracker.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("browserTrackerId", getBrowserTrackerId());
		attributes.put("userId", getUserId());
		attributes.put("browserKey", getBrowserKey());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long browserTrackerId = (Long)attributes.get("browserTrackerId");

		if (browserTrackerId != null) {
			setBrowserTrackerId(browserTrackerId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long browserKey = (Long)attributes.get("browserKey");

		if (browserKey != null) {
			setBrowserKey(browserKey);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new BrowserTrackerWrapper((BrowserTracker)_browserTracker.clone());
	}

	@Override
	public int compareTo(com.liferay.portal.model.BrowserTracker browserTracker) {
		return _browserTracker.compareTo(browserTracker);
	}

	/**
	* Returns the browser key of this browser tracker.
	*
	* @return the browser key of this browser tracker
	*/
	@Override
	public long getBrowserKey() {
		return _browserTracker.getBrowserKey();
	}

	/**
	* Returns the browser tracker ID of this browser tracker.
	*
	* @return the browser tracker ID of this browser tracker
	*/
	@Override
	public long getBrowserTrackerId() {
		return _browserTracker.getBrowserTrackerId();
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _browserTracker.getExpandoBridge();
	}

	/**
	* Returns the mvcc version of this browser tracker.
	*
	* @return the mvcc version of this browser tracker
	*/
	@Override
	public long getMvccVersion() {
		return _browserTracker.getMvccVersion();
	}

	/**
	* Returns the primary key of this browser tracker.
	*
	* @return the primary key of this browser tracker
	*/
	@Override
	public long getPrimaryKey() {
		return _browserTracker.getPrimaryKey();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _browserTracker.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this browser tracker.
	*
	* @return the user ID of this browser tracker
	*/
	@Override
	public long getUserId() {
		return _browserTracker.getUserId();
	}

	/**
	* Returns the user uuid of this browser tracker.
	*
	* @return the user uuid of this browser tracker
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _browserTracker.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _browserTracker.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _browserTracker.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _browserTracker.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _browserTracker.isNew();
	}

	@Override
	public void persist() {
		_browserTracker.persist();
	}

	/**
	* Sets the browser key of this browser tracker.
	*
	* @param browserKey the browser key of this browser tracker
	*/
	@Override
	public void setBrowserKey(long browserKey) {
		_browserTracker.setBrowserKey(browserKey);
	}

	/**
	* Sets the browser tracker ID of this browser tracker.
	*
	* @param browserTrackerId the browser tracker ID of this browser tracker
	*/
	@Override
	public void setBrowserTrackerId(long browserTrackerId) {
		_browserTracker.setBrowserTrackerId(browserTrackerId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_browserTracker.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_browserTracker.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_browserTracker.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_browserTracker.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the mvcc version of this browser tracker.
	*
	* @param mvccVersion the mvcc version of this browser tracker
	*/
	@Override
	public void setMvccVersion(long mvccVersion) {
		_browserTracker.setMvccVersion(mvccVersion);
	}

	@Override
	public void setNew(boolean n) {
		_browserTracker.setNew(n);
	}

	/**
	* Sets the primary key of this browser tracker.
	*
	* @param primaryKey the primary key of this browser tracker
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_browserTracker.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_browserTracker.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this browser tracker.
	*
	* @param userId the user ID of this browser tracker
	*/
	@Override
	public void setUserId(long userId) {
		_browserTracker.setUserId(userId);
	}

	/**
	* Sets the user uuid of this browser tracker.
	*
	* @param userUuid the user uuid of this browser tracker
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_browserTracker.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.model.BrowserTracker> toCacheModel() {
		return _browserTracker.toCacheModel();
	}

	@Override
	public com.liferay.portal.model.BrowserTracker toEscapedModel() {
		return new BrowserTrackerWrapper(_browserTracker.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _browserTracker.toString();
	}

	@Override
	public com.liferay.portal.model.BrowserTracker toUnescapedModel() {
		return new BrowserTrackerWrapper(_browserTracker.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _browserTracker.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BrowserTrackerWrapper)) {
			return false;
		}

		BrowserTrackerWrapper browserTrackerWrapper = (BrowserTrackerWrapper)obj;

		if (Validator.equals(_browserTracker,
					browserTrackerWrapper._browserTracker)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	@Deprecated
	public BrowserTracker getWrappedBrowserTracker() {
		return _browserTracker;
	}

	@Override
	public BrowserTracker getWrappedModel() {
		return _browserTracker;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _browserTracker.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _browserTracker.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_browserTracker.resetOriginalValues();
	}

	private final BrowserTracker _browserTracker;
}