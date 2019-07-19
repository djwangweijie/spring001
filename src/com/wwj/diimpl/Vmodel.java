package com.wwj.diimpl;

import java.util.List;
import java.util.Map;

public class Vmodel {

	// 属性注入
	private  Vperson  vp;



	//构造方法注入
    private String vname;
    
    public Vmodel(){
    	
    };
    public Vmodel(String vname){
    		 this.vname = vname;
    }
    
    //复杂类型注入
    private Object[] arr;// 数组类型注入
    private List list;//list/set 类型注入
    private Map map;//map 注入

	public void setVname(String vname) {
		this.vname = vname;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
	public void setVp(Vperson vp) {
		this.vp = vp;
	}
	
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public Vperson getVp() {
		return vp;
	}
	public String getVname() {
		return vname;
	}
	public List getList() {
		return list;
	}
	public Map getMap() {
		return map;
	}
    
}
