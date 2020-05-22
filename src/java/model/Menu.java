/*
* Menu.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package model;

/**
 * Article.<br>
 *
 * <pre>
 * Class mô tả đối tượng Article
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId.
 * . SetId.
 * . GetName.
 * . SetName.
 * . SetContent
 * . GetContent
 * . GetPrice.
 * . SetPrice.
 *
 * </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class Menu {

    /**
     * Store id.
     */
    private int id;
    /**
     * Store name.
     */
    private String name;
    /**
     * Store content.
     */
    private String content;
    /**
     * Store price.
     */
    private String price;

    public Menu() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param name
     * @param Content
     * @param price
     */
    public Menu(int id, String name, String content, String price) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.price = price;
    }

    /**
     * Get id.<br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id.<br>
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get name.<br>
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.<br>
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get content.<br>
     *
     * @return the content
     */

    public String getContent() {
        return content;
    }

    /**
     * Set content.<br>
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Get price.<br>
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Set price.<br>
     *
     * @param price the price
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
