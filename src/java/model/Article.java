/*
* Artical.java
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
 * . GetTitle.
 * . SetTitle.
 * . GetImagePath.
 * . SetImagePath.
 * . SetShortContent
 * . GetShortContent
 * . GetFullContent.
 * . SetFullContent.
 *
 * </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class Article {

    /**
     * Store id.
     */
    private int id;
    /**
     * Store title.
     */
    private String title;
    /**
     * Store imagePath.
     */
    private String imagePath;
    /**
     * Store shortContent.
     */
    private String shortContent;
    /**
     * Store fullContent.
     */
    private String fullContent;

    public Article() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param title
     * @param imagePath
     * @param fullContent
     * @param shortContent
     */
    public Article(int id, String title, String imagePath, String shortContent, String fullContent) {
        this.id = id;
        this.title = title;
        this.imagePath = imagePath;
        this.shortContent = shortContent;
        this.fullContent = fullContent;
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
     * Get title.<br>
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title.<br>
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get imagePath.<br>
     *
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Set imagePath.<br>
     *
     * @param imagePath the imagePath
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * Get shortContent.<br>
     *
     * @return the shortContent
     */
    public String getShortContent() {
        return shortContent;
    }

    /**
     * Set shortContent.<br>
     *
     * @param shortContent the shortContent
     */
    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    /**
     * Get fullContent.<br>
     *
     * @return the fullContent
     */
    public String getFullContent() {
        return fullContent;
    }

    /**
     * Set fullContent.<br>
     *
     * @param fullContent the fullContent
     */
    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

}
