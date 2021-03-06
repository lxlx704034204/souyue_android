package com.tuita.sdk.im.db.module;

import java.io.Serializable;
import java.util.List;
import com.zhongsou.souyue.DontObfuscateInterface;



// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SERVICE_MESSAGE.
 */
public class ServiceMessage implements Serializable,DontObfuscateInterface{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5559188311869392431L;
	private Long id;
    private long myid;
    private long service_id;
    private Long cate_id;
    private String service_name;
    private String service_avatar;
    private String cate_name;
    private String cate_avatar;
    private String avatar;
    private String title;
    private String digst;
    private String image_url;
    private String exra;
    private String intent_data;
    private Integer detail_type;
    private Long date;
    private String by1;     //uuid 客户端唯一标识
    private String by2;     //nc 暂时为了取pushId "1,m,幼儿园,-1,1"
    private String by3;
    private String subDigst;    //5.0.5新增服务号订阅来源
//    private Boolean isShowNotify; //5.0.5新增是否显示通知栏   true显示，false不显示

//    public Boolean getIsShowNotify() {
//        return isShowNotify;
//    }
//
//    public void setIsShowNotify(Boolean is_show_notify) {
//        this.isShowNotify = isShowNotify;
//    }

    public String getSubDigst() {
        return subDigst;
    }

    public void setSubDigst(String subDigst) {
        this.subDigst = subDigst;
    }

    private List<ServiceMessageChild> mServiceMessageChilds;
    private List<String> imageUrls;

	public void appendmServiceMessageChilds(
			List<ServiceMessageChild> mServiceMessageChilds) {
		this.mServiceMessageChilds = mServiceMessageChilds;
	}
	public void appendImageUrls(
			List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public ServiceMessage() {
    }

    public ServiceMessage(Long id) {
        this.id = id;
    }

    public ServiceMessage(Long id, long myid, long service_id, Long cate_id, String service_name, String service_avatar, String cate_name, String cate_avatar, String avatar, String title, String digst, String image_url, String exra, String intent_data, Integer detail_type, Long date, String by1, String by2, String by3,String subDigst) {
        this.id = id;
        this.myid = myid;
        this.service_id = service_id;
        this.cate_id = cate_id;
        this.service_name = service_name;
        this.service_avatar = service_avatar;
        this.cate_name = cate_name;
        this.cate_avatar = cate_avatar;
        this.avatar = avatar;
        this.title = title;
        this.digst = digst;
        this.image_url = image_url;
        this.exra = exra;
        this.intent_data = intent_data;
        this.detail_type = detail_type;
        this.date = date;
        this.by1 = by1;
        this.by2 = by2;
        this.by3 = by3;
        this.subDigst = subDigst;
//        this.isShowNotify = isShowNotify;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMyid() {
        return myid;
    }

    public void setMyid(long myid) {
        this.myid = myid;
    }

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    public Long getCate_id() {
        return cate_id;
    }

    public void setCate_id(Long cate_id) {
        this.cate_id = cate_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getService_avatar() {
        return service_avatar;
    }

    public void setService_avatar(String service_avatar) {
        this.service_avatar = service_avatar;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public String getCate_avatar() {
        return cate_avatar;
    }

    public void setCate_avatar(String cate_avatar) {
        this.cate_avatar = cate_avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDigst() {
        return digst;
    }

    public void setDigst(String digst) {
        this.digst = digst;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getExra() {
        return exra;
    }

    public void setExra(String exra) {
        this.exra = exra;
    }

    public String getIntent_data() {
        return intent_data;
    }

    public void setIntent_data(String intent_data) {
        this.intent_data = intent_data;
    }

    public Integer getDetail_type() {
        return detail_type;
    }

    public void setDetail_type(Integer detail_type) {
        this.detail_type = detail_type;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    public String getBy3() {
        return by3;
    }

    public void setBy3(String by3) {
        this.by3 = by3;
    }
    
    public void AppendChild(ServiceMessageChild mChild)
    {
        mServiceMessageChilds.add(mChild);
    }
     
    public List<ServiceMessageChild> getChilds() 
    {
        return mServiceMessageChilds;
    }
    
    public List<String> getImageUrls() 
    {
        return imageUrls;
    }

}
