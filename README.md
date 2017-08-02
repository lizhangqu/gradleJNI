### 使用Gradle与JNI结合的项目

 - 利用cpp插件编译C++代码
 - 利用application插件，添加java.library.path路径为动态库路径可直接通过gradle run运行
 - 利用jar任务，添加动态库到jar中，运行期获取classpath下的动态库，解压加载