package com.wwi.proxy;

public class TestProxy {

		public static void main(String[] args) {
			//构建真实角色
			RealRole  r  = new RealRole();
			//构建代理角色（传入需要被代理的角色）
			ProxyRole  p = new ProxyRole(r);
			//代理角色执行 （这件事是发生在代理身上的，也就意味着风险的承担方是代理角色）
			//从侧方面也可以看到(我们可以额外的在附加其它的动作,而这些都是发生在代理角色身上)
			//从代码方面看来,是否是我们尽量做类的代码增或者减，尽量的去避免源对象的改变
		    p.buy500w();
		}
}
