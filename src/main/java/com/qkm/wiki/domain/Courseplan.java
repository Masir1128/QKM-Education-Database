package com.qkm.wiki.domain;

import java.util.Date;

public class Courseplan {
    private Long id;

    private String name;

    private String des;

    private Date sdate;

    private Date edate;

    private String location;

    private String people;

    private String number;

    private String teacher;

    private String add1;

    private String add2;

    private String add3;

    private String add4;

    private String add5;

    private String add6;

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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
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

    public String getAdd5() {
        return add5;
    }

    public void setAdd5(String add5) {
        this.add5 = add5;
    }

    public String getAdd6() {
        return add6;
    }

    public void setAdd6(String add6) {
        this.add6 = add6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", des=").append(des);
        sb.append(", sdate=").append(sdate);
        sb.append(", edate=").append(edate);
        sb.append(", location=").append(location);
        sb.append(", people=").append(people);
        sb.append(", number=").append(number);
        sb.append(", teacher=").append(teacher);
        sb.append(", add1=").append(add1);
        sb.append(", add2=").append(add2);
        sb.append(", add3=").append(add3);
        sb.append(", add4=").append(add4);
        sb.append(", add5=").append(add5);
        sb.append(", add6=").append(add6);
        sb.append("]");
        return sb.toString();
    }
}