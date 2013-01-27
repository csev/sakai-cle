/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/search/trunk/search-impl/impl/src/java/org/sakaiproject/search/transaction/api/TransactionListener.java $
 * $Id: TransactionListener.java 105078 2012-02-24 23:00:38Z ottenhoff@longsight.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 The Sakai Foundation
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

package org.sakaiproject.search.transaction.api;

import org.sakaiproject.search.indexer.api.IndexJournalException;

/**
 * This listener is notified of changes in the transaction state.
 * 
 * @author ieb
 */
public interface TransactionListener
{
	/**
	 * Prepare to commit the transaction
	 * 
	 * @param transaction
	 * @throws IndexJournalException
	 */
	void prepare(IndexTransaction transaction) throws IndexTransactionException;

	/**
	 * @param transaction
	 * @throws IndexTransactionException
	 */
	void commit(IndexTransaction transaction) throws IndexTransactionException;

	/**
	 * @param transaction
	 */
	void rollback(IndexTransaction transaction) throws IndexTransactionException;

	/**
	 * @param transaction
	 */
	void open(IndexTransaction transaction) throws IndexTransactionException;

	/**
	 * @param transaction
	 */
	void close(IndexTransaction transaction) throws IndexTransactionException;

}