package com.tuita.sdk.im.db.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import com.tuita.sdk.im.db.module.*;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.tuita.sdk.im.db.dao.ConfigDao;
import com.tuita.sdk.im.db.dao.ContactDao;
import com.tuita.sdk.im.db.dao.MessageHistoryDao;
import com.tuita.sdk.im.db.dao.MessageRecentDao;
import com.tuita.sdk.im.db.dao.NewFriendDao;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contactDaoConfig;
    private final DaoConfig messageHistoryDaoConfig;
    private final DaoConfig newFriendDaoConfig;
    private final DaoConfig messageRecentDaoConfig;
    private final DaoConfig configDaoConfig;
    private final DaoConfig groupDaoConfig;
    private final DaoConfig groupMembersDaoConfig;
    private final DaoConfig serviceMessageDaoConfig;
    private final DaoConfig serviceMessageRecentDaoConfig;
    private final DaoConfig cateDaoConfig;
    private final DaoConfig messageMidDaoConfig;
    private final DaoConfig messageFileDaoConfig;


    private final ContactDao contactDao;
    private final MessageHistoryDao messageHistoryDao;
    private final NewFriendDao newFriendDao;
    private final MessageRecentDao messageRecentDao;
    private final ConfigDao configDao;
    private final GroupDao groupDao;
    private final GroupMembersDao groupMembersDao;
    private final ServiceMessageDao serviceMessageDao;
    private final ServiceMessageRecentDao serviceMessageRecentDao;
    private final CateDao cateDao;
    private final MessageMidDao messageMidDao;
    private final MessageFileDao messageFileDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contactDaoConfig = daoConfigMap.get(ContactDao.class).clone();
        contactDaoConfig.initIdentityScope(type);

        messageHistoryDaoConfig = daoConfigMap.get(MessageHistoryDao.class).clone();
        messageHistoryDaoConfig.initIdentityScope(type);

        newFriendDaoConfig = daoConfigMap.get(NewFriendDao.class).clone();
        newFriendDaoConfig.initIdentityScope(type);

        messageRecentDaoConfig = daoConfigMap.get(MessageRecentDao.class).clone();
        messageRecentDaoConfig.initIdentityScope(type);

        configDaoConfig = daoConfigMap.get(ConfigDao.class).clone();
        configDaoConfig.initIdentityScope(type);
        
        groupDaoConfig = daoConfigMap.get(GroupDao.class).clone();
        groupDaoConfig.initIdentityScope(type);

        groupMembersDaoConfig = daoConfigMap.get(GroupMembersDao.class).clone();
        groupMembersDaoConfig.initIdentityScope(type);

        serviceMessageDaoConfig = daoConfigMap.get(ServiceMessageDao.class).clone();
        serviceMessageDaoConfig.initIdentityScope(type);
        
        serviceMessageRecentDaoConfig = daoConfigMap.get(ServiceMessageRecentDao.class).clone();
        serviceMessageRecentDaoConfig.initIdentityScope(type);

        cateDaoConfig = daoConfigMap.get(CateDao.class).clone();
        cateDaoConfig.initIdentityScope(type);

        messageMidDaoConfig = daoConfigMap.get(MessageMidDao.class).clone();
        messageMidDaoConfig.initIdentityScope(type);

        messageFileDaoConfig = daoConfigMap.get(MessageFileDao.class).clone();
        messageFileDaoConfig.initIdentityScope(type);
        
        contactDao = new ContactDao(contactDaoConfig, this);
        messageHistoryDao = new MessageHistoryDao(messageHistoryDaoConfig, this);
        newFriendDao = new NewFriendDao(newFriendDaoConfig, this);
        messageRecentDao = new MessageRecentDao(messageRecentDaoConfig, this);
        configDao = new ConfigDao(configDaoConfig, this);
        groupDao = new GroupDao(groupDaoConfig, this);
        groupMembersDao = new GroupMembersDao(groupMembersDaoConfig, this);
        serviceMessageDao = new ServiceMessageDao(serviceMessageDaoConfig, this);
        serviceMessageRecentDao = new ServiceMessageRecentDao(serviceMessageRecentDaoConfig, this);
        cateDao = new CateDao(cateDaoConfig, this);
        messageMidDao = new MessageMidDao(messageMidDaoConfig, this);
        messageFileDao = new MessageFileDao(messageFileDaoConfig, this);
        
        registerDao(Contact.class, contactDao);
        registerDao(MessageHistory.class, messageHistoryDao);
        registerDao(NewFriend.class, newFriendDao);
        registerDao(MessageRecent.class, messageRecentDao);
        registerDao(Config.class, configDao);
        registerDao(Group.class, groupDao);
        registerDao(GroupMembers.class, groupMembersDao);
        registerDao(ServiceMessage.class, serviceMessageDao);
        registerDao(ServiceMessageRecent.class, serviceMessageRecentDao);
        registerDao(Cate.class, cateDao);
        registerDao(MessageMid.class, messageMidDao);
        registerDao(MessageFile.class, messageFileDao);
    }
    
//    public void clear() {
//        contactDaoConfig.getIdentityScope().clear();
//        messageHistoryDaoConfig.getIdentityScope().clear();
//        newFriendDaoConfig.getIdentityScope().clear();
//        messageRecentDaoConfig.getIdentityScope().clear();
//        configDaoConfig.getIdentityScope().clear();
//        groupDaoConfig.getIdentityScope().clear();
//        groupMembersDaoConfig.getIdentityScope().clear();
//        serviceMessageDaoConfig.getIdentityScope().clear();
//        serviceMessageRecentDaoConfig.getIdentityScope().clear();
//    }

    public ContactDao getContactDao() {
        return contactDao;
    }

    public MessageHistoryDao getMessageHistoryDao() {
        return messageHistoryDao;
    }

    public NewFriendDao getNewFriendDao() {
        return newFriendDao;
    }

    public MessageRecentDao getMessageRecentDao() {
        return messageRecentDao;
    }

    public ConfigDao getConfigDao() {
        return configDao;
    }
    
    public GroupDao getGroupDao() {
        return groupDao;
    }

    public GroupMembersDao getGroupMembersDao() {
        return groupMembersDao;
    }
    
    public ServiceMessageDao getServiceMessageDao() {
        return serviceMessageDao;
    }
    
    public ServiceMessageRecentDao getServiceMessageRecentDao() {
        return serviceMessageRecentDao;
    }

    public CateDao getCateDao() {
        return cateDao;
    }

    public MessageMidDao getMessageMidDao() {
        return messageMidDao;
    }

    public MessageFileDao getMessageFileDao() {
        return messageFileDao;
    }
}
