/*
* Information.java
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
 * . GetAddress.
 * . SetAddress.
 * . GetTel.
 * . SetTel.
 * . GetEmail.
 * . SetEmail.
 * . GetOpenday.
 * . SetOpenday.
 * . GetimagePath.
 * . SetimagePath.
 *
 * </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class Information {

    /**
     * Store id.
     */
    private int id;
    /**
     * Store address.
     */
    private String address;
    /**
     * Store tel.
     */
    private String tel;
    /**
     * Store email.
     */
    private String email;
    /**
     * Store openDay.
     */

    private String openDay;
    /**
     * Store imagePath.
     */
    private String imagePath;

    public Information() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param address
     * @param tel
     * @param email
     * @param openDay
     * @param imagePath
     *
     *
     */
    public Information(int id, String address, String tel, String email, String openDay, String imagePath) {
        this.id = id;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.openDay = openDay;
        this.imagePath = imagePath;
    }

    /**
     * Get id.<br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get address.<br>
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.<br>
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get tel.<br>
     *
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Set tel.<br>
     *
     * @param tel the tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Get email.<br>
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email.<br>
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get openDay.<br>
     *
     * @return the openDay
     */
    public String getOpenDay() {
        return openDay;
    }

    /**
     * Set openDay.<br>
     *
     * @param openDay the openDay
     */
    public void setOpenDay(String openDay) {
        this.openDay = openDay;
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

}
