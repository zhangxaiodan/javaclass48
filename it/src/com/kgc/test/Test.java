package com.kgc.test;
import com.kgc.pojo.BusinessInfo;
import com.kgc.service.BusinessInfoService;
import com.kgc.util.PageUtil;








public class Test {
	public static void main(String[] args) {
		BusinessInfoService bs=new BusinessInfoService();
		//���÷�ҳҵ��
			PageUtil<BusinessInfo> page=bs.getBusiness("", -1, 2, 3);
				System.out.println("��ǰҳ����"+page.getPageIndex());
				System.out.println("ÿҳ��������"+page.getPageSize());
				System.out.println("��������"+page.getTotalCount());
				System.out.println("��ҳ����"+page.getTotalPage());
				for(BusinessInfo n:page.getList()){
					System.out.println("��ַ:"+n.getBuPicture()+""+n.getPrPicture());
				}
		}
	}
			

