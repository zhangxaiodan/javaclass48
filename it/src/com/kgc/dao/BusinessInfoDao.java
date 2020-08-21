package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessInfo;

/**
 * ��ҵע����Ϣ���ݷ��ʲ�
 * @author Administrator
 *
 */
public interface BusinessInfoDao {
	//��ѯ���е�ע����Ϣ
	public List<BusinessInfo> getAllBusiness();
	//��ҳ��ȡ������
	public int getCount(String name,Integer buid);
	//��ҳ��ȡע����Ϣ
	public List<BusinessInfo> getBusPage(String name,Integer buid,int from,int pageSize);
	//ע�ṫ˾��Ϣ
	public int addBusinessInfo(BusinessInfo b);	
	//�ж��Ƿ��ظ�
	public BusinessInfo getBusinessInfoByBuName(String name);
		
	//���ݹ�˾ȫ�Ʋ�ѯ����
	public BusinessInfo getBusinessInfoByName(String name);
		
	//�޸Ĺ�˾��Ϣ
	public int updateBusinessInfo(BusinessInfo b);
		
	//1.�޸Ĺ�˾��ƺ�һ�仰���ܹ�˾ ��id����ȥ
	public int updateBusinessInfo01(BusinessInfo b);
		
	//2.�޸Ĺ�˾logo ��id����ȥ
	public int updateBusinessInfo02(BusinessInfo b);
		
	//3.�޸Ĺ�˾��Ʒ��Ϣ
	public int updateBusinessInfo03(BusinessInfo b);
		
	//4.�޸Ĺ�˾��ϸ����
	public int updateBusinessInfo04(BusinessInfo b);
		
	//5.�޸Ĺ�˾���У��绰�����ͣ����򣬽׶Σ���ģ����ҳ
	public int updateBusinessInfo05(BusinessInfo b);

	//6.�޸Ĺ�˾��ʼ�ˣ���ʼ��ְλ����ʼ��΢������ʼ�˼��
	public int updateBusinessInfo06(BusinessInfo b);
		
	//��ҳ
	public int getCountBusinessInfo(String bucity,String budevelopment,String bubigjob);
		
	public List<BusinessInfo> getBusinessInfoByPage(String bucity,String budevelopment,String bubigjob,Integer from,Integer pageSize);	
	//���ݹ�˾id��ѯ��˾������Ϣ(����ְλ��Ϣ)
	public BusinessInfo getAllById(Integer brid);
	//���ݹ�˾�����ѯ��˾������Ϣ
	public BusinessInfo getBusinessInfoByEmail(String email);
}
