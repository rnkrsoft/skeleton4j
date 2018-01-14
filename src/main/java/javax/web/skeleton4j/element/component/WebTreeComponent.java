package javax.web.skeleton4j.element.component;

/**
 * Created by devops4j on 2017/12/7.
 * 定义树图结构
 */
public interface WebTreeComponent extends WebFormableComponent , WebGroupableComponent{
    /**
     * 设置是否为多选
     * @param multiSelect
     */
    void setMultiSelect(boolean multiSelect);
    /**
     * 是否为多选
     * @return 多选
     */
    boolean isMultiSelect();

    /**
     * 设置树图展开
     * @param expand
     */
    void setExpand(boolean expand);

    /**
     * 树图是否为展开
     * @return
     */
    boolean isExpand();

    /**
     * 设置为下拉模式
     * @param dropdown
     */
    void setDropdown(boolean dropdown);

    /**
     * 是否为下拉模式
     * @return
     */
    boolean isDropdown();

}
