/**
 * $URL: https://source.sakaiproject.org/svn/sitestats/trunk/sitestats-impl/src/test/org/sakaiproject/sitestats/test/mocks/FakeEvent.java $
 * $Id: FakeEvent.java 105078 2012-02-24 23:00:38Z ottenhoff@longsight.com $
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
/**
 * FakeEvent.java - created by aaronz on Jul 25, 2007
 */

package org.sakaiproject.sitestats.test.mocks;

import java.util.Date;

import org.sakaiproject.event.api.Event;
import org.sakaiproject.sitestats.test.data.FakeData;

/**
 * Why must I be made to suffer like this? Why can't I instantiate an Event object? Is that really
 * so bad? Anyway, this class is here because of the policy of making objects which cannot be
 * instantiated everywhere or using interfaces so that we have to make up our own objects just to
 * run a test case, this might seem good to some people but it wastes many hours of developer time
 * in frustration and busy work like making this class and then having to rant about it...
 * 
 * @author Aaron Zeckoski (aaronz@vt.edu)
 */
public class FakeEvent implements Event {

   private String event = "test.event.name";
   private String resource = "/prefix/id";
   private String context = null;
   private boolean modify = true;
   private int priority = 3;

   public FakeEvent() {
   }
   
   public FakeEvent(String event, String resource, boolean modify) {
	   this(event, resource, FakeData.SITE_A_ID, modify, 3);
   }
   
   public FakeEvent(String event, String resource, boolean modify, int priority) {
	   this(event, resource, FakeData.SITE_A_ID, modify, priority);
   }

   public FakeEvent(String event, String resource, String context, boolean modify, int priority) {
      super();
      this.event = event;
      this.modify = modify;
      this.priority = priority;
      this.resource = resource;
      this.context = context;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getEvent()
    */
   public String getEvent() {
      return event;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getModify()
    */
   public boolean getModify() {
      return modify;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getPriority()
    */
   public int getPriority() {
      return priority;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getResource()
    */
   public String getResource() {
      return resource;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getContext()
    */
   public String getContext() {
      return context;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getSessionId()
    */
   public String getSessionId() {
      return "sessionId";
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.sakaiproject.event.api.Event#getUserId()
    */
   public String getUserId() {
      return "userId";
   }

public Date getEventTime() {
	// TODO Auto-generated method stub
	return null;
}

}
