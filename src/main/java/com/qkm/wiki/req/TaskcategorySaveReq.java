package com.qkm.wiki.req;

public class TaskcategorySaveReq {
    private Long id;

    private String name;

    private Long parent;

    private Long parent2;

    private Long parent3;

    private Integer taskCount;

    private Integer tasksort;

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

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getParent2() {
        return parent2;
    }

    public void setParent2(Long parent2) {
        this.parent2 = parent2;
    }

    public Long getParent3() {
        return parent3;
    }

    public void setParent3(Long parent3) {
        this.parent3 = parent3;
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public Integer getTasksort() {
        return tasksort;
    }

    public void setTasksort(Integer tasksort) {
        this.tasksort = tasksort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parent=").append(parent);
        sb.append(", parent2=").append(parent2);
        sb.append(", parent3=").append(parent3);
        sb.append(", taskCount=").append(taskCount);
        sb.append(", tasksort=").append(tasksort);
        sb.append("]");
        return sb.toString();
    }
}