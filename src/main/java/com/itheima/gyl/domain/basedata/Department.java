package com.itheima.gyl.domain.basedata;

import java.io.Serializable;

public class Department implements Serializable {
    private long did;
    private String name;
    private String description;

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
