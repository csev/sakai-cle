/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/trunk/samigo-services/src/java/org/sakaiproject/tool/assessment/integration/helper/ifc/ServerConfigurationServiceHelper.java $
 * $Id: ServerConfigurationServiceHelper.java 106521 2012-04-04 08:14:42Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2004, 2005, 2006, 2008 The Sakai Foundation
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


package org.sakaiproject.tool.assessment.integration.helper.ifc;


public interface ServerConfigurationServiceHelper{
    public String getString(String key, String defaultValue);
}

