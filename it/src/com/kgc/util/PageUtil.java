package com.kgc.util;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳ������
 * @author Administrator
 *
 */
public class PageUtil<T> {
	private int pageIndex=1;//��ǰ��ҳ�롢�ڼ�ҳ
	private int pageSize=20;//��ǰҳ�������(ÿҳ�ж�����)
	private int totalCount;//������(һ���ж�����)
	private int totalPage;//��ҳ��(һ���ж���ҳ)
	private List<T> list=new ArrayList<T>();//��ǰҳ���ݼ��� 
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
		//������ҳ��
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

