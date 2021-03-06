/* ./liferay-liferay-portal-b66e4b4/portal-impl/src/com/liferay/portal/tools/comparator/JavaMethodComparator.java */
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

package com.liferay.portal.tools.comparator;

import com.thoughtworks.qdox.model.JavaMethod;

import java.util.Comparator;

/**
 * @author Brian Wing Shun Chan
 */
public class JavaMethodComparator implements Comparator<JavaMethod> {

	@Override
	public int compare(JavaMethod method1, JavaMethod method2) {
		String name1 = method1.getName();
		String name2 = method2.getName();

		return name1.compareTo(name2);
	}

}