package com.qkm.wiki.domain;

public class Usermessage {
    private Long id;

    private Long userid;

    private String avatar;

    private String role;

    private String agency;

    private String depart;

    private String email;

    private String des;

    private String add1;

    private String add2;

    private String add3;

    private String add4;

    private String add5;

    private String add6;

    private String add7;

    private String add8;

    private String add9;

    private String add10;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

    public String getAdd10() {
        return add10;
    }

    public void setAdd10(String add10) {
        this.add10 = add10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", avatar=").append(avatar);
        sb.append(", role=").append(role);
        sb.append(", agency=").append(agency);
        sb.append(", depart=").append(depart);
        sb.append(", email=").append(email);
        sb.append(", des=").append(des);
        sb.append(", add1=").append(add1);
        sb.append(", add2=").append(add2);
        sb.append(", add3=").append(add3);
        sb.append(", add4=").append(add4);
        sb.append(", add5=").append(add5);
        sb.append(", add6=").append(add6);
        sb.append(", add7=").append(add7);
        sb.append(", add8=").append(add8);
        sb.append(", add9=").append(add9);
        sb.append(", add10=").append(add10);
        sb.append("]");
        return sb.toString();
    }
}