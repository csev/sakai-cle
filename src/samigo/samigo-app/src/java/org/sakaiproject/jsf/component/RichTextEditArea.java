/**********************************************************************************
* $URL: https://source.sakaiproject.org/svn/sam/trunk/samigo-app/src/java/org/sakaiproject/jsf/component/RichTextEditArea.java $
* $Id: RichTextEditArea.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
***********************************************************************************
*
 * Copyright (c) 2005, 2006, 2008 The Sakai Foundation
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

package org.sakaiproject.jsf.component;

import javax.faces.component.UIInput;

public class RichTextEditArea extends UIInput
{
	public RichTextEditArea()
	{
		super();
		this.setRendererType("SakaiRichTextEditArea");
	}

	public String getFamily()
	{
		return "SakaiRichTextEditArea";
	}
}