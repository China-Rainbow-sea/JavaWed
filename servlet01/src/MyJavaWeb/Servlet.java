package MyJavaWeb;

/**
 * 我们现在充当的角色是SUN公司。
 * SUN公司把Server 接口/规范制定出来了。
 */
public interface Servlet {
    // 一个专门提供服务的方法
    public abstract void service();
}
