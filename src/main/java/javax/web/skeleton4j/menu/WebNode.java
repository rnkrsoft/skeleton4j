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
package javax.web.skeleton4j.menu;

import lombok.Data;

import javax.web.skeleton4j.module.WebModule;

/**
 * Created by rnkrsoft.com on 2017/10/9.
 */
@Data
public class WebNode {
    @Override
    public String toString() {
        return "WebNode{" +
                "priority=" + priority +
                ", name='" + getName() + '\'' +
                ", title='" + title + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }

    protected int priority = 0;
    /**
     * 图标 字体或者图片路径classpath*:com.rnkrsoft.xxx.png
     */
    protected String icon;
    /**
     * 菜单英文名称
     */
    protected String name;
    /**
     * 菜单展示名称
     */
    protected String title;
    /**
     * 状态
     */
    protected int status;
    /**
     * 是否使用权限
     */
    protected boolean useAuthority;
    /**
     * 是否隐藏
     */
    protected boolean hidden;
    /**
     * 是否展开
     */
    protected boolean expand;
    /**
     * 所属模块
     */
    protected WebModule module;
    /**
     * 父菜单
     */
    protected String parent;
    /**
     * product/action/version构成叶子菜单的最终访问路径，与Skeleton4jService的page方法入参一致
     */
    protected String product;
    /**
     *  功能
     */
    protected String action;
    /**
     * 版本号
     */
    protected String version;

    public String getName() {
        if (name == null) {
            return product + "/" + action + "/" + version;
        } else {
            return name;
        }
    }

    public static WebNodeBuilder nodeBuilder() {
        return new WebNodeBuilder();
    }

    public static class WebNodeBuilder {
        int priority;
        /**
         * 图标 字体或者图片路径classpath*:com.rnkrsoft.xxx.png
         */
        String icon;
        /**
         * 菜单英文名称
         */
        String name;
        /**
         * 菜单展示名称
         */
        String title;
        /**
         * 状态
         */
        int status;
        /**
         * 是否使用权限
         */
        boolean useAuthority;
        /**
         * 是否隐藏
         */
        boolean hidden;
        /**
         * 是否展开
         */
        boolean expand;
        /**
         * 所属模块
         */
        WebModule module;
        /**
         * 父菜单
         */
        String parent;

        String product;

        String action;
        /**
         * 版本号
         */
        String version;

        public WebNodeBuilder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public WebNodeBuilder icon(String icon) {
            this.icon = icon;
            return this;
        }

        public WebNodeBuilder title(String title) {
            this.title = title;
            return this;
        }

        public WebNodeBuilder status(int status) {
            this.status = status;
            return this;
        }

        public WebNodeBuilder useAuthority(boolean useAuthority) {
            this.useAuthority = useAuthority;
            return this;
        }

        public WebNodeBuilder hidden(boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public WebNodeBuilder expand(boolean expand) {
            this.expand = expand;
            return this;
        }

        public WebNodeBuilder module(WebModule module) {
            this.module = module;
            return this;
        }

        public WebNodeBuilder parent(String parent) {
            this.parent = parent;
            return this;
        }

        public WebNodeBuilder product(String product) {
            this.product = product;
            return this;
        }

        public WebNodeBuilder action(String action) {
            this.action = action;
            return this;
        }

        public WebNodeBuilder version(String version) {
            this.version = version;
            return this;
        }

        public WebNode build() {
            WebNode node = new WebNode();
            node.priority = priority;
            node.icon = icon;
            node.title = title;
            node.status = status;
            node.useAuthority = useAuthority;
            node.hidden = hidden;
            node.expand = expand;
            node.module = module;
            node.parent = parent;
            node.product = product;
            node.action = action;
            node.version = version;
            return node;
        }
    }
}
