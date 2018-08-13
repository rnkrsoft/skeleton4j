package javax.web.skeleton4j.service;

import javax.web.doc.DocScanner;
import javax.web.skeleton4j.authority.AuthorityExtractor;
import javax.web.skeleton4j.authority.AuthorityService;
import javax.web.skeleton4j.config.Skeleton4jConfig;
import javax.web.skeleton4j.pool.ModulePool;
import javax.web.skeleton4j.render.Skeleton4jPageRenderService;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by rnkrsoft.com on 2018/6/30.
 */
public interface Skeleton4jDependency {
    /**
     * 默认页面类存放包路径
     */
    String DEFAULT_PAGES = "javax.web.skeleton4j.pages";
    /**
     * 默认主题类存放包路径
     */
    String DEFAULT_THEMES = "javax.web.skeleton4j.themes";

    /**
     * 校验是否初始化
     * @return
     */
    boolean validateInit();
    /**
     * 获取当前配置对象
     *
     * @return 配置对象
     */
    Skeleton4jConfig getConfig();

    /**
     * 文档扫描器
     *
     * @return 文档扫描器
     */
    DocScanner getDocScanner();

    /**
     * 模块池
     *
     * @return 模块池
     */
    ModulePool getModulePool();

    /**
     * 页面包路径
     *
     * @return 页面包路径
     */
    List<String> getPagePackages();

    /**
     * 主题包包路径
     *
     * @return 主题包包路径
     */
    List<String> getThemePackages();

    /**
     * 获取支持的Skeleton4j版本号
     *
     * @return 版本号集合
     */
    Set<String> getSupportVersions();

    /**
     * 页面渲染服务
     * @return
     */
    Skeleton4jPageRenderService getPageRenderService();
    AuthorityService getAuthorityService();
    AuthorityExtractor getAuthorityExtractor();


    /**
     * 初始化核心服务
     *
     * @param config        配置对象
     * @param docScanner    文档扫描器 如果不存在，则自动使用DocScannerFactory创建实例
     * @param modulePool    模块池 如果模块池不存在则自动创建
     * @param pagePackages  页面包路径 页面路径默认需要包含javax.web.skeleton4j.page
     * @param themePackages 主题包路径 主题路径默认需要包含javax.web.skeleton4j.theme
     */
    void init(Skeleton4jConfig config, DocScanner docScanner, ModulePool modulePool, Collection<String> pagePackages, Collection<String> themePackages);

    /**
     * 扫描所有页面类
     */
    void scan();

    /**
     * 编译页面类为代码
     *
     * @param pageClass 页面类
     * @return 生成页面文件路径
     */
    File compile(Class pageClass);
}