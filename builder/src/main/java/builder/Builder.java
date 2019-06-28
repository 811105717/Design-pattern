package builder;

/**
 * @author xiaobai
 * @date 2019/6/28 11:17
 * @since 1.0
 * 建造者模式  我们常见的xxxBuilder  一般都是建造者模式的产物
 * 这种模式的一个特点就是我们可以一直给对象加点进行操作  最后调用build方法生成该对象
 * 说实话，建造者模式的链式写法很吸引人，但是，多写了很多“无用”的 builder 的代码，感觉这个模式没什么用。不
 * 过，当属性很多，而且有些必填，有些选填的时候，这个模式会使代码清晰很多。我们可以在 Builder 的构造方法中强制让调用者提供必填字段，
 * 还有，在 build() 方法中校验各个参数比在 User 的构造方法中校验，代码要优雅一些。
 *
 */
public class Builder {
    /**
     * 首先来一些属性
     */
    private String name;
    private Integer age;
    private String id;

    /**
     * 构造方法私有化  防止外部直接new 对象出来
     */
    private Builder(String name,String id,Integer age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * 用来生成对象的build方法  返回一个UserBulder对象，该对象是内部类对象  后续实现
     * @return 建造者根据用户配置建造好的对象
     */
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    /**
     * 用于构建的内部类对象 其属性与主类完全相同
     */
    public static class UserBuilder{
        /**
         * 与主类完全相同的属性
         */
        private String name;
        private Integer age;
        private String id;

        /**
         * 还是构造方法私有化
         */
        private UserBuilder(){}

        /**
         * 下面就是给每一个属性生成一个配置方法  每个方法返回的都是当前对象
         */
        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder id(String id){
            this.id = id;
            return this;
        }

        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder build(){
            //这里做一些判断等 例如
            if(null == name){
                throw new RuntimeException("用户名必填");
            }
            //当然还可以赋默认值等
            if(null == age){
                age = 10;
            }
            // 构建新对象
            return new Builder(name,id,age);
        }
    }

    /**
     * 这个是为了演示方便生成的toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
