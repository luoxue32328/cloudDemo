package org.example.pojo;

/**
 * @author xiaqi
 * @version 1.0
 * @date 2020/6/12 13:57
 */

public class Product {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {
    }
}
