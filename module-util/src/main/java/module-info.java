/**
 * @author zk
 * @date 2019-08-28 15:59
 */
module module.util {

    /**
     * 在导出模块exports的时候，可以使用to关键字指明导出
     * 的模块只能供哪个模块使用。当然可以指定多个模块,使用逗号
     *
     * requires static 语句
     requires 进来的模块可以同时在编译期和运行期访问。如果只想在编译器使用，
     可以在requires 后面增加 static 关键字。比如模块a依赖了模块b但是并不使用b其中
     的类，另一个模块c依赖了a模块也使用了b模块的类。这样模块a的图中并不包含模块b。
     */
    exports com.onyx.util2 to module.api;

}