package com.qkm.wiki.domain;

/**
 * @Masir Description:
 * IO:
 */
public class Tstask4 {
    private Long id;

    private String taskId;

    private String name;

    private Integer T1;
    private Integer T2;
    private Integer T3;
    private Integer T4;

    private Integer T5;
    private Integer T6;
    private Integer T7;
    private Integer T8;
    private Integer T9;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", T1=").append(T1);
        sb.append(", T2=").append(T2);
        sb.append(", T3=").append(T3);
        sb.append(", T4=").append(T4);
        sb.append(", T5=").append(T5);
        sb.append(", T6=").append(T6);
        sb.append(", T7=").append(T7);
        sb.append(", T8=").append(T8);
        sb.append(", T9=").append(T9);
        sb.append("]");
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getT1() {
        return T1;
    }

    public void setT1(Integer t1) {
        T1 = t1;
    }

    public Integer getT2() {
        return T2;
    }

    public void setT2(Integer t2) {
        T2 = t2;
    }

    public Integer getT3() {
        return T3;
    }

    public void setT3(Integer t3) {
        T3 = t3;
    }

    public Integer getT4() {
        return T4;
    }

    public void setT4(Integer t4) {
        T4 = t4;
    }

    public Integer getT5() {
        return T5;
    }

    public void setT5(Integer t5) {
        T5 = t5;
    }

    public Integer getT6() {
        return T6;
    }

    public void setT6(Integer t6) {
        T6 = t6;
    }

    public Integer getT7() {
        return T7;
    }

    public void setT7(Integer T7) {
        T7 = T7;
    }

    public Integer getT8() {
        return T8;
    }

    public void setT8(Integer t8) {
        T8 = t8;
    }

    public Integer getT9() {
        return T9;
    }

    public void setT9(Integer t9) {
        T9 = t9;
    }

}
