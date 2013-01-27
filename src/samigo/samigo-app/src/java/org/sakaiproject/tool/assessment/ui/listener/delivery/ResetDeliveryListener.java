/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/trunk/samigo-app/src/java/org/sakaiproject/tool/assessment/ui/listener/delivery/ResetDeliveryListener.java $
 * $Id: ResetDeliveryListener.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
 ***********************************************************************************
 *
 * Copyright (c) 2006, 2008 The Sakai Foundation
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



package org.sakaiproject.tool.assessment.ui.listener.delivery;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.sakaiproject.tool.assessment.ui.bean.delivery.DeliveryBean;
import org.sakaiproject.tool.assessment.ui.listener.util.ContextUtil;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p>Title: Samigo</p>
 * <p>Purpose:  this module handles the beginning of the assessment
 * <p>Description: Sakai Assessment Manager</p>
 * @version $Id: ResetDeliveryListener.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
 */

public class ResetDeliveryListener implements ActionListener
{
  private static Log log = LogFactory.getLog(ResetDeliveryListener.class);
  private static ContextUtil cu;

  /**
   * ACTION.
   * @param ae
   * @throws AbortProcessingException
   */
  public void processAction(ActionEvent ae) throws
    AbortProcessingException
  {
    DeliveryBean bean = (DeliveryBean) cu.lookupBean("delivery");
    if (!("takeAssessmentViaUrl").equals(bean.getActionString()))
      bean.setPublishedAssessment(null);
    bean.setPublishedItemHash(new HashMap());
    bean.setPublishedItemTextHash(new HashMap());
    bean.setPublishedAnswerHash(new HashMap());
    // reset timer before begin
    bean.setTimeElapse("0");
    bean.setTimeElapseAfterFileUpload(null);
    bean.setLastTimer(0);
    bean.setTimeLimit("0");
  }
}