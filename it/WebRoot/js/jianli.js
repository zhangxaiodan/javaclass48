//������������
function expectFormSave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#expectForm").serialize()+"&op=ajaxupdate",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				alert("����ɹ���");
				location.reload();
			}else{
				alert("����ʧ�ܣ�");
			}
		}
	});
}
//���¹�������
function experienceFormsave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#experienceForm").serialize()+"&op=ajaxupdatejl",
		dataType:"text",
		type:"post",
		success:function(result){
			
			if(result==1){
				alert("���ӳɹ���");
				location.reload();
			}else{
                alert("����ʧ�ܣ�");
		    }
		}
	 });
}
//������Ŀ����
function projectFormsave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#projectForm").serialize()+"&op=ajaxupdatepj",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				alert("���ӳɹ���");
				location.reload();
			}else{
				alert("����ʧ�ܣ�");
			}
		}
	});
}
//���½�������
function educationalFormsave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#educationalForm").serialize()+"&op=ajaxupdateedu",
		dataType:"text",
		type:"post",
		success:function(result){
			
			if(result==1){
				alert("����ɹ���");
				location.reload();
			}else{
			alert("����ʧ�ܣ�");
			}
		}
	});
}

function descriptionFormsave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#descriptionForm").serialize()+"&op=ajaxintroduce",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				alert("����ɹ���");
				location.reload();
			}else{
				alert("����ʧ�ܣ�");
			}
		}
	});
}

function workFormsave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#workForm").serialize()+"&op=ajaxshow",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				alert("����ɹ���");
				location.reload();
			}else{
				alert("����ʧ�ܣ�");
			}
		}
	});
}
//�޸�����
function resumeNameFormSave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#resumeNameForm").serialize()+"&op=ajaxchange",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				//ˢ����ת
				location.href="jianli.jsp";
			}else{
				alert("����ʧ�ܣ�");
			}
		}
	});
}
//ȡ���ղ�
function collectionsFormsava(jno){
	var msg=window.confirm("�Ƿ�ȷ��ɾ���ղ�");
	if(msg==true){
		alert("ȷ��ɾ��");
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#collectionsForm").serialize()+"&op=ajaxdel"+"&jno="+jno,
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				location.href="collections.jsp";
			}else{
				alert("ɾ��ʧ�ܣ�");
			}
		}
	});
	}else{
		alert("��ɾ��");
	}
}
//����
function subFormSave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#subForm").serialize()+"&op=ajaxsub",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				location.href="subscribe01.jsp";
			}else{
				alert("����ʧ�ܣ�");
			}	
		}
	});
}
//ɾ������ְλ
function subscribeFormSave(){
	var msg=window.confirm("�Ƿ�ȷ��ɾ������ְλ");
	if(msg==true){
		alert("ȷ��ɾ��");
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#subscribeForm").serialize()+"&op=ajaxdeldy",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				location.href="subscribe01.jsp";
			}else{
				alert("ɾ��ʧ�ܣ�");
			}	
		}
	});
	}else{
		alert("��ɾ��");
	}
}
//������Ϣ
function profileFormSave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#profileForm").serialize()+"&op=basicinfo",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				location.href="jianli.jsp";
			}else{
				alert("����ʧ�ܣ�");
			}	
		}
	});
}

//Ͷ�ݼ���addrem
function addremSave(){
	$.ajax({
		url:"/it/UserResServlet.do",
		data:$("#addremm").serialize()+"&op=Ajaxaddremm",
		dataType:"text",
		type:"post",
		success:function(result){
			if(result==1){
				alert('Ͷ�ݳɹ�');
				location.href='toudi.jsp'; 	
			}else{
				alert("Ͷ��ʧ�ܣ�");
			}	
		}
	});
}