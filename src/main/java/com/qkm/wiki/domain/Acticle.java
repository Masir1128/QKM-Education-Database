package com.qkm.wiki.domain;

import java.util.Date;

public class Acticle {
    private Long id;

    private Long zlId;

    private Long parent;

    private String name;

    private Integer sort;

    private Date date;

    private String add1;

    private String add2;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getZlId() {
        return zlId;
    }

    public void setZlId(Long zlId) {
        this.zlId = zlId;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", zlId=").append(zlId);
        sb.append(", parent=").append(parent);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", date=").append(date);
        sb.append(", add1=").append(add1);
        sb.append(", add2=").append(add2);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}