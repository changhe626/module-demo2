Java模块和maven模块是两个维度的东西，互不干涉对方内政。
--


和maven搭配的时候，Java的模块是用来控制访问级别的，前面说过public关键字的能力降低到模块内了。
如果用到了Java模块（没用到就和Java9之前一样），就必须通过requires才能访问，及时它们在同一个maven项目内。
maven是用来组织项目的，它的能力和使用Java模块以前一样：管理依赖，构建项目。
不使用maven，在任何Java版本下这都是一件费力气的事情。

待完善

2019年8月28日17:31:10