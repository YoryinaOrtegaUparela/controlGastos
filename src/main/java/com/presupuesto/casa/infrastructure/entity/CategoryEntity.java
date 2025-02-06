package com.presupuesto.casa.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Table(name = "CategoryEntity",schema = "EXPENSES")
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String categoryName;

    @OneToMany(mappedBy="subCategoryName")
    private Set<SubCategoryEntity> subCategories;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<SubCategoryEntity> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<SubCategoryEntity> subCategory) {
        this.subCategories = subCategory;
    }
}
