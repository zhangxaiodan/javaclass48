package com.kgc.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页泛型类
 * @author Administrator
 *
 */
public class PageUtil<T> {
	private int pageIndex=1;//当前的页码、第几页
	private int pageSize=20;//当前页码的条数(每页有多少条)
	private int totalCount;//总条数(一共有多少条)
	private int totalPage;//总页数(一共有多少页)
	private List<T> list=new ArrayList<T>();//当前页数据集合 
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		//计算总页数
		if(this.totalCount%this.pageSize==0){
			this.totalPage=this.totalCount/this.pageSize;
		}else{
			this.totalPage=this.totalCount/this.pageSize+1;
		}
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}

