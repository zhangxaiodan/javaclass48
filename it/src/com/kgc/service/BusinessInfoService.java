package com.kgc.service;

import java.util.List;

import com.kgc.dao.BusinessInfoDao;
import com.kgc.dao.impl.BusinessInfoDaoImpl;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.util.PageUtil;

/**
 * ҵ���߼���
 * @author Administrator
 *
 */
public class BusinessInfoService {
	BusinessInfoDao dao=new BusinessInfoDaoImpl();
	
	//��ѯ���е�ע����ҵ��Ϣ
	public List<BusinessInfo> getAllBusiness() {
			return dao.getAllBusiness();
		}
	
	//������ҳ����
	public PageUtil<BusinessInfo> getBusiness(String name,int buid,int pageIndex,int pageSize){
		//������ҳ����
		PageUtil<BusinessInfo> page=new PageUtil<BusinessInfo>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		int totalCount=dao.getCount(name, buid);
		page.setTotalCount(totalCount);
		List<BusinessInfo> list=dao.getBusPage(name, buid, (pageIndex-1)*pageSize, pageSize);	
		page.setList(list);
		return page;
	}
	public int addBusinessInfo(BusinessInfo b) {
		//�ж��Ƿ��ظ�
		if(dao.getBusinessInfoByBuName(b.getBuName())!=null){
			return 0;//�ظ�
		}else{
			int n=dao.addBusinessInfo(b);
			if(n>0){
				return 1;
			}
			else{
				return -1;
			}
		}	
	}
	
	
	//���ݹ�˾ȫ�Ʋ�ѯ����
	public BusinessInfo getBusinessInfoByName(String name){
		return dao.getBusinessInfoByName(name);
	}
	
	//�޸Ĺ�˾��Ϣ
	public int updateBusinessInfo(BusinessInfo b){
		
		if(dao.getBusinessInfoByBuName(b.getBuName())!=null){
			return 0;//�ظ�
		}else{
			int n=dao.updateBusinessInfo(b);
			if(n>0){
				return 1;
			}
			else{
				return -1;
			}
		}	
	}
		
		/**
		 * 1.�޸Ĺ�˾��ƺ�һ�仰���ܹ�˾ ��id����ȥ
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo01(BusinessInfo b){
			int n=dao.updateBusinessInfo01(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}	
		
		/**
		 * 2.�޸Ĺ�˾logo ��id����ȥ
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo02(BusinessInfo b){			
			int n=dao.updateBusinessInfo02(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}	
	
		/**
		 * 3.�޸Ĺ�˾��Ʒ��Ϣ
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo03(BusinessInfo b){
			int n=dao.updateBusinessInfo03(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}
	
		/**
		 * 4.�޸Ĺ�˾��ϸ����
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo04(BusinessInfo b) {
			int n=dao.updateBusinessInfo04(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}
		
		/**
		 * 5.�޸Ĺ�˾���У��绰�����ͣ����򣬽׶Σ���ģ����ҳ
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo05(BusinessInfo b) {
			int n=dao.updateBusinessInfo05(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}

		/**
		 * 6.�޸Ĺ�˾��ʼ�ˣ���ʼ��ְλ����ʼ��΢������ʼ�˼��
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo06(BusinessInfo b) {
			int n=dao.updateBusinessInfo06(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}
		
		
		//��ҳ
		public PageUtil<BusinessInfo> getBusinessInfoByPage(String bucity,String budevelopment, String bubigjob, Integer pageIndex,Integer pageSize) {
			PageUtil<BusinessInfo> page=new PageUtil<BusinessInfo>();
			page.setPageIndex(pageIndex);
			page.setPageSize(pageSize);
			//������
			int totalCount=dao.getCountBusinessInfo(bucity, budevelopment, bubigjob);
			page.setTotalCount(totalCount);
			//��ǰҳ����
			List<BusinessInfo> list=dao.getBusinessInfoByPage(bucity, budevelopment, bubigjob, (pageIndex-1)*pageSize, pageSize);
			page.setList(list);
			return page;
		}
		
		
		
		//���ݹ�˾id��ѯ��˾������Ϣ(����ְλ��Ϣ)
		public BusinessInfo getAllById(Integer brid) {
			return dao.getAllById(brid);
		}
		
		
		
		public int getBusinessInfoByBuName(String name) {
			//�ж��Ƿ��ظ�
			if(dao.getBusinessInfoByBuName(name)!=null){
				return -1;//�ظ�
			}else{
				return 1;
			}	
		}


		
		/*public static void main(String[] args) {
			String name="��Ѷ�ɷ����޹�˾";
			if(dao.getBusinessInfoByBuName(name)!=null){
				System.out.println("�ظ�");
			}else{
				System.out.println("���ظ�");;
			}
			
			
		}*/
		/**
		 * ���ݹ�˾�û�����ѯ����(�Ѿ�ע�ṫ˾ʹ��)
		 * @param 
		 * @return
		 */
		public BusinessInfo getBusinessInfoByEmail(String email){
			return dao.getBusinessInfoByEmail(email);
		}
}
