package com.kgc.test;
import com.kgc.pojo.BusinessInfo;
import com.kgc.service.BusinessInfoService;
import com.kgc.util.PageUtil;








public class Test {
	public static void main(String[] args) {
		BusinessInfoService bs=new BusinessInfoService();
		//调用分页业务
			PageUtil<BusinessInfo> page=bs.getBusiness("", -1, 2, 3);
				System.out.println("当前页数："+page.getPageIndex());
				System.out.println("每页的条数："+page.getPageSize());
				System.out.println("总条数："+page.getTotalCount());
				System.out.println("总页数："+page.getTotalPage());
				for(BusinessInfo n:page.getList()){
					System.out.println("地址:"+n.getBuPicture()+""+n.getPrPicture());
				}
		}
	}
			

