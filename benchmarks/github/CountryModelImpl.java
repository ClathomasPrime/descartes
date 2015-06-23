/* ./liferay-liferay-portal-b66e4b4/portal-impl/src/com/liferay/portal/model/impl/CountryModelImpl.java */
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

package com.liferay.portal.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.CountryModel;
import com.liferay.portal.model.CountrySoap;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Country service. Represents a row in the &quot;Country&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CountryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CountryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CountryImpl
 * @see Country
 * @see CountryModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CountryModelImpl extends BaseModelImpl<Country>
	implements CountryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a country model instance should use the {@link Country} interface instead.
	 */
	public static final String TABLE_NAME = "Country";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mvccVersion", Types.BIGINT },
			{ "countryId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "a2", Types.VARCHAR },
			{ "a3", Types.VARCHAR },
			{ "number_", Types.VARCHAR },
			{ "idd_", Types.VARCHAR },
			{ "zipRequired", Types.BOOLEAN },
			{ "active_", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table Country (mvccVersion LONG default 0,countryId LONG not null primary key,name VARCHAR(75) null,a2 VARCHAR(75) null,a3 VARCHAR(75) null,number_ VARCHAR(75) null,idd_ VARCHAR(75) null,zipRequired BOOLEAN,active_ BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Country";
	public static final String ORDER_BY_JPQL = " ORDER BY country.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Country.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.Country"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.Country"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.column.bitmask.enabled.com.liferay.portal.model.Country"),
			true);
	public static final long A2_COLUMN_BITMASK = 1L;
	public static final long A3_COLUMN_BITMASK = 2L;
	public static final long ACTIVE_COLUMN_BITMASK = 4L;
	public static final long NAME_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Country toModel(CountrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Country model = new CountryImpl();

		model.setMvccVersion(soapModel.getMvccVersion());
		model.setCountryId(soapModel.getCountryId());
		model.setName(soapModel.getName());
		model.setA2(soapModel.getA2());
		model.setA3(soapModel.getA3());
		model.setNumber(soapModel.getNumber());
		model.setIdd(soapModel.getIdd());
		model.setZipRequired(soapModel.getZipRequired());
		model.setActive(soapModel.getActive());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Country> toModels(CountrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Country> models = new ArrayList<Country>(soapModels.length);

		for (CountrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.Country"));

	public CountryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _countryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCountryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _countryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Country.class;
	}

	@Override
	public String getModelClassName() {
		return Country.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("countryId", getCountryId());
		attributes.put("name", getName());
		attributes.put("a2", getA2());
		attributes.put("a3", getA3());
		attributes.put("number", getNumber());
		attributes.put("idd", getIdd());
		attributes.put("zipRequired", getZipRequired());
		attributes.put("active", getActive());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String a2 = (String)attributes.get("a2");

		if (a2 != null) {
			setA2(a2);
		}

		String a3 = (String)attributes.get("a3");

		if (a3 != null) {
			setA3(a3);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String idd = (String)attributes.get("idd");

		if (idd != null) {
			setIdd(idd);
		}

		Boolean zipRequired = (Boolean)attributes.get("zipRequired");

		if (zipRequired != null) {
			setZipRequired(zipRequired);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	@JSON
	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

	@JSON
	@Override
	public long getCountryId() {
		return _countryId;
	}

	@Override
	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getA2() {
		if (_a2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _a2;
		}
	}

	@Override
	public void setA2(String a2) {
		_columnBitmask |= A2_COLUMN_BITMASK;

		if (_originalA2 == null) {
			_originalA2 = _a2;
		}

		_a2 = a2;
	}

	public String getOriginalA2() {
		return GetterUtil.getString(_originalA2);
	}

	@JSON
	@Override
	public String getA3() {
		if (_a3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _a3;
		}
	}

	@Override
	public void setA3(String a3) {
		_columnBitmask |= A3_COLUMN_BITMASK;

		if (_originalA3 == null) {
			_originalA3 = _a3;
		}

		_a3 = a3;
	}

	public String getOriginalA3() {
		return GetterUtil.getString(_originalA3);
	}

	@JSON
	@Override
	public String getNumber() {
		if (_number == null) {
			return StringPool.BLANK;
		}
		else {
			return _number;
		}
	}

	@Override
	public void setNumber(String number) {
		_number = number;
	}

	@JSON
	@Override
	public String getIdd() {
		if (_idd == null) {
			return StringPool.BLANK;
		}
		else {
			return _idd;
		}
	}

	@Override
	public void setIdd(String idd) {
		_idd = idd;
	}

	@JSON
	@Override
	public boolean getZipRequired() {
		return _zipRequired;
	}

	@Override
	public boolean isZipRequired() {
		return _zipRequired;
	}

	@Override
	public void setZipRequired(boolean zipRequired) {
		_zipRequired = zipRequired;
	}

	@JSON
	@Override
	public boolean getActive() {
		return _active;
	}

	@Override
	public boolean isActive() {
		return _active;
	}

	@Override
	public void setActive(boolean active) {
		_columnBitmask |= ACTIVE_COLUMN_BITMASK;

		if (!_setOriginalActive) {
			_setOriginalActive = true;

			_originalActive = _active;
		}

		_active = active;
	}

	public boolean getOriginalActive() {
		return _originalActive;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Country.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Country toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Country)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CountryImpl countryImpl = new CountryImpl();

		countryImpl.setMvccVersion(getMvccVersion());
		countryImpl.setCountryId(getCountryId());
		countryImpl.setName(getName());
		countryImpl.setA2(getA2());
		countryImpl.setA3(getA3());
		countryImpl.setNumber(getNumber());
		countryImpl.setIdd(getIdd());
		countryImpl.setZipRequired(getZipRequired());
		countryImpl.setActive(getActive());

		countryImpl.resetOriginalValues();

		return countryImpl;
	}

	@Override
	public int compareTo(Country country) {
		int value = 0;

		value = getName().compareTo(country.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Country)) {
			return false;
		}

		Country country = (Country)obj;

		long primaryKey = country.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CountryModelImpl countryModelImpl = this;

		countryModelImpl._originalName = countryModelImpl._name;

		countryModelImpl._originalA2 = countryModelImpl._a2;

		countryModelImpl._originalA3 = countryModelImpl._a3;

		countryModelImpl._originalActive = countryModelImpl._active;

		countryModelImpl._setOriginalActive = false;

		countryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Country> toCacheModel() {
		CountryCacheModel countryCacheModel = new CountryCacheModel();

		countryCacheModel.mvccVersion = getMvccVersion();

		countryCacheModel.countryId = getCountryId();

		countryCacheModel.name = getName();

		String name = countryCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			countryCacheModel.name = null;
		}

		countryCacheModel.a2 = getA2();

		String a2 = countryCacheModel.a2;

		if ((a2 != null) && (a2.length() == 0)) {
			countryCacheModel.a2 = null;
		}

		countryCacheModel.a3 = getA3();

		String a3 = countryCacheModel.a3;

		if ((a3 != null) && (a3.length() == 0)) {
			countryCacheModel.a3 = null;
		}

		countryCacheModel.number = getNumber();

		String number = countryCacheModel.number;

		if ((number != null) && (number.length() == 0)) {
			countryCacheModel.number = null;
		}

		countryCacheModel.idd = getIdd();

		String idd = countryCacheModel.idd;

		if ((idd != null) && (idd.length() == 0)) {
			countryCacheModel.idd = null;
		}

		countryCacheModel.zipRequired = getZipRequired();

		countryCacheModel.active = getActive();

		return countryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{mvccVersion=");
		sb.append(getMvccVersion());
		sb.append(", countryId=");
		sb.append(getCountryId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", a2=");
		sb.append(getA2());
		sb.append(", a3=");
		sb.append(getA3());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", idd=");
		sb.append(getIdd());
		sb.append(", zipRequired=");
		sb.append(getZipRequired());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.Country");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mvccVersion</column-name><column-value><![CDATA[");
		sb.append(getMvccVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryId</column-name><column-value><![CDATA[");
		sb.append(getCountryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>a2</column-name><column-value><![CDATA[");
		sb.append(getA2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>a3</column-name><column-value><![CDATA[");
		sb.append(getA3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idd</column-name><column-value><![CDATA[");
		sb.append(getIdd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zipRequired</column-name><column-value><![CDATA[");
		sb.append(getZipRequired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Country.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Country.class
		};
	private long _mvccVersion;
	private long _countryId;
	private String _name;
	private String _originalName;
	private String _a2;
	private String _originalA2;
	private String _a3;
	private String _originalA3;
	private String _number;
	private String _idd;
	private boolean _zipRequired;
	private boolean _active;
	private boolean _originalActive;
	private boolean _setOriginalActive;
	private long _columnBitmask;
	private Country _escapedModel;
}