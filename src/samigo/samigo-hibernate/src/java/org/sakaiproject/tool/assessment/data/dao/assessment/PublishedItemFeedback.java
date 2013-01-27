/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/sam/trunk/samigo-hibernate/src/java/org/sakaiproject/tool/assessment/data/dao/assessment/PublishedItemFeedback.java $
 * $Id: PublishedItemFeedback.java 106463 2012-04-02 12:20:09Z david.horwitz@uct.ac.za $
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

package org.sakaiproject.tool.assessment.data.dao.assessment;
import org.sakaiproject.tool.assessment.data.ifc.assessment.ItemFeedbackIfc;
import org.sakaiproject.tool.assessment.data.ifc.assessment.ItemDataIfc;

import java.io.*;

import org.apache.log4j.*;

public class PublishedItemFeedback
    implements Serializable, ItemFeedbackIfc {
  static Category errorLogger = Category.getInstance("errorLogger");

  private static final long serialVersionUID = 7526471155622776147L;
  public static final String CORRECT_FEEDBACK = "Correct Feedback";
  public static final String INCORRECT_FEEDBACK = "InCorrect Feedback";

  private Long id;
  private ItemDataIfc item;
  private String typeId;
  private String text;

  public PublishedItemFeedback() {}

  public PublishedItemFeedback(PublishedItemData item, String typeId, String text) {
    this.item = item;
    this.typeId = typeId;
    this.text = text;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ItemDataIfc getItem() {
    return item;
  }

  public void setItem(ItemDataIfc item) {
    this.item = item;
  }

  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  private void writeObject(java.io.ObjectOutputStream out) throws IOException {
    out.defaultWriteObject();
  }

  private void readObject(java.io.ObjectInputStream in) throws IOException,
      ClassNotFoundException {
    in.defaultReadObject();
  }

}