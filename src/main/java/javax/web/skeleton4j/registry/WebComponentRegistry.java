/**
 * RNKRSOFT OPEN SOURCE SOFTWARE LICENSE TERMS ver.1
 * - 氡氪网络科技(重庆)有限公司 开源软件许可条款(版本1)
 * 氡氪网络科技(重庆)有限公司 以下简称Rnkrsoft。
 * 这些许可条款是 Rnkrsoft Corporation（或您所在地的其中一个关联公司）与您之间达成的协议。
 * 请阅读本条款。本条款适用于所有Rnkrsoft的开源软件项目，任何个人或企业禁止以下行为：
 * .禁止基于删除开源代码所附带的本协议内容、
 * .以非Rnkrsoft的名义发布Rnkrsoft开源代码或者基于Rnkrsoft开源源代码的二次开发代码到任何公共仓库,
 * 除非上述条款附带有其他条款。如果确实附带其他条款，则附加条款应适用。
 * <p/>
 * 使用该软件，即表示您接受这些条款。如果您不接受这些条款，请不要使用该软件。
 * 如下所述，安装或使用该软件也表示您同意在验证、自动下载和安装某些更新期间传输某些标准计算机信息以便获取基于 Internet 的服务。
 * <p/>
 * 如果您遵守这些许可条款，将拥有以下权利。
 * 1.阅读源代码和文档
 * 如果您是个人用户，则可以在任何个人设备上阅读、分析、研究Rnkrsoft开源源代码。
 * 如果您经营一家企业，则禁止在任何设备上阅读Rnkrsoft开源源代码,禁止分析、禁止研究Rnkrsoft开源源代码。
 * 2.编译源代码
 * 如果您是个人用户，可以对Rnkrsoft开源源代码以及修改后产生的源代码进行编译操作，编译产生的文件依然受本协议约束。
 * 如果您经营一家企业，不可以对Rnkrsoft开源源代码以及修改后产生的源代码进行编译操作。
 * 3.二次开发拓展功能
 * 如果您是个人用户，可以基于Rnkrsoft开源源代码进行二次开发，修改产生的元代码同样受本协议约束。
 * 如果您经营一家企业，不可以对Rnkrsoft开源源代码进行任何二次开发，但是可以通过联系Rnkrsoft进行商业授予权进行修改源代码。
 * 完整协议。本协议以及开源源代码附加协议，共同构成了Rnkrsoft开源软件的完整协议。
 * <p/>
 * 4.免责声明
 * 该软件按“原样”授予许可。 使用本文档的风险由您自己承担。Rnkrsoft 不提供任何明示的担保、保证或条件。
 * 5.版权声明
 * 本协议所对应的软件为 Rnkrsoft 所拥有的自主知识产权，如果基于本软件进行二次开发，在不改变本软件的任何组成部分的情况下的而二次开发源代码所属版权为贵公司所有。
 */
package javax.web.skeleton4j.registry;

import javax.web.doc.ElementInfo;
import javax.web.skeleton4j.element.WebElement;
import javax.web.skeleton4j.page.WebPage;
import javax.web.skeleton4j.script.WebScript;
import javax.web.skeleton4j.style.WebStyle;
import javax.web.skeleton4j.theme.WebThemePack;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2017/12/12.
 * web组件注册表
 */
public interface WebComponentRegistry {
    /**
     * 获取支持的组件列表
     *
     * @return 组件列表
     */
    Set<Class> getSupportedComponents();

    /**
     * 获取指定主题对象
     *
     * @param theme 主题名
     * @return 主题对象
     */
    WebThemePack getThemePack(String theme);

    /**
     * 列出所有主题对象
     *
     * @return 主题对象列表
     */
    List<WebThemePack> listThemePacks();

    /**
     * 注册组件
     *
     * @param theme 主题名
     * @param desc 主题名
     * @param webThemeClassName 主题类名
     * @param componentImplement 组件实现
     */
    void register(String theme, String desc, String webThemeClassName, Class componentImplement);

    /**
     * 注册组件
     *
     * @param theme 主题名
     * @param desc 主题描述
     * @param webThemeClassName 主题类名
     * @param componentInterface 组件接口
     * @param componentImplement 组件实现
     */
    void register(String theme, String desc, String webThemeClassName, Class componentInterface, Class componentImplement);

    /**
     * 注册组件
     *
     * @param theme 主题名
     * @param componentInterface 组件接口
     * @param scripts 脚本
     * @param styles 样式
     */
    void register(String theme, Class componentInterface, Set<WebScript> scripts, Set<WebStyle> styles);

    /**
     * @param namespace 命名空间
     * @param theme 主题名
     * @param componentInterface 组件接口
     * @param column 字段对象
     * @param parentID 上一级ID
     * @param name 组件名
     * @param <T> 组件
     * @return 组件
     */
    <T extends WebElement> T newComponent(WebPage webPage, String namespace, String theme, Class<T> componentInterface, ElementInfo column, String parentID, String name);

    /**
     * 根据字段定义创建Web组件对象
     *
     * @param namespace          命名空间
     * @param theme              主题名
     * @param componentInterface 组件接口
     * @param column             字段对象
     * @param parentID           上一级ID
     * @param <T> 组件
     * @return 组件
     */
    <T extends WebElement> T newComponent(WebPage webPage, String namespace, String theme, Class<T> componentInterface, ElementInfo column, String parentID);

    /**
     * 根据输入的组件元素构建出一个新的组件
     *
     * @param theme     主题名
     * @param component 组件
     * @param <T>       组件
     * @return 组件
     */
    <T extends WebElement> T newComponent(String theme, T component);


}
