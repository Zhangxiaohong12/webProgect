package easycode.common.entity;


/**
 * (Categories)表实体类
 *
 * @author makejava
 * @since 2018-09-07 10:57:16
 */
public class Categories {
    
    private String categoriesId;
    
    private String categoriesName;
    
    private Object categoriesOrder;
    
    private Object categoriesStatus;


    public String getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(String categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }

    public Object getCategoriesOrder() {
        return categoriesOrder;
    }

    public void setCategoriesOrder(Object categoriesOrder) {
        this.categoriesOrder = categoriesOrder;
    }

    public Object getCategoriesStatus() {
        return categoriesStatus;
    }

    public void setCategoriesStatus(Object categoriesStatus) {
        this.categoriesStatus = categoriesStatus;
    }

}