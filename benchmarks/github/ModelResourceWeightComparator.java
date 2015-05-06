/* ./liferay-liferay-portal-b66e4b4/portal-service/src/com/liferay/portal/security/permission/comparator/ModelResourceWeightComparator.java */
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

package com.liferay.portal.security.permission.comparator;

import com.liferay.portal.security.permission.ResourceActionsUtil;

import java.io.Serializable;

import java.util.Comparator;

/**
 * @author Jorge Ferrer
 */
public class ModelResourceWeightComparator
	implements Comparator<String>, Serializable {

	@Override
	public int compare(String resource1, String resource2) {
		double weight1 = ResourceActionsUtil.getModelResourceWeight(resource1);
		double weight2 = ResourceActionsUtil.getModelResourceWeight(resource2);

		return Double.compare(weight1, weight2);
	}

}