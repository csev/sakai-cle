/**
 * $URL: https://source.sakaiproject.org/svn/sitestats/trunk/sitestats-impl/src/java/org/sakaiproject/sitestats/impl/report/fop/ReportInputSource.java $
 * $Id: ReportInputSource.java 105078 2012-02-24 23:00:38Z ottenhoff@longsight.com $
 *
 * Copyright (c) 2006-2009 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.sitestats.impl.report.fop;

import org.sakaiproject.sitestats.api.report.Report;
import org.xml.sax.InputSource;

public class ReportInputSource extends InputSource {
	private Report report;

	public ReportInputSource(Report report) {
		super();
		this.report = report;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}
	
}