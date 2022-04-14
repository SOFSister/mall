package com.feedsheep.mall.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Soft_Sister
 * @version : 1.0
 * @Project : mall
 * @Package : com.feedsheep.mall.pojo
 * @ClassName : Category.java
 * @createTime : 2022/4/15 0:51
 * @Email : 874280179@qq.com
 * @Description :
 * CREATE TABLE `mall_category` (
 *   `id` int NOT NULL AUTO_INCREMENT COMMENT '类别Id',
 *   `parent_id` int DEFAULT NULL COMMENT '父类别id当id=0时说明是根节点,一级类别',
 *   `name` varchar(50) DEFAULT NULL COMMENT '类别名称',
 *   `status` tinyint(1) DEFAULT '1' COMMENT '类别状态1-正常,2-已废弃',
 *   `sort_order` int DEFAULT NULL COMMENT '排序编号,同类展示顺序,数值相等则自然排序',
 *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 *   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=100031 DEFAULT CHARSET=utf8mb3;
 */
public class Category {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;

    public Category() {
    }

    public Category(Integer id, Integer parentId, String name, Integer status, Integer sortOrder, Date createTime, Date updateTime) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.sortOrder = sortOrder;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(parentId, category.parentId) && Objects.equals(name, category.name) && Objects.equals(status, category.status) && Objects.equals(sortOrder, category.sortOrder) && Objects.equals(createTime, category.createTime) && Objects.equals(updateTime, category.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, name, status, sortOrder, createTime, updateTime);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", sortOrder=" + sortOrder +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

}
