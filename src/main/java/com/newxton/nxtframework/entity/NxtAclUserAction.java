package com.newxton.nxtframework.entity;

import java.io.Serializable;

/**
 * (NxtAclUserAction)实体类
 *
 * @author makejava
 * @since 2020-11-02 19:05:27
 */
public class NxtAclUserAction implements Serializable {
    private static final long serialVersionUID = 451969821262467815L;
    
    private Long id;
    
    private Long userId;
    
    private Long actionId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

}