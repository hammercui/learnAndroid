> learnAndroid
> 主要记录我的android学习过程，包括源码及心得

# 2016/08/01  更新

增加greenDao的assets目录拷贝，即读取外部db文件功能
增加greenDao数据库的升级功能，保留数据

重构mainActiity,由点击button跳转，改为recycleview
数据来源于sqlite数据库。



# 2016/07/28  更新

重构了目录结构，按照如下的目录结构来划分功能
+ activity
+ adapters
+ dagger2
+ ado
+ entity
+ fragment
+ util
+ widget

分离了常用的依赖库，迁移到android-best-library这个module

`app`  module  
* 新增butterknife库，解决findviewById问题。
* LessonSixActivity做了典型的dagger2+butterknife+mvc+greenDao的实践。






# lesson 1 View Window DocerView学习
2016/01/21

首次提交，第一课学习View,DocerView,Window的关系，新建当前页的弹出页，屏蔽屏幕下层触摸

#   lesson 2 rxjava rxandroid rxbinding
2016/01/21

提交第二课，学习如何使用rxbinding,学会函数式响应式编程

2016/01/24
第二课的补充，正确使用了以下三个空间的rxbinding，CheckBox,EditText,Button，准备学习rxjava的变换功能
# lesson 3  toolbar
2016/01/26

学习了rxjava的变换功能。
提交第三课，学习AppBarLayout,Tablayout,ToolBar,完成可滑动收缩的导航条（toolbar）。
准备学习第四课，带图片背景的可滑动的导航条

#  lesson 5 旋转木马控件

2016/05/17 
提交lesson five,学习使用[LoopRotarySwitch](https://github.com/dalong982242260/LoopRotarySwitch)控件，一个旋转木马控件.

# lesson 6 GreenDao

2016/06/13 
greenDAO是一个对象关系映射（ORM）的框架，能够提供一个接口通过操作对象的方式去操作关系型数据库，它能够让你操作数据库时更简单、更方便。
使用greendao实现对象的持久化。greenDao操作sqliteDatabase,实现javaBean与数据表的映射。
![](http://greenrobot.org/wordpress/wp-content/uploads/greenDAO-orm-320.png)



新增greenDao的使用示例