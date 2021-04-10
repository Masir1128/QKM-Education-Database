package com.qkm.wiki.domain;

public class Task {
    private Long id;

    private String taskname;

    private Long taskcategory1Id;

    private Long taskcategory2Id;

    private String taskdescription;

    private Integer taskdocCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public Long getTaskcategory1Id() {
        return taskcategory1Id;
    }

    public void setTaskcategory1Id(Long taskcategory1Id) {
        this.taskcategory1Id = taskcategory1Id;
    }

    public Long getTaskcategory2Id() {
        return taskcategory2Id;
    }

    public void setTaskcategory2Id(Long taskcategory2Id) {
        this.taskcategory2Id = taskcategory2Id;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public Integer getTaskdocCount() {
        return taskdocCount;
    }

    public void setTaskdocCount(Integer taskdocCount) {
        this.taskdocCount = taskdocCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskname=").append(taskname);
        sb.append(", taskcategory1Id=").append(taskcategory1Id);
        sb.append(", taskcategory2Id=").append(taskcategory2Id);
        sb.append(", taskdescription=").append(taskdescription);
        sb.append(", taskdocCount=").append(taskdocCount);
        sb.append("]");
        return sb.toString();
    }
}