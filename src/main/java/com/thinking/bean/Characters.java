package com.thinking.bean;

import java.util.Date;

public class Characters {
    private Integer charactertype;

    private String charactername;

    private String depart;

    private Date createtime;

    private Boolean isdeleted;

    public Integer getCharactertype() {
        return charactertype;
    }

    public void setCharactertype(Integer charactertype) {
        this.charactertype = charactertype;
    }

    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername == null ? null : charactername.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}