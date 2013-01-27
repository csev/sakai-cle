/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/common/trunk/archive-api/src/main/java/org/sakaiproject/importer/api/IMSResourceTranslator.java $
 * $Id: IMSResourceTranslator.java 105077 2012-02-24 22:54:29Z ottenhoff@longsight.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.importer.api;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public interface IMSResourceTranslator {
	
	public Importable translate(Node resourceNode, Document descriptor, String contextPath, String archiveBasePath);
	
	public String getTypeName();
	
	public boolean processResourceChildren();

}