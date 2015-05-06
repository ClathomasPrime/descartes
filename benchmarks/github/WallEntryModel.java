/* ./liferay-liferay-portal-b66e4b4/modules/apps/social/social-networking-api/src/com/liferay/social/networking/model/WallEntryModel.java */
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

package com.liferay.social.networking.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WallEntry service. Represents a row in the &quot;WallEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.social.networking.model.impl.WallEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.social.networking.model.impl.WallEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WallEntry
 * @see com.liferay.social.networking.model.impl.WallEntryImpl
 * @see com.liferay.social.networking.model.impl.WallEntryModelImpl
 * @generated
 */
@ProviderType
public interface WallEntryModel extends BaseModel<WallEntry>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a wall entry model instance should use the {@link WallEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this wall entry.
	 *
	 * @return the primary key of this wall entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this wall entry.
	 *
	 * @param primaryKey the primary key of this wall entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the wall entry ID of this wall entry.
	 *
	 * @return the wall entry ID of this wall entry
	 */
	public long getWallEntryId();

	/**
	 * Sets the wall entry ID of this wall entry.
	 *
	 * @param wallEntryId the wall entry ID of this wall entry
	 */
	public void setWallEntryId(long wallEntryId);

	/**
	 * Returns the group ID of this wall entry.
	 *
	 * @return the group ID of this wall entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this wall entry.
	 *
	 * @param groupId the group ID of this wall entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this wall entry.
	 *
	 * @return the company ID of this wall entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this wall entry.
	 *
	 * @param companyId the company ID of this wall entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this wall entry.
	 *
	 * @return the user ID of this wall entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this wall entry.
	 *
	 * @param userId the user ID of this wall entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this wall entry.
	 *
	 * @return the user uuid of this wall entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this wall entry.
	 *
	 * @param userUuid the user uuid of this wall entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this wall entry.
	 *
	 * @return the user name of this wall entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this wall entry.
	 *
	 * @param userName the user name of this wall entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this wall entry.
	 *
	 * @return the create date of this wall entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this wall entry.
	 *
	 * @param createDate the create date of this wall entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this wall entry.
	 *
	 * @return the modified date of this wall entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this wall entry.
	 *
	 * @param modifiedDate the modified date of this wall entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the comments of this wall entry.
	 *
	 * @return the comments of this wall entry
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this wall entry.
	 *
	 * @param comments the comments of this wall entry
	 */
	public void setComments(String comments);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.liferay.social.networking.model.WallEntry wallEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.social.networking.model.WallEntry> toCacheModel();

	@Override
	public com.liferay.social.networking.model.WallEntry toEscapedModel();

	@Override
	public com.liferay.social.networking.model.WallEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}