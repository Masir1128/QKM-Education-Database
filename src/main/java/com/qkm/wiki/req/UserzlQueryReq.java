package com.qkm.wiki.req;

import java.util.Date;

public class UserzlQueryReq {
    private Long id;

    private String name;

    private String nameid;

    private String zlname;

    private String zldes;

    private String cover;

    private String author;

    private Integer view;

    private Integer vote;

    private Date dates;

    private Integer add1;

    private Integer add2;

    private Integer add3;

    private Integer add4;

    private Integer add5;

    private String add6;

    private String add7;

    private String add8;

    private String add9;

    private String add0;

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

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid;
    }

    public String getZlname() {
        return zlname;
    }

    public void setZlname(String zlname) {
        this.zlname = zlname;
    }

    public String getZldes() {
        return zldes;
    }

    public void setZldes(String zldes) {
        this.zldes = zldes;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public Integer getAdd1() {
        return add1;
    }

    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public Integer getAdd2() {
        return add2;
    }

    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }

    public Integer getAdd3() {
        return add3;
    }

    public void setAdd3(Integer add3) {
        this.add3 = add3;
    }

    public Integer getAdd4() {
        return add4;
    }

    public void setAdd4(Integer add4) {
        this.add4 = add4;
    }

    public Integer getAdd5() {
        return add5;
    }

    public void setAdd5(Integer add5) {
        this.add5 = add5;
    }

    public String getAdd6() {
        return add6;
    }

    public void setAdd6(String add6) {
        this.add6 = add6;
    }

    public String getAdd7() {
        return add7;
    }

    public void setAdd7(String add7) {
        this.add7 = add7;
    }

    public String getAdd8() {
        return add8;
    }

    public void setAdd8(String add8) {
        this.add8 = add8;
    }

    public String getAdd9() {
        return add9;
    }

    public void setAdd9(String add9) {
        this.add9 = add9;
    }

    public String getAdd0() {
        return add0;
    }

    public void setAdd0(String add0) {
        this.add0 = add0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", nameid=").append(nameid);
        sb.append(", zlname=").append(zlname);
        sb.append(", zldes=").append(zldes);
        sb.append(", cover=").append(cover);
        sb.append(", author=").append(author);
        sb.append(", view=").append(view);
        sb.append(", vote=").append(vote);
        sb.append(", dates=").append(dates);
        sb.append(", add1=").append(add1);
        sb.append(", add2=").append(add2);
        sb.append(", add3=").append(add3);
        sb.append(", add4=").append(add4);
        sb.append(", add5=").append(add5);
        sb.append(", add6=").append(add6);
        sb.append(", add7=").append(add7);
        sb.append(", add8=").append(add8);
        sb.append(", add9=").append(add9);
        sb.append(", add0=").append(add0);
        sb.append("]");
        return sb.toString();
    }
}