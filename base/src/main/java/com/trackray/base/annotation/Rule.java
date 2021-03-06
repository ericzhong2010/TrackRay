package com.trackray.base.annotation;


import com.trackray.base.plugin.AbstractPlugin;
import com.trackray.base.plugin.CommonPlugin;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**
 * @author 浅蓝
 * @email blue@ixsec.org
 * @since 2019/1/8 12:28
 */
public @interface Rule {
    boolean enable() default true;  //是否在外部启用插件
    boolean websocket() default false;  //是否为websocket插件
    boolean sync() default false;   //是否为异步任务
    Param[] params() default {}; // 插件参数
    CommonPlugin.Type type() default CommonPlugin.Type.JSON;    //当使用commonplugin时返回给浏览器的文本类型
    CommonPlugin.Charset charset() default CommonPlugin.Charset.UTF8;   //使用commonplugin时返回给浏览器的文本编码
    String[] headers() default {};  //返回给浏览器时的response header
    String filename() default "";   //插件用于下载功能时返回的文件名
    String defaultPage() default "index";//MVC插件的默认页面
}
