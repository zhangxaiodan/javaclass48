package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.LikeInfo;

public interface LikeInfoDao {
	//�ҵĶ���ְλ
		public int addLikeInfo(LikeInfo info);
		 //��ѯ�ҵĶ���
		public List<LikeInfo> getAllLikeInfo(Integer from,Integer pageSize);
		//ɾ������ְλ
		public int delsubscribe(Integer id);
		//��ȡ��������
		public int getcountbyLikeInfo();
}