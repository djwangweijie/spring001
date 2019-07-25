package com.wwi.proxy;
/**
 * 代理角色，代理角色需要有真实角色的引用
 * @author Yun
 *
 */
public class ProxyRole implements BuyCaiPiao {

	private BuyCaiPiao bcp;

	public ProxyRole(BuyCaiPiao  bcp) {
		// TODO Auto-generated constructor stub
		this.bcp = bcp;
	}

	@Override
	public void buy500w() {
		// TODO Auto-generated method stub
		bcp.buy500w();
	}

}
