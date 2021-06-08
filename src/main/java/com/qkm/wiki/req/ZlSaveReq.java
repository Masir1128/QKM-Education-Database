package com.qkm.wiki.req;

import java.util.Date;

public class ZlSaveReq {
    private Long id;

    private String name;

    private Long category1;

    private Long category2;

    private Long category3;

    private String description;

    private String cover;

    private Integer viewcount;

    private Integer votecount;

    private Date dates;

    private String author;

    private String add1;

    private String add2;

    private String add3;

    private String add4;

    private Integer add5;

    private Integer add6;

    private Integer add7;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ZlSaveReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category1=" + category1 +
                ", category2=" + category2 +
                ", category3=" + category3 +
                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", viewcount=" + viewcount +
                ", votecount=" + votecount +
                ", dates=" + dates +
                ", author='" + author + '\'' +
                ", add1='" + add1 + '\'' +
                ", add2='" + add2 + '\'' +
                ", add3='" + add3 + '\'' +
                ", add4='" + add4 + '\'' +
                ", add5=" + add5 +
                ", add6=" + add6 +
                ", add7=" + add7 +
                ", content='" + content + '\'' +
                '}';
    }

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory1() {
        return category1;
    }

    public void setCategory1(Long category1) {
        this.category1 = category1;
    }

    public Long getCategory2() {
        return category2;
    }

    public void setCategory2(Long category2) {
        this.category2 = category2;
    }

    public Long getCategory3() {
        return category3;
    }

    public void setCategory3(Long category3) {
        this.category3 = category3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getVotecount() {
        return votecount;
    }

    public void setVotecount(Integer votecount) {
        this.votecount = votecount;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getAdd3() {
        return add3;
    }

    public void setAdd3(String add3) {
        this.add3 = add3;
    }

    public String getAdd4() {
        return add4;
    }

    public void setAdd4(String add4) {
        this.add4 = add4;
    }

    public Integer getAdd5() {
        return add5;
    }

    public void setAdd5(Integer add5) {
        this.add5 = add5;
    }

    public Integer getAdd6() {
        return add6;
    }

    public void setAdd6(Integer add6) {
        this.add6 = add6;
    }

    public Integer getAdd7() {
        return add7;
    }

    public void setAdd7(Integer add7) {
        this.add7 = add7;
    }

}