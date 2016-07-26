package com.rus.chat.repositories.conversations.datasource

import com.rus.chat.entity.conversation.Conversation
import com.rus.chat.entity.conversation.User
import com.rus.chat.entity.query.Handle
import com.rus.chat.entity.query.BaseQuery
import com.rus.chat.entity.query.conversations.ConversationsQuery
import com.rus.chat.entity.response.ConversationResponse
import rx.Observable

/**
 * Created by RUS on 17.07.2016.
 */
interface ConversationsDataSource {

    @Handle(ConversationsQuery.Initialize::class)
    fun initializeEventListener(query: ConversationsQuery.Initialize): Observable<ConversationResponse.Response>

    @Handle(ConversationsQuery.CreateConversation::class)
    fun createConversation(query: ConversationsQuery.CreateConversation): Observable<Conversation>

}